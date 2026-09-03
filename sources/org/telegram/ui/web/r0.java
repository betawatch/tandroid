package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ JsPromptResult b;
    public final /* synthetic */ xt c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, xt xtVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = zArr;
        this.b = jsPromptResult;
        this.c = xtVar;
        this.d = d2Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.b.confirm(this.c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
