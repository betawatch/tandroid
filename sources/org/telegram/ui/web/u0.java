package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ JsPromptResult b;
    public final /* synthetic */ zt c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, zt ztVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = zArr;
        this.b = jsPromptResult;
        this.c = ztVar;
        this.d = b2Var;
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
