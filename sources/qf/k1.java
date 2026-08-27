package qf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ cg.e1 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ b2[] g;
    public final /* synthetic */ View h;

    public k1(h1 h1Var, int i10, p1 p1Var, TextView textView, cg.e1 e1Var, Utilities.Callback callback, b2[] b2VarArr, View view) {
        this.a = h1Var;
        this.b = i10;
        this.c = p1Var;
        this.d = textView;
        this.e = e1Var;
        this.f = callback;
        this.g = b2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        h1 h1Var = this.a;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            return true;
        }
        q1 f10 = q1.f(this.b);
        p1 p1Var = this.c;
        int i11 = p1Var == null ? -1 : p1Var.a;
        p1 d = f10.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(h1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        b2[] b2VarArr = this.g;
        b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == n1.h) {
            n1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
