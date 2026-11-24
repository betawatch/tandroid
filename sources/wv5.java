// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wv5 extends my0 {
    public static ArrayList C1;
    public static long D1;
    public static long E1;
    public static int F1;
    public boolean A1;
    public uv5 B1;
    public Drawable l1;
    public boolean m1;
    public int n1;
    public kb2 o1;
    public sv5 p1;
    public TextView q1;
    public TextView r1;
    public ArrayList s1;
    public boolean t1;
    public int u1;
    public int v1;
    public TLRPC.Peer w1;
    public TLRPC.Peer x1;
    public TLRPC.InputPeer y1;
    public boolean z1;

    public static void D0(Activity activity, long j, j5 j5Var, ue7 ue7Var) {
        int i = F1;
        int i2 = j5Var.a;
        char c = 1;
        if (i == i2 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 240000) {
            ue7Var.z(C1.size() == 1);
            return;
        }
        he heVar = new he(3, null, activity);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = oc7.r1(i2).i1(j);
        heVar.setOnCancelListener(new pv5(j5Var, ConnectionsManager.getInstance(i2).sendRequest(getgroupcalljoinas, new eu0(heVar, j, j5Var, ue7Var)), c == true ? 1 : 0));
        try {
            heVar.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void E0(Context context, long j, j5 j5Var, d dVar, int i, TLRPC.Peer peer, uv5 uv5Var) {
        if (context != null) {
            int i2 = F1;
            int i3 = j5Var.a;
            byte b = 0;
            if (i2 == i3 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 300000) {
                if (C1.size() != 1 || i == 0) {
                    F0(context, j, C1, dVar, i, peer, uv5Var);
                    return;
                } else {
                    uv5Var.a(oc7.r1(i3).i1(k47.B1((TLRPC.Peer) C1.get(0))), false, false, false);
                    return;
                }
            }
            he heVar = new he(3, null, context);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = oc7.r1(i3).i1(j);
            heVar.setOnCancelListener(new pv5(j5Var, ConnectionsManager.getInstance(i3).sendRequest(getgroupcalljoinas, new l15(heVar, j5Var, uv5Var, j, context, dVar, i, peer)), b));
            try {
                heVar.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void F0(Context context, long j, ArrayList arrayList, d dVar, int i, TLRPC.Peer peer, uv5 uv5Var) {
        int i2;
        ViewGroup viewGroup;
        boolean z;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog a23Var = new a23(dVar, arrayList, j, uv5Var);
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(a23Var);
                return;
            } else {
                a23Var.show();
                return;
            }
        }
        wv5 wv5Var = new wv5(context, false);
        wv5Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        wv5Var.s1 = arrayList2;
        wv5Var.B1 = uv5Var;
        wv5Var.v1 = i;
        Drawable d = b10.d(context, R.drawable.sheet_shadow_round);
        wv5Var.l1 = d;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) wv5Var.s1.get(i3);
                    if (k47.B1(peer2) == selfId) {
                        wv5Var.x1 = peer2;
                        wv5Var.w1 = peer2;
                        break;
                    }
                    i3++;
                }
            } else if (peer != null) {
                long B1 = k47.B1(peer);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) wv5Var.s1.get(i4);
                    if (k47.B1(peer3) == B1) {
                        wv5Var.x1 = peer3;
                        wv5Var.w1 = peer3;
                        break;
                    }
                    i4++;
                }
            } else {
                wv5Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = wv5Var.l1;
            i2 = cmb.w0(null, cmb.Vg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        } else {
            int w0 = cmb.w0(null, cmb.g5, false);
            d.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            wv5Var.m1 = true;
            wv5Var.n1 = w0;
            wv5Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            i2 = w0;
        }
        wv5Var.K(i2);
        if (wv5Var.v1 == 0) {
            qv5 qv5Var = new qv5(wv5Var, context);
            qv5Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(qv5Var);
            wv5Var.O = nestedScrollView;
            viewGroup = qv5Var;
        } else {
            rv5 rv5Var = new rv5(wv5Var, context);
            wv5Var.b = rv5Var;
            rv5Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = wv5Var.b;
            int i5 = wv5Var.u0;
            viewGroup2.setPadding(i5, 0, i5, 0);
            viewGroup = rv5Var;
        }
        TLRPC.Chat L0 = oc7.r1(wv5Var.a).L0(Long.valueOf(-j));
        sv5 sv5Var = new sv5(wv5Var, context);
        wv5Var.p1 = sv5Var;
        wv5Var.getContext();
        sv5Var.setLayoutManager(new u46(wv5Var.v1 == 0 ? 0 : 1, false));
        sv5Var.setAdapter(new vv5(wv5Var, context));
        sv5Var.setVerticalScrollBarEnabled(false);
        sv5Var.setClipToPadding(false);
        sv5Var.setEnabled(true);
        sv5Var.setSelectorDrawableColor(0);
        anb.l(sv5Var, 21, cmb.z5, null);
        sv5Var.setOnScrollListener(new tv5(wv5Var));
        byte b = 14;
        sv5Var.setOnItemClickListener(new k0(wv5Var, L0, b));
        if (i != 0) {
            viewGroup.addView(sv5Var, qoe.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            sv5Var.setSelectorDrawableColor(0);
            sv5Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            s09 s09Var = new s09(context);
            s09Var.setAutoRepeat(true);
            s09Var.f(R.raw.utyan_schedule, nm7.E1, nm7.E1, null);
            s09Var.d();
            viewGroup.addView(s09Var, qoe.t(nm7.p2, nm7.p2, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        wv5Var.q1 = textView;
        wi8.v(textView, 1, 20.0f);
        if (i == 2) {
            anb.X(textView, cmb.dh, null);
        } else {
            anb.X(textView, cmb.i5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (sd2.W(L0)) {
                textView.setText(jb6.M0(2131744592, null));
            } else {
                textView.setText(jb6.M0(2131744589, null));
            }
            viewGroup.addView(textView, qoe.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                textView.setText(jb6.M0(2131743070, null));
            } else if (sd2.W(L0)) {
                textView.setText(jb6.M0(2131743160, null));
            } else {
                textView.setText(jb6.M0(2131743052, null));
            }
            viewGroup.addView(textView, qoe.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(wv5Var.getContext());
        wv5Var.r1 = textView2;
        if (i == 2) {
            anb.X(textView2, cmb.eh, null);
        } else {
            anb.X(textView2, cmb.q5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = wv5Var.s1.size();
        for (int i6 = 0; i6 < size3; i6++) {
            long B12 = k47.B1((TLRPC.Peer) wv5Var.s1.get(i6));
            if (B12 < 0) {
                TLRPC.Chat L02 = oc7.r1(wv5Var.a).L0(Long.valueOf(-B12));
                if (!sd2.T(L02) || L02.megagroup) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        wv5Var.r1.setMovementMethod(new cm((byte) 0));
        anb.G(wv5Var.r1, cmb.j5, null);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (!sd2.T(L0) || L0.megagroup) {
                sb.append(jb6.M0(2131743017, null));
            } else {
                sb.append(jb6.M0(2131743142, null));
            }
            if (wv5Var.s1.size() > 1) {
                sb.append("\n\n");
                sb.append(jb6.M0(2131743127, null));
            } else {
                wv5Var.p1.setVisibility(8);
            }
            wv5Var.r1.setText(sb);
            wv5Var.r1.setGravity(49);
            viewGroup.addView(wv5Var.r1, qoe.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            TextView textView3 = wv5Var.r1;
            if (z) {
                textView3.setText(jb6.M0(2131743015, null));
            } else {
                textView3.setText(jb6.M0(2131743016, null));
            }
            wv5Var.r1.setGravity((jb6.a0 ? 5 : 3) | 48);
            viewGroup.addView(wv5Var.r1, qoe.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            viewGroup.addView(wv5Var.p1, qoe.t(wv5Var.s1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        kb2 kb2Var = new kb2(wv5Var, context, false);
        wv5Var.o1 = kb2Var;
        ((View) kb2Var.d).setOnClickListener(new tf3(wv5Var, uv5Var, (byte) 28));
        if (wv5Var.v1 == 0) {
            viewGroup.addView(kb2Var, qoe.t(-1, 50, 51, 0, 0, 0, 0));
            kb2 kb2Var2 = new kb2(wv5Var, context, true);
            if (sd2.W(L0)) {
                kb2Var2.a(jb6.M0(2131743146, null), false);
            } else {
                kb2Var2.a(jb6.M0(2131743025, null), false);
            }
            ((View) kb2Var2.d).setOnClickListener(new ca5(wv5Var, b));
            viewGroup.addView(kb2Var2, qoe.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(kb2Var, qoe.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        wv5Var.G0(L0, false);
        if (dVar == null) {
            wv5Var.show();
        } else if (dVar.getParentActivity() != null) {
            dVar.showDialog(wv5Var);
        }
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final void G0(TLRPC.Chat chat, boolean z) {
        kb2 kb2Var = this.o1;
        if (this.v1 == 0) {
            if (sd2.W(chat)) {
                kb2Var.a(jb6.a0("VoipChannelStartVoiceChat", null, 2131743139, new Object[0]), z);
                return;
            } else {
                kb2Var.a(jb6.a0("VoipGroupStartVoiceChat", null, 2131743008, new Object[0]), z);
                return;
            }
        }
        long B1 = k47.B1(this.w1);
        boolean D = pg3.D(B1);
        int i = this.a;
        if (D) {
            kb2Var.a(jb6.a0("VoipGroupContinueAs", null, 2131743075, m9c.k(oc7.r1(i).W1(Long.valueOf(B1)), true)), z);
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B1));
            kb2Var.a(jb6.a0("VoipGroupContinueAs", null, 2131743075, L0 != null ? L0.title : ""), z);
        }
    }

    @Override // my0
    public final void H() {
        super.H();
        TLRPC.InputPeer inputPeer = this.y1;
        if (inputPeer != null) {
            this.B1.a(inputPeer, this.s1.size() > 1, this.z1, false);
        }
    }

    public final void H0() {
        sv5 sv5Var = this.p1;
        if (this.v1 != 0) {
            if (sv5Var.getChildCount() <= 0) {
                int paddingTop = sv5Var.getPaddingTop();
                this.u1 = paddingTop;
                sv5Var.setTopGlowOffset(paddingTop);
                this.b.invalidate();
                return;
            }
            int i = 0;
            View childAt = sv5Var.getChildAt(0);
            b59 b59Var = (b59) sv5Var.G(childAt);
            int top = childAt.getTop() - gm.L(9.0f);
            if (top > 0 && b59Var != null && b59Var.b() == 0) {
                i = top;
            }
            if (this.u1 != i) {
                this.q1.setTranslationY(gm.L(19.0f) + top);
                this.r1.setTranslationY(gm.L(56.0f) + top);
                this.u1 = i;
                sv5Var.setTopGlowOffset(i);
                this.b.invalidate();
            }
        }
    }

    @Override // my0
    public final void p0() {
        Drawable drawable;
        super.p0();
        try {
            int w0 = cmb.w0(null, cmb.g5, false);
            if (!this.m1 || (drawable = this.l1) == null || w0 == this.n1) {
                return;
            }
            this.n1 = w0;
            drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
