package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ JsPromptResult b;
    public final /* synthetic */ mt c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 d;

    public q0(boolean[] zArr, JsPromptResult jsPromptResult, mt mtVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = zArr;
        this.b = jsPromptResult;
        this.c = mtVar;
        this.d = c2Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
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
