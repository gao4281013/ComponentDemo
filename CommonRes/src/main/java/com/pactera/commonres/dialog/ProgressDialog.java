package com.pactera.commonres.dialog;


import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

import com.pactera.commonres.R;

public class ProgressDialog extends Dialog {
    public ProgressDialog(@NonNull Context context) {
        super(context, R.style.public_dialog_progress);
        setContentView(R.layout.public_dialog_progress);
        setCanceledOnTouchOutside(false);
    }
}
