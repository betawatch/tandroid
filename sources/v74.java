// default package

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v74 {
    public static volatile v74[] g = new v74[4];
    public static final Object[] h = new Object[4];
    public static hd i;
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final s54 e = new s54((Object) this, (byte) 3);
    public boolean f;

    static {
        for (int i2 = 0; i2 < 4; i2++) {
            h[i2] = new Object();
        }
    }

    public v74(int i2) {
        this.a = i2;
    }

    public static v74 b(int i2) {
        v74 v74Var;
        v74 v74Var2 = g[i2];
        if (v74Var2 != null) {
            return v74Var2;
        }
        synchronized (h[i2]) {
            v74Var = g[i2];
            if (v74Var == null) {
                v74[] v74VarArr = g;
                v74 v74Var3 = new v74(i2);
                v74VarArr[i2] = v74Var3;
                v74Var = v74Var3;
            }
        }
        return v74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k27 k27Var, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (!TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = na7.q1(this.a).h1(k27.B0(k27Var.k));
            tL_editFactCheck2.msg_id = k27Var.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        } else {
            if (z) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = na7.q1(this.a).h1(k27.B0(k27Var.k));
            tL_deleteFactCheck.msg_id = k27Var.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        hd hdVar = new hd(3, null, context);
        hdVar.q(320L);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_editFactCheck, new ji1((Object) this, (Object) tL_textWithEntities, z, (Object) hdVar, (byte) 6));
    }

    public final void c(Activity activity, wjb wjbVar, k27 k27Var) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        d Q = LaunchActivity.Q();
        Activity W = gl.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final byte b = 1;
        final byte b2 = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof cja) && ((cja) Q.getFragmentView()).Q() > gl.L(20.0f);
        hd[] hdVarArr = new hd[1];
        AlertDialog$Builder mdVar = z ? new md(0, wjbVar, activity) : new AlertDialog$Builder(0, wjbVar, activity);
        TextView[] textViewArr = new TextView[1];
        boolean z2 = k27Var == null || (message = k27Var.k) == null || message.factcheck == null;
        String M0 = k96.M0(2131750840, null);
        hd hdVar = mdVar.a;
        hdVar.S = M0;
        int i2 = this.a;
        int f = na7.q1(i2).k4.W2.f();
        final r74 r74Var = new r74(activity, wjbVar, f, wjbVar);
        r74Var.s0 = true;
        boolean z3 = z2;
        r74Var.setOnEditorActionListener(new s74(this, r74Var, f, k27Var, z3, hdVarArr, currentFocus));
        hq6.d0(i2).O(gl.F0(), true);
        r74Var.setTextSize(1, 18.0f);
        zkb.X(r74Var, bkb.i5, wjbVar);
        zkb.l(r74Var, 34, bkb.Ni, wjbVar);
        r74Var.setHintText(k96.M0(2131750837, null));
        r74Var.setFocusable(true);
        r74Var.setInputType(147457);
        zkb.F(r74Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        r74Var.setImeOptions(6);
        r74Var.setBackgroundDrawable(null);
        r74Var.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        TLRPC.TL_factCheck R0 = k27Var.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            k27.b(valueOf, R0.text.entities, false, true, false, false, 0);
            r74Var.setText(valueOf);
        }
        r74Var.addTextChangedListener(new t74(f, r74Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(r74Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        mdVar.b();
        mdVar.n(linearLayout);
        hdVar.a = gl.L(292.0f);
        mdVar.j(k96.M0(2131751342, null), new gu1(this, r74Var, f, k27Var, z3));
        mdVar.g(k96.M0(2131752577, "Cancel"), new w44((byte) 7));
        if (z) {
            i = hdVar;
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new b41(currentFocus, (byte) 1));
            i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: q74
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b;
                    r74 r74Var2 = r74Var;
                    switch (b3) {
                        case 0:
                            r74Var2.requestFocus();
                            gl.F3(r74Var2);
                            break;
                        default:
                            r74Var2.requestFocus();
                            gl.F3(r74Var2);
                            break;
                    }
                }
            });
            i.q(250L);
        } else {
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new n1(r74Var, (byte) 20));
            hdVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: q74
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b2;
                    r74 r74Var2 = r74Var;
                    switch (b3) {
                        case 0:
                            r74Var2.requestFocus();
                            gl.F3(r74Var2);
                            break;
                        default:
                            r74Var2.requestFocus();
                            gl.F3(r74Var2);
                            break;
                    }
                }
            });
            hdVarArr[0].show();
        }
        hd hdVar2 = hdVarArr[0];
        hdVar2.k0 = false;
        View c = hdVar2.c(-1);
        if (c instanceof TextView) {
            textViewArr[0] = (TextView) c;
        }
        r74Var.setSelection(r74Var.getText().length());
    }
}
