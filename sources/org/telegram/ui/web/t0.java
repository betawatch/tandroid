package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.cu;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ JsPromptResult b;
    public final /* synthetic */ cu c;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, cu cuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.a = zArr;
        this.b = jsPromptResult;
        this.c = cuVar;
        this.d = a2Var;
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
