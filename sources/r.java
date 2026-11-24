// default package

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements q8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(Context context, wjb wjbVar, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 4;
        this.d = context;
        this.c = wjbVar;
        this.b = editTextBoldCursor;
    }

    @Override // q8c
    public final Object a(Object obj) {
        byte b = this.a;
        byte b2 = 15;
        byte b3 = 10;
        final byte b4 = 0;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                final a1 a1Var = (a1) obj2;
                final wjb wjbVar = (wjb) obj3;
                Context context = (Context) obj4;
                y0 y0Var = (y0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = y0Var.e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                cs5 G = cs5.G(a1Var.c, wjbVar, y0Var);
                G.X(bkb.b0(gl.L(12.0f), bkb.v0(bkb.c6, wjbVar)));
                G.k(R.drawable.msg_edit, k96.M0(2131754996, null), new Runnable() { // from class: g
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = b4;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        wjb wjbVar2 = wjbVar;
                        a1 a1Var2 = a1Var;
                        switch (b5) {
                            case 0:
                                r0 r0Var = new r0(a1Var2.getContext(), wjbVar2);
                                r0Var.e2 = tL_aiComposeTone2;
                                r0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                r0Var.a1();
                                r0Var.V1.setText(r0Var.e2.title);
                                r0Var.W1.setText(r0Var.e2.prompt);
                                r0Var.Y1.a(r0Var.e2.author_id != 0, false);
                                r0Var.o1.setTitle(k96.M0(2131754996, null));
                                r0Var.b2.setText(k96.M0(2131754979, null));
                                r0Var.Z0();
                                r0Var.i2.O(false);
                                r0Var.g2 = new h(a1Var2, (byte) 2);
                                r0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, a1Var2.getContext());
                                String M0 = k96.M0(2131754998, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131754997, null);
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131751586, null), new o(a1Var2, tL_aiComposeTone2, (byte) 0));
                                alertDialog$Builder.c(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                G.b(R.drawable.msg_share, k96.M0(2131754983, null), new s67(a1Var, tL_aiComposeTone, context, wjbVar, (byte) 5), false);
                G.l(R.drawable.msg_delete, new ee2(a1Var, tL_aiComposeTone, b2), k96.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                boolean z2 = tL_aiComposeTone.creator;
                String M0 = k96.M0(2131754998, null);
                final char c4 = c == true ? 1 : 0;
                G.l(R.drawable.msg_delete, new Runnable() { // from class: g
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = c4;
                        TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                        wjb wjbVar2 = wjbVar;
                        a1 a1Var2 = a1Var;
                        switch (b5) {
                            case 0:
                                r0 r0Var = new r0(a1Var2.getContext(), wjbVar2);
                                r0Var.e2 = tL_aiComposeTone2;
                                r0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                r0Var.a1();
                                r0Var.V1.setText(r0Var.e2.title);
                                r0Var.W1.setText(r0Var.e2.prompt);
                                r0Var.Y1.a(r0Var.e2.author_id != 0, false);
                                r0Var.o1.setTitle(k96.M0(2131754996, null));
                                r0Var.b2.setText(k96.M0(2131754979, null));
                                r0Var.Z0();
                                r0Var.i2.O(false);
                                r0Var.g2 = new h(a1Var2, (byte) 2);
                                r0Var.show();
                                break;
                            default:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, a1Var2.getContext());
                                String M02 = k96.M0(2131754998, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M02;
                                hdVar.U = k96.M0(2131754997, null);
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131751586, null), new o(a1Var2, tL_aiComposeTone2, (byte) 0));
                                alertDialog$Builder.c(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, M0, z2, true);
                G.a0();
                return Boolean.TRUE;
            case 1:
                View view = (View) obj;
                k27 k27Var = ((td8) obj4).b;
                return od8.d(view, (String) obj2, (String) obj3, k27Var.F0(), k27Var);
            case 2:
                wt7 wt7Var = (wt7) obj2;
                boolean[] zArr = (boolean[]) obj3;
                mt7 mt7Var = (mt7) obj4;
                ww0 ww0Var = mt7Var.c;
                Integer num = (Integer) obj;
                st7 st7Var = wt7Var.H0;
                si5 si5Var = wt7Var.w1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    wt7Var.L0(null, new ur4((Object) wt7Var, (byte) 25));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    rqe.c(R.raw.permission_request_location, 2131747109, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ra(b3, new ra((byte) 9, new x15(wt7Var, mt7Var, b2), z), c3 == true ? 1 : 0));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 6) {
                    yb1 yb1Var = wt7Var.a2;
                    if (yb1Var != null) {
                        yb1Var.a();
                    }
                    return Boolean.TRUE;
                }
                if (num.intValue() == 2) {
                    mt7Var.dismiss();
                    t7b t7bVar = ((x6b) wt7Var).u2;
                    t7bVar.d1.M.b(true);
                    t7bVar.u();
                    t7bVar.r(true);
                    t7bVar.c(true);
                    return Boolean.TRUE;
                }
                byte b5 = 3;
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    yx9 yx9Var = new yx9(wt7Var.getContext(), false, null, new zf7(wt7Var, (byte) 7), new f53());
                    yx9Var.n(new ct7(wt7Var, b5));
                    yx9Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    wt7Var.f2 = true;
                    wt7Var.a0(wt7Var.i0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!y6c.h(wt7Var.v1).p()) {
                    try {
                        ww0Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    new u21(ww0Var, si5Var).Q(R.raw.star_premium_2, 36, gl.N2(k96.M0(2131744395, null), -1, 2, new ct7(wt7Var, c2 == true ? 1 : 0), null)).k(true);
                    return Boolean.FALSE;
                }
                int i = 0;
                for (int i2 = 0; i2 < st7Var.getChildCount(); i2++) {
                    if (st7Var.getChildAt(i2) instanceof o46) {
                        i++;
                    }
                }
                if (i >= 3) {
                    new u21(ww0Var, si5Var).I(R.raw.linkbroken, k96.M0(2131744398, null), k96.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                wt7Var.K0(null);
                mt7Var.dismiss();
                return Boolean.TRUE;
            case 3:
                o39 o39Var = (o39) obj2;
                q8c q8cVar = (q8c) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj4;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != o39Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) q8cVar.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    s49 T = o39Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
            default:
                wjb wjbVar2 = (wjb) obj3;
                Long l = (Long) obj;
                TextView textView = new TextView((Context) obj4);
                textView.setGravity(17);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(gl.o());
                int i3 = bkb.Ei;
                zkb.X(textView, i3, wjbVar2);
                ShapeDrawable b0 = bkb.b0(gl.L(13.0f), bkb.p1(0.15f, bkb.v0(i3, wjbVar2)));
                vkb K = zkb.K(0.15f, i3);
                textView.setBackground(b0);
                zkb.j(textView, b0, K, null, wjbVar2);
                textView.setText(jva.Q0(jva.J0(l.longValue()) + " 💎", 0.75f));
                ote.a(textView);
                textView.setOnClickListener(new b99((EditTextBoldCursor) obj2, l, b3));
                return textView;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
