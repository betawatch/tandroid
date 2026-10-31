package org.telegram.ui.web;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class q0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i10 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.c).confirm(((mt) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.x1) this.e).dismiss();
                }
                return true;
            default:
                ph.t1 t1Var = (ph.t1) this.b;
                if (i10 != 6) {
                    return false;
                }
                String obj = t1Var.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    org.telegram.messenger.i0.E3(t1Var);
                } else {
                    ((q20) this.c).a(obj);
                    org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.d)[0];
                    if (x1Var != null) {
                        x1Var.dismiss();
                    }
                    View view = (View) this.e;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
        }
    }
}
