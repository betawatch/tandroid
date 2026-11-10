package org.telegram.ui.web;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class p0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.c).confirm(((ys) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.u1) this.e).dismiss();
                }
                return true;
            default:
                zh.n1 n1Var = (zh.n1) this.b;
                if (i7 != 6) {
                    return false;
                }
                String obj = n1Var.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    org.telegram.messenger.g0.F3(n1Var);
                } else {
                    ((c20) this.c).a(obj);
                    org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.d)[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
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
