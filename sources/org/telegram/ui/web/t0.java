package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.eu;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ JsPromptResult b;
    public final /* synthetic */ eu c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, eu euVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = zArr;
        this.b = jsPromptResult;
        this.c = euVar;
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
