package pf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ bg.j1 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ c2[] g;
    public final /* synthetic */ View h;

    public k1(h1 h1Var, int i9, q1 q1Var, TextView textView, bg.j1 j1Var, Utilities.Callback callback, c2[] c2VarArr, View view) {
        this.a = h1Var;
        this.b = i9;
        this.c = q1Var;
        this.d = textView;
        this.e = j1Var;
        this.f = callback;
        this.g = c2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        h1 h1Var = this.a;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            return true;
        }
        r1 f10 = r1.f(this.b);
        q1 q1Var = this.c;
        int i10 = q1Var == null ? -1 : q1Var.a;
        q1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            AndroidUtilities.shakeView(h1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        c2[] c2VarArr = this.g;
        c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == n1.h) {
            n1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
