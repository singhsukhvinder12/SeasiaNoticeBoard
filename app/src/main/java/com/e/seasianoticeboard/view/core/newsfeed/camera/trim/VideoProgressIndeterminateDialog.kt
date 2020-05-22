package com.e.seasianoticeboard.camera.trim

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.e.seasianoticeboard.R
import kotlinx.android.synthetic.main.progress_dilaog_loading_trimer.*

class VideoProgressIndeterminateDialog(private var ctx: Context, private var message: String) : Dialog(ctx) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.progress_dilaog_loading_trimer)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCancelable(false)
        setCanceledOnTouchOutside(false)

        messageLabel.text = message

        messageLabel.typeface = FontsHelper[ctx, FontsConstants.SEMI_BOLD]
    }
}