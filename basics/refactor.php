<?php

    switch($projectStatus) {
        case 'Payment Received':
            if(Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') == ''
                && Input::get('invoice_submitted_date') == ''
                && Input::get('payment_received') == '') {
                    $project->payment_received = 'Today';
                    $project->invoice_approval_date = 'Today';
                    $project->invoice_submitted_date = 'Today';
                    $project->project_submitted_date = 'Today';
            } else if (Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') != ''
                && Input::get('invoice_submitted_date') == ''
                && Input::get('payment_received') == '') {
                    $project->payment_received = 'Today';
                    $project->invoice_approval_date = 'Today';
                    $project->invoice_submitted_date = 'Today';
            } else if (Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') != ''
                && Input::get('invoice_submitted_date') != ''
                && Input::get('payment_received') == '') {
                    $project->payment_received = 'Today'
                    $project->invoice_approval_date = 'Today';
            } else if (Input::get('invoice_approval_date') != ''
                && Input::get('project_submitted_date') != ''
                && Input::get('invoice_submitted_date') != ''
                && Input::get('payment_received') == '') {
                    $project->payment_received = 'Today';
            }
            break;
        case 'Invoice Approved':
            if(Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') == ''
                && Input::get('invoice_submitted_date') == '') {
                    $project->invoice_approval_date = 'Today';
                    $project->invoice_submitted_date = 'Today';
                    $project->project_submitted_date = 'Today';
            } else if(Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') == ''
                && Input::get('invoice_submitted_date') != '')) {
                    $project->invoice_approval_date = 'Today';
                    $project->project_submitted_date = 'Today';
            } else if(Input::get('invoice_approval_date') == ''
                && Input::get('project_submitted_date') != ''
                && Input::get('invoice_submitted_date') != '')) {
                    $project->invoice_approval_date = 'Today';
            }

            break;
        case 'Invoice Submitted':
            if(Input::get('invoice_submitted_date') == '' && Input::get('project_submitted_date') == '') {
                $project->invoice_submitted_date = 'Today';
                $project->project_submitted_date = 'Today';
            } else if(Input::get('invoice_submitted_date') == '' && Input::get('project_submitted_date') != '') {
                $project->invoice_submitted_date = 'Today';
            }
            break;
        case 'Project Submitted':
            if(Input::get('project_submitted_date') == '') {
                $project->project_submitted_date = 'Today';
            }
            break;
    }
