// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class taa extends fx0 implements gk7 {
    public static final /* synthetic */ int T2 = 0;
    public final v9a A1;
    public TL_stories.StoryItem A2;
    public final v9a B1;
    public io5 B2;
    public final r35 C1;
    public int C2;
    public final r35 D1;
    public boolean D2;
    public final vb4 E1;
    public m8 E2;
    public final maa F1;
    public int F2;
    public final raa G1;
    public boolean G2;
    public final qaa H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final cq3 J2;
    public final byte K1;
    public final ix4 K2;
    public final zya L1;
    public final kl0 L2;
    public final Drawable M1;
    public final kl0 M2;
    public final View[] N1;
    public final kl0 N2;
    public final AnimatorSet[] O1;
    public final vw0 O2;
    public final vf6 P1;
    public final il0 P2;
    public final HashMap Q1;
    public final ql0 Q2;
    public final haa R1;
    public final il0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final wf2 Z1;
    public final mu1 a2;
    public final Activity b2;
    public final boolean c2;
    public boolean d2;
    public final TextPaint e2;
    public TLRPC.TL_exportedMessageLink f2;
    public boolean g2;
    public boolean h2;
    public final boolean i2;
    public final String[] j2;
    public int k2;
    public final FrameLayout l1;
    public int l2;
    public final y9a m1;
    public boolean m2;
    public final z9a n1;
    public jaa n2;
    public final jh3 o1;
    public float o2;
    public final y9a p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final si9 s1;
    public final t29 s2;
    public final FrameLayout t1;
    public final no4 t2;
    public final jia u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public yla w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final gaa y2;
    public final o39 z1;
    public ArrayList z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public taa(Context context, mu1 mu1Var, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, wjb wjbVar) {
        super(1, wjbVar, context, true);
        byte b;
        int i;
        float f;
        v9a v9aVar;
        v9a v9aVar2;
        LinearLayout linearLayout;
        int i2;
        final byte b2 = 1;
        final byte b3 = 2;
        String[] strArr = new String[2];
        this.J1 = strArr;
        this.N1 = new View[2];
        this.O1 = new AnimatorSet[2];
        this.P1 = new vf6();
        this.Q1 = new HashMap();
        this.S1 = -1;
        final byte b4 = 0;
        this.T1 = false;
        new Paint(1);
        this.e2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.j2 = strArr2;
        this.z2 = new ArrayList();
        byte b5 = 4;
        int i3 = 4;
        while (true) {
            b = 12;
            if (i3 >= 32) {
                i = 80;
                break;
            }
            i = (1 << i3) - 12;
            if (80 <= i) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = i / 8;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        this.B2 = io5.e;
        this.C2 = 4;
        this.D2 = true;
        this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        gl.S(getWindow());
        ix4 d = this.X0.d(new p9a(this, b5));
        this.K2 = d;
        if (Build.VERSION.SDK_INT < 31 || !gba.f()) {
            this.J2 = null;
            kl0 kl0Var = new kl0(d, d, d);
            kl0Var.j = this.X0;
            this.M2 = kl0Var;
            this.L2 = kl0Var;
            this.N2 = kl0Var;
        } else {
            cq3 cq3Var = new cq3(false);
            this.J2 = cq3Var;
            this.X0.a(cq3Var);
            lx4 lx4Var = new lx4(d);
            lx4Var.f = d;
            lx4Var.d = cq3Var;
            lx4Var.e = -2;
            lx4 lx4Var2 = new lx4(d);
            lx4Var2.f = d;
            lx4Var2.d = cq3Var;
            lx4Var2.e = -3;
            kl0 kl0Var2 = new kl0(lx4Var, lx4Var, lx4Var);
            this.L2 = kl0Var2;
            kl0Var2.k = true;
            int L = e66.e(262144) ? gl.L(8.0f) : gl.L(48.0f);
            kl0Var2.d = L;
            kl0Var2.e = L;
            kl0Var2.j = this.X0;
            kl0 kl0Var3 = new kl0(lx4Var2, lx4Var2, lx4Var2);
            this.M2 = kl0Var3;
            kl0Var3.k = true;
            int L2 = gl.L(48.0f);
            kl0Var3.d = L2;
            kl0Var3.e = L2;
            qw4 qw4Var = this.X0;
            kl0Var3.j = qw4Var;
            kl0 kl0Var4 = new kl0(d, d, d);
            this.N2 = kl0Var4;
            kl0Var4.j = qw4Var;
        }
        this.J0 = wjbVar;
        this.U1 = z4;
        this.b2 = gl.W(context);
        this.c2 = z3;
        byte b6 = 3;
        if (z3) {
            this.J0 = new e53(b6);
        }
        d.a(bkb.v0(bkb.c6, this.J0));
        this.a2 = mu1Var;
        Drawable d2 = b00.d(context, R.drawable.sheet_shadow_round);
        this.M1 = d2;
        int i5 = bkb.g5;
        this.b0 = i5;
        d2.setColorFilter(new PorterDuffColorFilter(bkb.v0(i5, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z2;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            k27 k27Var = (k27) arrayList.get(0);
            String q = cf3.q(na7.q1(this.a).Z1(k27.B0(k27Var.k)));
            if (!TextUtils.isEmpty(q)) {
                StringBuilder sb = new StringBuilder("https://");
                ls6.u(sb, na7.q1(this.a).N2, "/", q, "/");
                sb.append(k27Var.e1());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && k27Var.z2()) {
                    strArr2[0] = b00.j(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.I1 = arrayList;
        this.H1 = new qaa(this, context);
        this.i2 = z;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new tt(this, b6);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                k27 k27Var2 = (k27) this.I1.get(i6);
                if (k27Var2.C4()) {
                    this.K1 = (byte) 3;
                } else if (k27Var2.S3()) {
                    byte b7 = k27Var2.Y3() ? (byte) 2 : (byte) 1;
                    this.K1 = b7;
                    if (b7 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            this.g2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((k27) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = na7.q1(this.a).f1(((k27) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new hj7(this, context, (byte) 26));
        }
        gaa gaaVar = new gaa(this, context);
        this.y2 = gaaVar;
        this.b = gaaVar;
        gaaVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.setPadding(i7, 0, i7, this.B2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l1 = frameLayout;
        frameLayout.setBackground(new gc(this));
        if (this.c2 && this.j2[1] != null) {
            haa haaVar = new haa(this, context);
            this.R1 = haaVar;
            frameLayout.addView(haaVar, nme.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        no4 no4Var = new no4(context, this.J0);
        this.t2 = no4Var;
        aaa aaaVar = new aaa(this, b2);
        l7 l7Var = no4Var.r;
        l7Var.addTextChangedListener(aaaVar);
        l7Var.setHint(k96.M0(2131745248, null));
        l7Var.setOnEditorActionListener(new j(this, (byte) 24));
        no4Var.setCloseButtonOnClickListener(new q9a(this, b4));
        frameLayout.addView(no4Var, nme.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        a aVar = new a(context, null);
        this.u2 = aVar;
        aVar.setOccupyStatusBar(false);
        aVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i8 = bkb.i5;
        zkb.l(aVar, 5, i8, this.J0);
        zkb.l(aVar, 6, bkb.p5, this.J0);
        zkb.l(aVar, 1, bkb.y6, null);
        zkb.l(aVar, 3, bkb.t8, null);
        aVar.setActionBarMenuOnItemClick(new kk8(this, (byte) 14));
        aVar.setVisibility(8);
        frameLayout.addView(aVar, nme.e(-1, 58, 83));
        o39 o39Var = new o39(context, this.J0);
        this.z1 = o39Var;
        r35 r35Var = new r35(4);
        this.D1 = r35Var;
        o39Var.setLayoutManager(r35Var);
        r35Var.O = new w9a(this, b3);
        o39Var.setOnScrollListener(new x9a(this, b3));
        raa raaVar = new raa(this, context);
        this.G1 = raaVar;
        o39Var.setAdapter(raaVar);
        int i9 = bkb.z5;
        zkb.l(o39Var, 21, i9, this.J0);
        o39Var.setVerticalScrollBarEnabled(false);
        o39Var.setHorizontalScrollBarEnabled(false);
        o39Var.setOverScrollMode(2);
        o39Var.setSelectorDrawableColor(0);
        byte b8 = 11;
        o39Var.setItemSelectorColorProvider(new ho9(b8));
        o39Var.setPadding(0, 0, 0, gl.L(48.0f));
        o39Var.setClipToPadding(false);
        o39Var.i(new oq1(b8));
        o39Var.setOnItemClickListener(new c39(this) { // from class: r9a
            public final /* synthetic */ taa b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // c39
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b4;
                TLRPC.Dialog dialog2 = null;
                taa taaVar = this.b;
                switch (b9) {
                    case 0:
                        no4 no4Var2 = taaVar.t2;
                        HashMap hashMap = taaVar.Q1;
                        vf6 vf6Var = taaVar.P1;
                        maa maaVar = taaVar.F1;
                        raa raaVar2 = taaVar.G1;
                        if (raaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = taaVar.x2;
                            if (dialog3 != null) {
                                vf6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar.e.f(dialog3.id)) == null) {
                                        maaVar.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = maaVar.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    maaVar.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < taaVar.J0().getChildCount(); i11++) {
                                    View childAt = taaVar.J0().getChildAt(i11);
                                    if (childAt instanceof waa) {
                                        waa waaVar = (waa) childAt;
                                        if (waaVar.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar.d(null, false, true);
                                            waaVar.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = raaVar2.E(i10);
                            if (E != null && (dialog = taaVar.x2) != null) {
                                long j = dialog.id;
                                boolean x2 = na7.q1(taaVar.a).x2(j);
                                TLRPC.Dialog dialog4 = taaVar.x2;
                                vf6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar.e.f(dialog4.id)) == null) {
                                        maaVar.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = maaVar.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    maaVar.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < taaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = taaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof waa) {
                                        waa waaVar2 = (waa) childAt2;
                                        if (waaVar2.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar2.d(E, x2, true);
                                            waaVar2.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = taaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                taaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qaa qaaVar = taaVar.H1;
                            taa taaVar2 = qaaVar.L;
                            int i14 = qaaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qaaVar.d.size();
                                    ArrayList arrayList5 = qaaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((iaa) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qaaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    taaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < taaVar2.z2.size()) {
                                    TLObject tLObject2 = ((al3) taaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        o39Var.setVisibility(8);
        this.b.addView(o39Var, nme.e(-1, -1, 51));
        v9a v9aVar3 = new v9a(this, context, this.J0, b4);
        this.A1 = v9aVar3;
        v9aVar3.setSelectorDrawableColor(0);
        v9aVar3.setItemSelectorColorProvider(new ho9(b8));
        v9aVar3.setPadding(0, 0, 0, gl.L(48.0f));
        v9aVar3.setClipToPadding(false);
        getContext();
        r35 r35Var2 = new r35(4);
        this.C1 = r35Var2;
        v9aVar3.setLayoutManager(r35Var2);
        this.O2 = new vw0(this, (byte) 10);
        r35Var2.O = new w9a(this, b4);
        v9aVar3.setHorizontalScrollBarEnabled(false);
        v9aVar3.setVerticalScrollBarEnabled(false);
        v9aVar3.setOverScrollMode(2);
        v9aVar3.i(new oq1(b));
        this.b.addView(v9aVar3, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        maa maaVar = new maa(this, context);
        this.F1 = maaVar;
        v9aVar3.setAdapter(maaVar);
        zkb.l(v9aVar3, 21, i9, this.J0);
        v9aVar3.setOnItemClickListener(new c39(this) { // from class: r9a
            public final /* synthetic */ taa b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // c39
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b2;
                TLRPC.Dialog dialog2 = null;
                taa taaVar = this.b;
                switch (b9) {
                    case 0:
                        no4 no4Var2 = taaVar.t2;
                        HashMap hashMap = taaVar.Q1;
                        vf6 vf6Var = taaVar.P1;
                        maa maaVar2 = taaVar.F1;
                        raa raaVar2 = taaVar.G1;
                        if (raaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = taaVar.x2;
                            if (dialog3 != null) {
                                vf6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar2.e.f(dialog3.id)) == null) {
                                        maaVar2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = maaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    maaVar2.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < taaVar.J0().getChildCount(); i11++) {
                                    View childAt = taaVar.J0().getChildAt(i11);
                                    if (childAt instanceof waa) {
                                        waa waaVar = (waa) childAt;
                                        if (waaVar.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar.d(null, false, true);
                                            waaVar.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = raaVar2.E(i10);
                            if (E != null && (dialog = taaVar.x2) != null) {
                                long j = dialog.id;
                                boolean x2 = na7.q1(taaVar.a).x2(j);
                                TLRPC.Dialog dialog4 = taaVar.x2;
                                vf6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar2.e.f(dialog4.id)) == null) {
                                        maaVar2.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = maaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    maaVar2.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < taaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = taaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof waa) {
                                        waa waaVar2 = (waa) childAt2;
                                        if (waaVar2.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar2.d(E, x2, true);
                                            waaVar2.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = taaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                taaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qaa qaaVar = taaVar.H1;
                            taa taaVar2 = qaaVar.L;
                            int i14 = qaaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qaaVar.d.size();
                                    ArrayList arrayList5 = qaaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((iaa) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qaaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    taaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < taaVar2.z2.size()) {
                                    TLObject tLObject2 = ((al3) taaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        v9aVar3.setOnScrollListener(new x9a(this, b4));
        this.X0.b(v9aVar3);
        v9a v9aVar4 = new v9a(this, context, this.J0, b2);
        this.B1 = v9aVar4;
        v9aVar4.setItemSelectorColorProvider(new ho9(b8));
        v9aVar4.setSelectorDrawableColor(0);
        v9aVar4.setPadding(0, 0, 0, gl.L(48.0f));
        v9aVar4.setClipToPadding(false);
        getContext();
        vb4 vb4Var = new vb4(4, 0, v9aVar4);
        this.E1 = vb4Var;
        v9aVar4.setLayoutManager(vb4Var);
        vb4Var.O = new w9a(this, b2);
        v9aVar4.setOnItemClickListener(new c39(this) { // from class: r9a
            public final /* synthetic */ taa b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // c39
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b3;
                TLRPC.Dialog dialog2 = null;
                taa taaVar = this.b;
                switch (b9) {
                    case 0:
                        no4 no4Var2 = taaVar.t2;
                        HashMap hashMap = taaVar.Q1;
                        vf6 vf6Var = taaVar.P1;
                        maa maaVar2 = taaVar.F1;
                        raa raaVar2 = taaVar.G1;
                        if (raaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = taaVar.x2;
                            if (dialog3 != null) {
                                vf6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar2.e.f(dialog3.id)) == null) {
                                        maaVar2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = maaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    maaVar2.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < taaVar.J0().getChildCount(); i11++) {
                                    View childAt = taaVar.J0().getChildAt(i11);
                                    if (childAt instanceof waa) {
                                        waa waaVar = (waa) childAt;
                                        if (waaVar.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar.d(null, false, true);
                                            waaVar.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = raaVar2.E(i10);
                            if (E != null && (dialog = taaVar.x2) != null) {
                                long j = dialog.id;
                                boolean x2 = na7.q1(taaVar.a).x2(j);
                                TLRPC.Dialog dialog4 = taaVar.x2;
                                vf6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                taaVar.W0(2);
                                if (taaVar.G2 || taaVar.H2) {
                                    if (((TLRPC.Dialog) maaVar2.e.f(dialog4.id)) == null) {
                                        maaVar2.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = maaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    maaVar2.f();
                                    taaVar.v2 = false;
                                    no4Var2.r.setText("");
                                    taaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < taaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = taaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof waa) {
                                        waa waaVar2 = (waa) childAt2;
                                        if (waaVar2.getCurrentDialog() == taaVar.x2.id) {
                                            waaVar2.d(E, x2, true);
                                            waaVar2.b(true, true);
                                        }
                                    }
                                }
                                taaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = taaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                taaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qaa qaaVar = taaVar.H1;
                            taa taaVar2 = qaaVar.L;
                            int i14 = qaaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qaaVar.d.size();
                                    ArrayList arrayList5 = qaaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((iaa) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qaaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    taaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < taaVar2.z2.size()) {
                                    TLObject tLObject2 = ((al3) taaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        v9aVar4.setHasFixedSize(true);
        v9aVar4.setItemAnimator(null);
        v9aVar4.setHorizontalScrollBarEnabled(false);
        v9aVar4.setVerticalScrollBarEnabled(false);
        v9aVar4.setOnScrollListener(new x9a(this, b2));
        v9aVar4.i(new oq1((byte) 13));
        v9aVar4.setAdapter(this.H1);
        zkb.l(v9aVar4, 21, i9, this.J0);
        this.s2 = new t29(v9aVar4, true);
        pi4 pi4Var = new pi4(context, this.J0);
        pi4Var.setViewType(12);
        zya zyaVar = new zya(context, pi4Var, 1, this.J0);
        this.L1 = zyaVar;
        zyaVar.addView(pi4Var, 0);
        zyaVar.setAnimateLayoutChange(true);
        zyaVar.e(false, false);
        boolean z5 = this.c2;
        wla wlaVar = zyaVar.d;
        if (z5) {
            zkb.X(wlaVar, bkb.dh, this.J0);
        }
        wlaVar.setText(k96.M0(2131747975, null));
        v9aVar4.setEmptyView(zyaVar);
        v9aVar4.setHideIfEmpty(false);
        v9aVar4.X1 = true;
        v9aVar4.Y1 = false;
        this.b.addView(zyaVar, nme.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(v9aVar4, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        si9 si9Var = new si9((byte) 3, context, this);
        this.s1 = si9Var;
        this.b.addView(si9Var, nme.e(-1, kk7.W4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L((!this.c2 || this.j2[1] == null) ? 58.0f : 111.0f);
        this.N1[0] = new View(context);
        View view = this.N1[0];
        int i10 = bkb.U5;
        zkb.h(i10, this.J0, view);
        this.N1[0].setAlpha(0.0f);
        this.N1[0].setTag(1);
        this.b.addView(this.N1[0], layoutParams);
        this.b.addView(frameLayout, nme.e(-1, (!this.c2 || this.j2[1] == null) ? 58 : kk7.v1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gl.e1(), 83);
        layoutParams2.bottomMargin = gl.L(48.0f);
        this.N1[1] = new View(context);
        zkb.h(i10, this.J0, this.N1[1]);
        this.N1[1].setLayoutParams(layoutParams2);
        if (this.i2 || this.j2[0] != null) {
            f = 4.0f;
            if (this.c2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.q1 = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.t1 = frameLayout3;
                frameLayout2.addView(frameLayout3, nme.d(-1, -1.0f, kk7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, nme.e(-1, -1, kk7.D1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                ote.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new o9a(this, (byte) 4));
                jia jiaVar = new jia(context);
                this.u1 = jiaVar;
                jiaVar.setTextSize(15);
                zkb.W(jiaVar, bkb.Jl, this.J0);
                jiaVar.setEllipsizeByGradient(true);
                V0();
                linearLayout3.addView(jiaVar, nme.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                zkb.X(textView, bkb.F6, this.J0);
                textView.setText(k96.M0(2131751755, null).toUpperCase());
                textView.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
                textView.setTypeface(gl.o());
                textView.setGravity(17);
                int i11 = bkb.h6;
                ff0 Y = bkb.Y(bkb.v0(i11, this.J0), 4, 4);
                vkb M = zkb.M(i11);
                wjb wjbVar2 = this.J0;
                textView.setBackground(Y);
                v9aVar2 = v9aVar4;
                zkb.j(textView, Y, null, M, wjbVar2);
                linearLayout3.addView(textView, nme.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new o9a(this, (byte) 5));
                ote.a(textView);
                this.b.addView(frameLayout2, nme.e(-1, 58, 83));
                ArrayList arrayList2 = this.I1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((k27) this.I1.get(0)).k != null && ((k27) this.I1.get(0)).k.forwards > 0) {
                    final k27 k27Var3 = (k27) this.I1.get(0);
                    if (hc2.N(na7.q1(this.a).K0(Long.valueOf(-k27.B0(k27Var3.k)))) && !k27.l3(k27Var3.k)) {
                        final byte b9 = 0;
                        linearLayout = de9.j(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: u9a
                            public final /* synthetic */ taa b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b10 = b9;
                                k27 k27Var4 = k27Var3;
                                taa taaVar = this.b;
                                switch (b10) {
                                    case 0:
                                        d dVar = taaVar.a2;
                                        if (dVar == null) {
                                            dVar = LaunchActivity.S();
                                        }
                                        if (dVar != null) {
                                            taaVar.dismiss();
                                            dVar.presentFragment(new s47(k27Var4));
                                            break;
                                        }
                                        break;
                                    default:
                                        d dVar2 = taaVar.a2;
                                        if (dVar2 == null) {
                                            dVar2 = LaunchActivity.S();
                                        }
                                        if (dVar2 != null) {
                                            taaVar.dismiss();
                                            dVar2.presentFragment(new s47(k27Var4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), gl.L(4.0f));
                        ff0 Y2 = bkb.Y(bkb.v0(i11, this.J0), 6, 6);
                        vkb M2 = zkb.M(i11);
                        wjb wjbVar3 = this.J0;
                        linearLayout.setBackground(Y2);
                        zkb.j(linearLayout, Y2, null, M2, wjbVar3);
                        ote.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i12 = bkb.Ll;
                        zkb.s(imageView, i12, this.J0, PorterDuff.Mode.SRC_IN);
                        v9aVar = v9aVar3;
                        linearLayout.addView(imageView, nme.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        zkb.X(textView2, i12, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(k96.E(k27Var3.k.forwards, ','));
                        linearLayout.addView(textView2, nme.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i2 = 8;
                        linearLayout2.addView(linearLayout3, nme.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, nme.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                v9aVar = v9aVar3;
                linearLayout = null;
                i2 = 11;
                linearLayout2.addView(linearLayout3, nme.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                if (linearLayout != null) {
                }
            } else {
                v9aVar = v9aVar3;
                v9aVar2 = v9aVar4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.q1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.t1 = frameLayout5;
                frameLayout4.addView(frameLayout5, nme.d(-1, -1.0f, kk7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i13 = bkb.h6;
                ff0 Y3 = bkb.Y(bkb.v0(i13, this.J0), 20, 20);
                vkb M3 = zkb.M(i13);
                wjb wjbVar4 = this.J0;
                textView3.setBackground(Y3);
                zkb.j(textView3, Y3, null, M3, wjbVar4);
                zkb.X(textView3, this.c2 ? bkb.fh : bkb.m5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                textView3.setTypeface(gl.o());
                textView3.setGravity(17);
                if (!this.c2 || this.j2[1] == null) {
                    textView3.setText(k96.M0(2131751750, null).toUpperCase());
                } else {
                    textView3.setText(k96.M0(2131743145, null).toUpperCase());
                }
                textView3.setOnClickListener(new o9a(this, (byte) 6));
                frameLayout5.addView(textView3, nme.e(-1, -1, kk7.D1));
                this.b.addView(frameLayout4, nme.e(-1, 58, 87));
                ArrayList arrayList3 = this.I1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((k27) this.I1.get(0)).k != null && ((k27) this.I1.get(0)).k.forwards > 0) {
                    final k27 k27Var4 = (k27) this.I1.get(0);
                    if (hc2.N(na7.q1(this.a).K0(Long.valueOf(-k27.B0(k27Var4.k)))) && !k27.l3(k27Var4.k)) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        ff0 Y4 = bkb.Y(bkb.v0(this.c2 ? bkb.Ug : i13, this.J0), 20, 20);
                        vkb M4 = zkb.M(this.c2 ? bkb.Ug : i13);
                        wjb wjbVar5 = this.J0;
                        linearLayout4.setBackground(Y4);
                        zkb.j(linearLayout4, Y4, null, M4, wjbVar5);
                        frameLayout5.addView(linearLayout4, nme.e(-2, -1, 21));
                        final byte b10 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: u9a
                            public final /* synthetic */ taa b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b102 = b10;
                                k27 k27Var42 = k27Var4;
                                taa taaVar = this.b;
                                switch (b102) {
                                    case 0:
                                        d dVar = taaVar.a2;
                                        if (dVar == null) {
                                            dVar = LaunchActivity.S();
                                        }
                                        if (dVar != null) {
                                            taaVar.dismiss();
                                            dVar.presentFragment(new s47(k27Var42));
                                            break;
                                        }
                                        break;
                                    default:
                                        d dVar2 = taaVar.a2;
                                        if (dVar2 == null) {
                                            dVar2 = LaunchActivity.S();
                                        }
                                        if (dVar2 != null) {
                                            taaVar.dismiss();
                                            dVar2.presentFragment(new s47(k27Var42));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        zkb.s(imageView2, this.c2 ? bkb.fh : bkb.m5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, nme.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(k27Var4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        zkb.X(textView4, this.c2 ? bkb.fh : bkb.m5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(gl.o());
                        linearLayout4.addView(textView4, nme.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            this.N1[1].setAlpha(0.0f);
            v9aVar = v9aVar3;
            v9aVar2 = v9aVar4;
            f = 4.0f;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v1 = frameLayout6;
        this.b.addView(frameLayout6, nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.t1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w1 = frameLayout7;
        this.b.addView(frameLayout7, nme.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        y9a y9aVar = new y9a(this, context, (byte) 0);
        this.m1 = y9aVar;
        y9aVar.setWillNotDraw(false);
        y9aVar.setAlpha(0.0f);
        y9aVar.setVisibility(4);
        this.b.addView(y9aVar, nme.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        y9aVar.setOnTouchListener(new jz1((byte) 24));
        ww0 ww0Var = this.c;
        boolean z6 = gl.B(bkb.v0(bkb.g5, this.J0)) > 0.721f;
        this.S2 = z6;
        gl.k3(ww0Var, z6);
        z9a z9aVar = new z9a(this, context, gaaVar, this.J0);
        this.n1 = z9aVar;
        z9aVar.K = true;
        if (this.c2) {
            gt3 editText = z9aVar.getEditText();
            int i14 = bkb.dh;
            editText.setTextColor(bkb.v0(i14, this.J0));
            z9aVar.getEditText().setCursorColor(bkb.v0(i14, this.J0));
        }
        z9aVar.setHint(k96.M0(2131745270, null));
        z9aVar.s();
        z9aVar.setPadding(0, 0, gl.L(84.0f), 0);
        y9aVar.addView(z9aVar, nme.e(-1, -2, 51));
        y9aVar.setClipChildren(false);
        y9aVar.setClipToPadding(false);
        z9aVar.setClipChildren(false);
        z9aVar.getEditText().addTextChangedListener(new aaa(this, (byte) 0));
        y9a y9aVar2 = new y9a(this, context, (byte) 1);
        this.p1 = y9aVar2;
        y9aVar2.setFocusable(true);
        y9aVar2.setFocusableInTouchMode(true);
        y9aVar2.setVisibility(4);
        y9aVar2.setScaleX(0.2f);
        y9aVar2.setScaleY(0.2f);
        y9aVar2.setAlpha(0.0f);
        this.b.addView(y9aVar2, nme.e(kk7.u1, 50, 85));
        jh3 jh3Var = new jh3(this, context, this.J0);
        this.o1 = jh3Var;
        int L3 = gl.L(52.0f);
        int L4 = gl.L(38.0f);
        jh3Var.L = L3;
        jh3Var.M = L4;
        float L5 = gl.L(1.0f);
        float L6 = gl.L(6.0f);
        jh3Var.P = L5;
        jh3Var.Q = L6;
        jh3Var.s0 = true;
        y9aVar2.addView(jh3Var, nme.g());
        jh3Var.setOnClickListener(new o9a(this, (byte) 0));
        jh3Var.setOnLongClickListener(new zs(this, (byte) 16));
        this.e2.setTextSize(gl.L(12.0f));
        this.e2.setTypeface(gl.o());
        if (num != null) {
            this.W1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.X1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Y1 = linearLayout5;
            linearLayout5.setPadding(gl.L(12.0f), gl.L(f), gl.L(12.0f), gl.L(f));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i15 = bkb.h6;
            zkb.R(linearLayout5, bkb.Y(T(i15), 6, 6), null, zkb.M(i15), this.J0);
            wf2 wf2Var = new wf2(24, this.J0, context);
            this.Z1 = wf2Var;
            wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(false, false);
            wf2Var.setDrawBackgroundAsArc(10);
            linearLayout5.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            zkb.X(textView5, i8, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(k96.Z(2131743339, gl.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, nme.t(-2, -2, 16, 9, 0, 0, 0));
            ote.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new o9a(this, (byte) 1));
            frameLayout8.addView(linearLayout5, nme.e(-2, -2, 17));
            if (this.q1 == null) {
                View view2 = new View(context);
                zkb.h(bkb.c7, this.J0, view2);
                frameLayout8.addView(view2, nme.a(-1.0f, this.c2 ? 0.66f : 1.0f / gl.p, 55));
            }
            this.b.addView(frameLayout8, nme.e(-1, 58, 83));
            if (this.q1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        ql0 ql0Var = new ql0(this.N2.b(si9Var, null));
        this.Q2 = ql0Var;
        if (gba.f()) {
            e66.e(262144);
        }
        ql0Var.b(gl.L(72.0f), true);
        il0 b11 = this.M2.b(this.y2, nod.f(this.J0));
        this.P2 = b11;
        b11.U = true;
        b11.s(gl.L(29.0f), gl.L(29.0f), 0.0f, 0.0f);
        b11.u(gl.L(32.0f));
        b11.S.g = 0.4f;
        b11.n();
        il0 b12 = this.L2.b(y9aVar, nod.f(this.J0));
        this.R2 = b12;
        b12.r(gl.L(22.0f));
        b12.q(gl.L(9.0f));
        y9aVar.setPadding(gl.L(9.0f), gl.L(7.0f), gl.L(9.0f), gl.L(7.0f));
        FrameLayout frameLayout9 = this.t1;
        if (frameLayout9 != null) {
            il0 b13 = this.L2.b(frameLayout9, nod.f(this.J0));
            b13.q(gl.L(9.0f));
            b13.r(gl.L(22.0f));
            this.t1.setBackground(b13);
            this.t1.setPadding(gl.L(9.0f), gl.L(9.0f), gl.L(9.0f), gl.L(9.0f));
        }
        FrameLayout frameLayout10 = this.X1;
        if (frameLayout10 != null) {
            il0 b14 = this.L2.b(frameLayout10, nod.f(this.J0));
            b14.q(gl.L(9.0f));
            b14.r(gl.L(22.0f));
            this.X1.setBackground(b14);
            this.X1.setPadding(gl.L(9.0f), gl.L(9.0f), gl.L(9.0f), gl.L(9.0f));
        }
        W0(0);
        cj3.t4(j5.a(this.a));
        if (maaVar.d.isEmpty()) {
            kk7.f(this.a).b(this, kk7.r);
        }
        int i16 = this.a;
        byte b15 = 0;
        ad7.Y(i16).a.c(new bt(i16, (int) b15, (Object) new baa(this), (byte) 6));
        hq6.d0(this.a).O0(true);
        this.X0.i(this.b);
        qw4 qw4Var2 = this.X0;
        qw4Var2.a = new p9a(this, b15);
        qw4Var2.d = new ax4(gl.L(48.0f));
        gl.R3(1.0f, v9aVar, true, false);
        gl.R3(1.0f, v9aVar2, false, false);
        ww0 ww0Var2 = this.c;
        p9a p9aVar = new p9a(this, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(ww0Var2, p9aVar);
    }

    public static taa G0(Context context, k27 k27Var, String str, boolean z, String str2) {
        return new taa(context, k27Var != null ? tb4.t(k27Var) : null, str, null, z, str2, null, false);
    }

    public static void Q0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, wjb wjbVar) {
        int v0 = bkb.v0(i, wjbVar);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i2 = 0;
        while (i2 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
            int i3 = 6;
            int i4 = i2 == 0 ? 6 : 0;
            if (i2 != itemsCount - 1) {
                i3 = 0;
            }
            zkb.R(childAt, bkb.Y(v0, i4, i3), null, zkb.M(i), wjbVar);
            i2++;
        }
    }

    public final void D0(boolean z) {
        no4 no4Var = this.t2;
        l7 l7Var = no4Var.r;
        l7 l7Var2 = no4Var.r;
        boolean isEmpty = TextUtils.isEmpty(l7Var.getText());
        v9a v9aVar = this.A1;
        v9a v9aVar2 = this.B1;
        boolean z2 = true;
        if (!isEmpty || ((this.d && l7Var2.hasFocus()) || this.H2)) {
            this.v2 = true;
            if (this.x2 == null) {
                gl.U3(v9aVar, false, 0.98f, true, true);
                gl.S3(v9aVar2, true);
            }
        } else {
            if (this.x2 == null) {
                gl.U3(v9aVar, true, 0.98f, true, true);
                gl.S3(v9aVar2, false);
            }
            z2 = false;
        }
        if (this.G2 != z2 || z) {
            this.G2 = z2;
            qaa qaaVar = this.H1;
            qaaVar.f();
            this.F1.f();
            boolean z3 = this.G2;
            int i = this.F2;
            if (z3) {
                if (i == Integer.MAX_VALUE) {
                    ((t26) v9aVar2.getLayoutManager()).g1(0, -v9aVar2.getPaddingTop());
                } else {
                    ((t26) v9aVar2.getLayoutManager()).g1(0, this.F2 - v9aVar2.getPaddingTop());
                }
                qaaVar.E(l7Var2.getText().toString());
                return;
            }
            r35 r35Var = this.C1;
            if (i == Integer.MAX_VALUE) {
                r35Var.g1(0, 0);
            } else {
                r35Var.g1(0, 0);
            }
        }
    }

    @Override // fx0
    public final boolean E() {
        return false;
    }

    public final void E0() {
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            View view = null;
            this.x2 = null;
            byte b = 0;
            for (int i = 0; i < J0().getChildCount(); i++) {
                View childAt = J0().getChildAt(i);
                if ((childAt instanceof waa) && ((waa) childAt).getCurrentDialog() == dialog.id) {
                    view = childAt;
                }
            }
            if (view == null) {
                return;
            }
            yla ylaVar = this.w2;
            if (ylaVar != null) {
                ylaVar.d();
            }
            J0().setVisibility(0);
            no4 no4Var = this.t2;
            no4Var.setVisibility(0);
            l7 l7Var = no4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                l7Var.requestFocus();
                gl.F3(l7Var);
            }
            int[] iArr = new int[2];
            yla ylaVar2 = new yla(new ti4(1000.0f));
            zla zlaVar = new zla(0.0f);
            mu1 mu1Var = this.a2;
            zlaVar.b((mu1Var == null || !mu1Var.b) ? 800.0f : 10.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            this.w2 = ylaVar2;
            ylaVar2.b(new n9a(this, (waa) view, iArr, b));
            this.w2.a(new zv0(this, (byte) 9));
            this.w2.h();
        }
    }

    public final void F0() {
        boolean z = false;
        if (this.f2 == null && this.j2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", I0()));
            jaa jaaVar = this.n2;
            if (jaaVar != null) {
                jaaVar.H();
                return;
            }
            if (this.b2 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.b2).H0(new p54((byte) 6, z));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final int H0() {
        v9a v9aVar = this.A1;
        if (v9aVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = v9aVar.getChildAt(0);
        y29 y29Var = (y29) v9aVar.G(childAt);
        if (y29Var == null) {
            return -1000;
        }
        int paddingTop = v9aVar.getPaddingTop();
        if (y29Var.c() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    @Override // fx0
    public void I() {
        super.I();
        z9a z9aVar = this.n1;
        if (z9aVar != null) {
            z9aVar.o();
        }
    }

    public final String I0() {
        String str;
        String[] strArr = this.j2;
        haa haaVar = this.R1;
        if (haaVar != null) {
            str = strArr[haaVar.e ? 1 : 0];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        wf2 wf2Var = this.Z1;
        if (wf2Var != null && wf2Var.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", gl.n0(this.W1)).build().toString();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return str == null ? "" : str;
    }

    public final o39 J0() {
        return (this.G2 || this.H2) ? this.B1 : this.A1;
    }

    public final void K0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        o39 o39Var = this.z1;
        o39Var.setPivotX(width);
        o39Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        o39Var.setScaleX(f3);
        o39Var.setScaleY(f3);
        o39Var.setAlpha(f);
        o39 J0 = J0();
        J0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        J0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        J0.setScaleX(f4);
        J0.setScaleY(f4);
        float f5 = 1.0f - f;
        J0.setAlpha(f5);
        no4 no4Var = this.t2;
        no4Var.setPivotX(no4Var.getWidth() / 2.0f);
        no4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        no4Var.setScaleX(f6);
        no4Var.setScaleY(f6);
        no4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-gl.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(gl.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(gl.L(16.0f) * f5);
        aVar.setAlpha(f);
        o39Var.getLocationInWindow(iArr);
        float interpolation = s33.g.getInterpolation(f);
        for (int i = 0; i < J0.getChildCount(); i++) {
            View childAt = J0.getChildAt(i);
            if (childAt instanceof waa) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
            View childAt2 = o39Var.getChildAt(i2);
            if (childAt2 instanceof cba) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((o39Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        J0.invalidate();
    }

    public final void N0(boolean z) {
        byte b = 0;
        View[] viewArr = this.N1;
        if (z) {
            if (viewArr[0].getTag() == null) {
                return;
            }
        } else if (viewArr[0].getTag() != null) {
            return;
        }
        viewArr[0].setTag(z ? null : 1);
        if (z) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.O1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new eaa(this, z, b));
        animatorSetArr[0].start();
    }

    public final void O0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        paa paaVar;
        if (dialog instanceof laa) {
            M0(view);
            return;
        }
        if (((view instanceof waa) && ((waa) view).G) || ((view instanceof rr8) && ((rr8) view).o0)) {
            S0(dialog.id, view);
            return;
        }
        o39 o39Var = this.z1;
        if (o39Var.getVisibility() != 8 || (activity = this.b2) == null) {
            return;
        }
        boolean y = cf3.y(dialog.id);
        byte b = this.K1;
        if (y) {
            TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
            if (hc2.T(K0) && !K0.megagroup) {
                TLRPC.Chat K02 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
                if ((!hc2.n(K02) && !K02.megagroup) || b == 2 || b == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = k96.M0(2131745404, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    if (b == 3) {
                        if (hc2.P(10, K0)) {
                            hdVar.U = k96.M0(2131751072, null);
                        } else {
                            hdVar.U = k96.M0(2131751073, null);
                        }
                    } else if (b != 2) {
                        hdVar.U = k96.M0(2131752428, null);
                    } else if (this.i2) {
                        hdVar.U = k96.M0(2131746394, null);
                    } else if (hc2.P(10, K0)) {
                        hdVar.U = k96.M0(2131751080, null);
                    } else {
                        hdVar.U = k96.M0(2131751081, null);
                    }
                    ug8.y(null, 2131747638, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (cf3.B(dialog.id) && b != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M02 = k96.M0(2131745404, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M02;
            if (b == 3) {
                hdVar2.U = k96.M0(2131743849, null);
            } else if (b != 0) {
                hdVar2.U = k96.M0(2131746983, null);
            } else {
                hdVar2.U = k96.M0(2131748912, null);
            }
            ug8.y(null, 2131747638, alertDialog$Builder2, null);
            return;
        }
        long j = dialog.id;
        vf6 vf6Var = this.P1;
        if (vf6Var.h(j) >= 0) {
            vf6Var.l(dialog.id);
            this.Q1.remove(dialog);
            if (view instanceof rr8) {
                ((rr8) view).y(false, true);
            } else if (view instanceof waa) {
                ((waa) view).b(false, true);
            }
            W0(1);
        } else {
            TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(dialog.id));
            TLRPC.Chat K03 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
            if ((l7c.v(V1) && (((l = na7.q1(this.a).g4.l(-V1.id)) != null && !l.isEmpty()) || !na7.q1(this.a).g4.e(-V1.id))) || (cf3.y(dialog.id) && (hc2.c0(K03) || (hc2.p0(K03) && hc2.A(this.a, K03, 24))))) {
                this.x2 = dialog;
                this.D1.g1(0, this.k2 - o39Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                caa caaVar = new caa(this, dialog, atomicReference, view);
                atomicReference.set(new bm8((Object) this, (Object) atomicReference, (Object) caaVar, (Object) dialog, (byte) 23));
                kk7 f = kk7.f(this.a);
                int i = kk7.s5;
                f.a(caaVar, i);
                ArrayList l2 = na7.q1(this.a).g4.l(-dialog.id);
                int i2 = this.a;
                if (l2 != null) {
                    caaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                    return;
                } else {
                    na7.q1(i2).g4.o(-dialog.id);
                    gl.e3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            vf6Var.k(dialog, dialog.id);
            if (view instanceof rr8) {
                ((rr8) view).y(true, true);
            } else if (view instanceof waa) {
                ((waa) view).b(true, true);
            }
            W0(2);
            long j2 = y6c.h(this.a).n;
            if (this.G2) {
                maa maaVar = this.F1;
                vf6 vf6Var2 = maaVar.e;
                ArrayList arrayList = maaVar.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var2.f(dialog.id);
                if (dialog2 == null) {
                    maaVar.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j2) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                maaVar.f();
                this.v2 = false;
                no4 no4Var = this.t2;
                no4Var.r.setText("");
                D0(false);
                gl.t1(no4Var.r);
            }
        }
        qaa qaaVar = this.H1;
        if (qaaVar == null || (paaVar = qaaVar.I) == null) {
            return;
        }
        paaVar.l(0, paaVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32 */
    public final void P0(final boolean z) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            vf6 vf6Var = this.P1;
            int m = vf6Var.m();
            y9a y9aVar = this.m1;
            z9a z9aVar = this.n1;
            if (i3 >= m) {
                Editable text = z9aVar.getText();
                mt3 mt3Var = z9aVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = hq6.d0(this.a).Y(charSequenceArr, true, true);
                wf2 wf2Var = this.Z1;
                int i4 = (wf2Var == null || !wf2Var.a.q) ? -1 : this.W1;
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i = 0;
                    while (i2 < vf6Var.m()) {
                        long j = vf6Var.j(i2);
                        long K1 = na7.q1(this.a).K1(j);
                        if (K1 <= 0) {
                            K1 = cf3.j(na7.q1(this.a).I2(j));
                        }
                        if (y9aVar.getTag() != null && mt3Var.length() > 0 && K1 > 0) {
                            i++;
                        }
                        if (K1 > 0) {
                            i++;
                        }
                        if (K1 > 0 && !arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                        }
                        i2++;
                    }
                } else {
                    haa haaVar = this.R1;
                    ?? r9 = haaVar != null ? haaVar.e : 0;
                    if (this.A2 != null) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < vf6Var.m()) {
                            long j2 = vf6Var.j(i5);
                            long K12 = na7.q1(this.a).K1(j2);
                            if (K12 <= 0) {
                                K12 = cf3.j(na7.q1(this.a).I2(j2));
                            }
                            int i7 = i2;
                            if (this.A2 != null && y9aVar.getTag() != null && mt3Var.length() > 0 && charSequenceArr[i7] != null && K12 > 0) {
                                i6++;
                            }
                            if (K12 > 0) {
                                i6++;
                            }
                            if (K12 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                                arrayList.add(Long.valueOf(j2));
                            }
                            i5++;
                            i2 = i7;
                        }
                        i = i6;
                    } else {
                        int i8 = 0;
                        if (this.J1[r9] != null) {
                            for (int i9 = 0; i9 < vf6Var.m(); i9++) {
                                long j3 = vf6Var.j(i9);
                                long K13 = na7.q1(this.a).K1(j3);
                                if (K13 <= 0) {
                                    K13 = cf3.j(na7.q1(this.a).I2(j3));
                                }
                                if (y9aVar.getTag() != null && mt3Var.length() > 0 && K13 > 0) {
                                    i8++;
                                }
                                if (K13 > 0) {
                                    i8++;
                                }
                                if (K13 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                                    arrayList.add(Long.valueOf(j3));
                                }
                            }
                        }
                        i = i8;
                    }
                }
                final int i10 = i4;
                ij.Z(this.a, arrayList, i, new p8c() { // from class: t9a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v10, types: [wjb] */
                    /* JADX WARN: Type inference failed for: r11v12 */
                    /* JADX WARN: Type inference failed for: r11v9 */
                    /* JADX WARN: Type inference failed for: r12v1 */
                    /* JADX WARN: Type inference failed for: r12v2 */
                    /* JADX WARN: Type inference failed for: r12v9 */
                    @Override // p8c
                    public final void a(Object obj) {
                        int i11;
                        boolean z2;
                        int i12;
                        HashMap hashMap;
                        long j4;
                        boolean z3;
                        char c;
                        k27 k27Var;
                        z9a z9aVar2;
                        long longValue;
                        String[] strArr;
                        boolean z4;
                        long j5;
                        int i13;
                        Long l;
                        k27 k27Var2;
                        x3a b;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i14;
                        boolean z5;
                        long j6;
                        Long l2;
                        CharSequence[] charSequenceArr2;
                        k27 k27Var3;
                        k27 k27Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        taa taaVar = taa.this;
                        String[] strArr2 = taaVar.J1;
                        y9a y9aVar2 = taaVar.m1;
                        z9a z9aVar3 = taaVar.n1;
                        HashMap hashMap3 = taaVar.Q1;
                        Long l3 = 0L;
                        vf6 vf6Var2 = taaVar.P1;
                        ArrayList arrayList4 = taaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z6 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i15 = 0;
                            boolean z7 = false;
                            while (true) {
                                if (i15 >= vf6Var2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z8 = z6;
                                long j7 = vf6Var2.j(i15);
                                boolean x2 = na7.q1(taaVar.a).x2(j7);
                                y9a y9aVar3 = y9aVar2;
                                Long l4 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j7));
                                boolean z9 = (l4 == null || l4.longValue() <= 0) ? z7 : true;
                                Long l5 = l4;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j7));
                                if (tL_forumTopic2 == null || !x2) {
                                    i14 = i15;
                                    z5 = x2;
                                    j6 = 0;
                                } else {
                                    i14 = i15;
                                    z5 = x2;
                                    j6 = cf3.n(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z5) {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    k27Var3 = null;
                                } else {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    k27Var3 = new k27(taaVar.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (k27Var3 != null) {
                                    k27Var3.p = true;
                                }
                                if (y9aVar3.getTag() == null || z9aVar3.a.length() <= 0) {
                                    k27Var4 = k27Var3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    k27Var4 = k27Var3;
                                    ArrayList arrayList7 = arrayList5;
                                    x3a b2 = x3a.b(charSequence == null ? null : charSequence.toString(), j7, k27Var4, k27Var3, null, true, arrayList7, null, null, z8, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z8 = z8;
                                    b2.Q = l5 == null ? 0L : l5.longValue();
                                    b2.R = j6;
                                    z3a.B(taaVar.a).q0(b2);
                                }
                                boolean z10 = z8;
                                int p0 = z3a.B(taaVar.a).p0(taaVar.I1, j7, !taaVar.D2, false, z10, 0, 0, k27Var4, i10, l5 == null ? 0L : l5.longValue(), j6, null);
                                if (p0 != 0) {
                                    arrayList6.add(Long.valueOf(j7));
                                }
                                if (vf6Var2.m() == 1) {
                                    ij.q0(p0, r11, taaVar.a2);
                                    if (p0 != 0) {
                                        z7 = z9;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i15 = i14 + 1;
                                arrayList5 = arrayList3;
                                z6 = z10;
                                y9aVar2 = y9aVar3;
                                z7 = z9;
                                l3 = l2;
                                arrayList4 = arrayList2;
                                charSequenceArr3 = charSequenceArr2;
                            }
                            int size = arrayList6.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList6.get(i16);
                                i16++;
                                long longValue2 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var2.f(longValue2);
                                vf6Var2.l(longValue2);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!vf6Var2.i()) {
                                taaVar.L0(vf6Var2, arrayList2.size(), vf6Var2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(0)) : tL_forumTopic, !z7);
                            }
                        } else {
                            boolean z11 = z6;
                            haa haaVar2 = taaVar.R1;
                            ?? r12 = haaVar2 != null ? haaVar2.e : 0;
                            if (taaVar.A2 != null) {
                                int i17 = 0;
                                boolean z12 = false;
                                while (i17 < vf6Var2.m()) {
                                    long j8 = vf6Var2.j(i17);
                                    boolean x22 = na7.q1(taaVar.a).x2(j8);
                                    Long l6 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j8));
                                    if (l6 != null && l6.longValue() > 0) {
                                        z12 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j8));
                                    if (tL_forumTopic3 == null || !x22) {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = 0;
                                    } else {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = cf3.n(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || x22) {
                                        i13 = i17;
                                        l = l6;
                                        k27Var2 = null;
                                    } else {
                                        i13 = i17;
                                        l = l6;
                                        k27Var2 = new k27(taaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (taaVar.A2 != null) {
                                        if (y9aVar2.getTag() != null && z9aVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            k27 k27Var5 = k27Var2;
                                            k27Var2 = k27Var5;
                                            z3a.B(taaVar.a).q0(x3a.b(charSequenceArr3[0].toString(), j8, null, k27Var5, null, true, null, null, null, z11, 0, 0, null, false));
                                        }
                                        b = x3a.b(null, j8, k27Var2, k27Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                        b.I = taaVar.A2;
                                    } else if (y9aVar2.getTag() == null || z9aVar3.a.length() <= 0) {
                                        b = x3a.b(strArr[r12], j8, k27Var2, k27Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z13 = z11;
                                        b = x3a.b(charSequence2 == null ? null : charSequence2.toString(), j8, k27Var2, k27Var2, null, true, arrayList5, null, null, z13, 0, 0, null, false);
                                        z11 = z13;
                                    }
                                    b.Q = l == null ? 0L : l.longValue();
                                    b.R = j5;
                                    z3a.B(taaVar.a).q0(b);
                                    i17 = i13 + 1;
                                    z12 = z4;
                                    strArr2 = strArr;
                                }
                                z2 = z12;
                            } else if (strArr2[r12] != null) {
                                int i18 = 0;
                                boolean z14 = false;
                                while (i18 < vf6Var2.m()) {
                                    long j9 = vf6Var2.j(i18);
                                    boolean x23 = na7.q1(taaVar.a).x2(j9);
                                    Long l7 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j9));
                                    if (l7 != null && l7.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j9));
                                    if (tL_forumTopic4 == null || !x23) {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = 0;
                                    } else {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = cf3.n(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || x23) {
                                        z3 = z14;
                                        c = 0;
                                        k27Var = null;
                                    } else {
                                        z3 = z14;
                                        c = 0;
                                        k27Var = new k27(taaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (y9aVar2.getTag() == null || z9aVar3.a.length() <= 0) {
                                        z9aVar2 = z9aVar3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c];
                                        boolean z15 = z11;
                                        x3a b3 = x3a.b(charSequence3 == null ? null : charSequence3.toString(), j9, k27Var, k27Var, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                        z11 = z15;
                                        if (l7 == null) {
                                            z9aVar2 = z9aVar3;
                                            longValue = 0;
                                        } else {
                                            z9aVar2 = z9aVar3;
                                            longValue = l7.longValue();
                                        }
                                        b3.Q = longValue;
                                        b3.R = j4;
                                        z3a.B(taaVar.a).q0(b3);
                                    }
                                    k27 k27Var6 = k27Var;
                                    x3a b4 = x3a.b(strArr2[r12], j9, k27Var6, k27Var6, null, true, null, null, null, z11, 0, 0, null, false);
                                    b4.Q = l7 == null ? 0L : l7.longValue();
                                    b4.R = j4;
                                    z3a.B(taaVar.a).q0(b4);
                                    i18 = i12 + 1;
                                    z14 = z3;
                                    z9aVar3 = z9aVar2;
                                    hashMap2 = hashMap;
                                }
                                z2 = z14;
                            } else {
                                i11 = 0;
                                z2 = false;
                                taaVar.L0(vf6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(i11)), !z2);
                            }
                            i11 = 0;
                            taaVar.L0(vf6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(i11)), !z2);
                        }
                        jaa jaaVar = taaVar.n2;
                        if (jaaVar != null) {
                            jaaVar.x();
                        }
                        taaVar.dismiss();
                    }
                });
                return;
            }
            if (ij.h(getContext(), this.a, vf6Var.j(i3), y9aVar.getTag() != null && z9aVar.a.length() > 0)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // fx0
    public final int Q() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void R0(boolean z) {
        y9a y9aVar = this.m1;
        byte b = 1;
        if (z == (y9aVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        y9aVar.setTag(z ? 1 : null);
        z9a z9aVar = this.n1;
        if (z9aVar.getEditText().isFocused()) {
            gl.t1(z9aVar.getEditText());
        }
        z9aVar.k(true);
        FrameLayout frameLayout = this.X1;
        y9a y9aVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            y9aVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            y9aVar2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i = z ? 4 : 1;
            WeakHashMap weakHashMap = jdc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            int i2 = z ? 4 : 1;
            WeakHashMap weakHashMap2 = jdc.a;
            linearLayout.setImportantForAccessibility(i2);
        }
        this.y1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(y9aVar, (Property<y9a, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, (Property<y9a, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, (Property<y9a, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, (Property<y9a, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.N1[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.t1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.c2 && z) {
                f = gl.L(this.Y1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new eaa(this, z, b));
        this.y1.start();
    }

    public final void S0(long j, View view) {
        int i = -this.C2;
        this.C2 = i;
        gl.B3(i, view, null);
        pw0.E.a();
        String q = j >= 0 ? l7c.q(na7.q1(this.a).V1(Long.valueOf(j))) : "";
        boolean E3 = na7.q1(this.a).E3();
        wjb wjbVar = this.J0;
        byte b = 1;
        FrameLayout frameLayout = this.v1;
        (E3 ? new u21(frameLayout, wjbVar).Q(R.raw.star_premium_2, 36, gl.T2(k96.a0(null, null, 2131743521, q))) : new u21(frameLayout, wjbVar).K(R.raw.star_premium_2, gl.T2(k96.a0(null, null, 2131743521, q)), k96.M0(2131743520, null), new q9a(this, b))).j();
    }

    public final void T0() {
        gb gbVar;
        y9a y9aVar = this.m1;
        if (y9aVar == null) {
            return;
        }
        z9a z9aVar = this.n1;
        if (z9aVar == null || !z9aVar.m()) {
            gaa gaaVar = this.y2;
            if (gaaVar != null && (gbVar = gaaVar.I) != null && !gbVar.f) {
                Typeface typeface = gl.a;
            }
        } else {
            z9aVar.getEmojiPaddingShown();
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + gl.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        y9aVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void U0() {
        if (this.m2) {
            return;
        }
        boolean z = this.G2;
        v9a v9aVar = this.A1;
        v9a v9aVar2 = this.B1;
        v9a v9aVar3 = z ? v9aVar2 : v9aVar;
        if (v9aVar3.getChildCount() > 0) {
            View childAt = v9aVar3.getChildAt(0);
            for (int i = 0; i < v9aVar3.getChildCount(); i++) {
                if (v9aVar3.getChildAt(i).getTop() < childAt.getTop()) {
                    childAt = v9aVar3.getChildAt(i);
                }
            }
            y29 y29Var = (y29) v9aVar3.G(childAt);
            int top = childAt.getTop() - gl.L(8.0f);
            int i2 = (top <= 0 || y29Var == null || y29Var.b() != 0) ? 0 : top;
            if (top < 0 || y29Var == null || y29Var.b() != 0) {
                this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                N0(true);
                top = i2;
            } else {
                this.F2 = childAt.getTop();
                N0(false);
            }
            o39 o39Var = this.z1;
            if (o39Var.getVisibility() == 0) {
                if (o39Var.getChildCount() <= 0) {
                    return;
                }
                View childAt2 = o39Var.getChildAt(0);
                for (int i3 = 0; i3 < o39Var.getChildCount(); i3++) {
                    if (o39Var.getChildAt(i3).getTop() < childAt2.getTop()) {
                        childAt2 = o39Var.getChildAt(i3);
                    }
                }
                y29 y29Var2 = (y29) o39Var.G(childAt2);
                int top2 = childAt2.getTop() - gl.L(8.0f);
                int i4 = (top2 <= 0 || y29Var2 == null || y29Var2.b() != 0) ? 0 : top2;
                if (top2 < 0 || y29Var2 == null || y29Var2.b() != 0) {
                    this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    N0(true);
                    top2 = i4;
                } else {
                    this.F2 = childAt2.getTop();
                    N0(false);
                }
                top = gl.U1(o39Var.getAlpha(), top, top2);
            }
            int i5 = this.k2;
            if (i5 != top) {
                this.l2 = i5;
                float f = top;
                int i6 = (int) (this.o2 + f);
                this.k2 = i6;
                v9aVar.setTopGlowOffset(i6);
                int i7 = (int) (this.o2 + f);
                this.k2 = i7;
                v9aVar2.setTopGlowOffset(i7);
                int i8 = (int) (f + this.o2);
                this.k2 = i8;
                o39Var.setTopGlowOffset(i8);
                this.l1.setTranslationY(this.k2 + this.o2);
                this.L1.setTranslationY(this.k2 + this.o2);
                this.b.invalidate();
            }
        }
    }

    public final void V0() {
        jia jiaVar = this.u1;
        if (jiaVar != null) {
            String I0 = I0();
            if (I0.startsWith("https://")) {
                I0 = I0.substring(8);
            } else if (I0.startsWith("http://")) {
                I0 = I0.substring(7);
            }
            jiaVar.l(I0, false);
        }
    }

    public final void W0(int i) {
        vf6 vf6Var = this.P1;
        if (vf6Var.m() == 0) {
            R0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.m1.getTag();
        z9a z9aVar = this.n1;
        if (tag != null && z9aVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < vf6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) vf6Var.n(i2)).id;
            long K1 = na7.q1(this.a).K1(j2);
            if (K1 <= 0) {
                K1 = cf3.j(na7.q1(this.a).I2(j2));
            }
            j += K1;
        }
        int max = Math.max(1, vf6Var.m());
        boolean z = i != 0;
        jh3 jh3Var = this.o1;
        jh3Var.f(max, z);
        jh3Var.i(size, j, i != 0);
        R0(true);
        z9aVar.setPadding(0, 0, Math.max(gl.L(84.0f), jh3Var.l()), 0);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.r;
        if (i == i3) {
            maa maaVar = this.F1;
            if (maaVar != null) {
                maaVar.E();
            }
            kk7.f(this.a).n(this, i3);
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        z9a z9aVar = this.n1;
        if (z9aVar != null) {
            gl.t1(z9aVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        kk7.f(this.a).n(this, kk7.r);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        if (this.x2 != null) {
            E0();
            return;
        }
        z9a z9aVar = this.n1;
        if (z9aVar == null || !z9aVar.e) {
            super.onBackPressed();
        } else {
            z9aVar.k(true);
        }
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            ix4 ix4Var = this.K2;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.c6, this.J0));
            }
            ww0 ww0Var = this.c;
            if (ww0Var != null) {
                boolean z = gl.B(bkb.v0(bkb.g5, this.J0)) > 0.721f;
                if (z != this.S2) {
                    this.S2 = z;
                    gl.k3(ww0Var, z);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void M0(View view) {
    }

    public void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public taa(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public taa(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, wjb wjbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, wjbVar);
    }
}
