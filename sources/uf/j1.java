package uf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ g1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ o1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ gg.c1 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ d2[] g;
    public final /* synthetic */ View h;

    public j1(g1 g1Var, int i10, o1 o1Var, TextView textView, gg.c1 c1Var, Utilities.Callback callback, d2[] d2VarArr, View view) {
        this.a = g1Var;
        this.b = i10;
        this.c = o1Var;
        this.d = textView;
        this.e = c1Var;
        this.f = callback;
        this.g = d2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        g1 g1Var = this.a;
        String obj = g1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(g1Var);
            return true;
        }
        p1 f10 = p1.f(this.b);
        o1 o1Var = this.c;
        int i11 = o1Var == null ? -1 : o1Var.a;
        o1 d = f10.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(g1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        d2[] d2VarArr = this.g;
        d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == m1.h) {
            m1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
