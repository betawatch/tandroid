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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class tca extends my0 implements jm7 {
    public static final /* synthetic */ int T2 = 0;
    public final vba A1;
    public TL_stories.StoryItem A2;
    public final vba B1;
    public iq5 B2;
    public final q55 C1;
    public int C2;
    public final q55 D1;
    public boolean D2;
    public final vd4 E1;
    public m8 E2;
    public final mca F1;
    public int F2;
    public final rca G1;
    public boolean G2;
    public final qca H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final mr3 J2;
    public final byte K1;
    public final kz4 K2;
    public final a1b L1;
    public final km0 L2;
    public final Drawable M1;
    public final km0 M2;
    public final View[] N1;
    public final km0 N2;
    public final AnimatorSet[] O1;
    public final ms0 O2;
    public final vh6 P1;
    public final im0 P2;
    public final HashMap Q1;
    public final qm0 Q2;
    public final hca R1;
    public final im0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final jh2 Z1;
    public final yv1 a2;
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
    public final yba m1;
    public boolean m2;
    public final zba n1;
    public jca n2;
    public final vi3 o1;
    public float o2;
    public final yba p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final xd9 s1;
    public final w49 s2;
    public final FrameLayout t1;
    public final oq4 t2;
    public final lka u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public zna w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final gca y2;
    public final r59 z1;
    public ArrayList z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tca(Context context, yv1 yv1Var, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, ylb ylbVar) {
        super(1, ylbVar, context, true);
        byte b;
        int i;
        float f;
        vba vbaVar;
        vba vbaVar2;
        LinearLayout linearLayout;
        int i2;
        final byte b2 = 1;
        final byte b3 = 2;
        String[] strArr = new String[2];
        this.J1 = strArr;
        this.N1 = new View[2];
        this.O1 = new AnimatorSet[2];
        this.P1 = new vh6();
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
        this.B2 = iq5.e;
        this.C2 = 4;
        this.D2 = true;
        this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        gm.S(getWindow());
        kz4 d = this.X0.d(new pba(this, b5));
        this.K2 = d;
        if (Build.VERSION.SDK_INT < 31 || !gda.f()) {
            this.J2 = null;
            km0 km0Var = new km0(d, d, d);
            km0Var.j = this.X0;
            this.M2 = km0Var;
            this.L2 = km0Var;
            this.N2 = km0Var;
        } else {
            mr3 mr3Var = new mr3(false);
            this.J2 = mr3Var;
            this.X0.a(mr3Var);
            nz4 nz4Var = new nz4(d);
            nz4Var.f = d;
            nz4Var.d = mr3Var;
            nz4Var.e = -2;
            nz4 nz4Var2 = new nz4(d);
            nz4Var2.f = d;
            nz4Var2.d = mr3Var;
            nz4Var2.e = -3;
            km0 km0Var2 = new km0(nz4Var, nz4Var, nz4Var);
            this.L2 = km0Var2;
            km0Var2.k = true;
            int L = e86.e(262144) ? gm.L(8.0f) : gm.L(48.0f);
            km0Var2.d = L;
            km0Var2.e = L;
            km0Var2.j = this.X0;
            km0 km0Var3 = new km0(nz4Var2, nz4Var2, nz4Var2);
            this.M2 = km0Var3;
            km0Var3.k = true;
            int L2 = gm.L(48.0f);
            km0Var3.d = L2;
            km0Var3.e = L2;
            sy4 sy4Var = this.X0;
            km0Var3.j = sy4Var;
            km0 km0Var4 = new km0(d, d, d);
            this.N2 = km0Var4;
            km0Var4.j = sy4Var;
        }
        this.J0 = ylbVar;
        this.U1 = z4;
        this.b2 = gm.W(context);
        this.c2 = z3;
        byte b6 = 3;
        if (z3) {
            this.J0 = new q63(b6);
        }
        d.a(cmb.v0(cmb.c6, this.J0));
        this.a2 = yv1Var;
        Drawable d2 = b10.d(context, R.drawable.sheet_shadow_round);
        this.M1 = d2;
        int i5 = cmb.g5;
        this.b0 = i5;
        d2.setColorFilter(new PorterDuffColorFilter(cmb.v0(i5, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z2;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            k47 k47Var = (k47) arrayList.get(0);
            String q = pg3.q(oc7.r1(this.a).a2(k47.B0(k47Var.k)));
            if (!TextUtils.isEmpty(q)) {
                StringBuilder sb = new StringBuilder("https://");
                kt6.v(sb, oc7.r1(this.a).N2, "/", q, "/");
                sb.append(k47Var.e1());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && k47Var.z2()) {
                    strArr2[0] = b10.j(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.I1 = arrayList;
        this.H1 = new qca(this, context);
        this.i2 = z;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new tu(this, b6);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                k47 k47Var2 = (k47) this.I1.get(i6);
                if (k47Var2.C4()) {
                    this.K1 = (byte) 3;
                } else if (k47Var2.S3()) {
                    byte b7 = k47Var2.Y3() ? (byte) 2 : (byte) 1;
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
            tL_channels_exportMessageLink.id = ((k47) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = oc7.r1(this.a).g1(((k47) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new jl7(this, context, (byte) 26));
        }
        gca gcaVar = new gca(this, context);
        this.y2 = gcaVar;
        this.b = gcaVar;
        gcaVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.setPadding(i7, 0, i7, this.B2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l1 = frameLayout;
        frameLayout.setBackground(new hd(this));
        if (this.c2 && this.j2[1] != null) {
            hca hcaVar = new hca(this, context);
            this.R1 = hcaVar;
            frameLayout.addView(hcaVar, qoe.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        oq4 oq4Var = new oq4(context, this.J0);
        this.t2 = oq4Var;
        aca acaVar = new aca(this, b2);
        l7 l7Var = oq4Var.r;
        l7Var.addTextChangedListener(acaVar);
        l7Var.setHint(jb6.M0(2131745174, null));
        l7Var.setOnEditorActionListener(new j(this, (byte) 25));
        oq4Var.setCloseButtonOnClickListener(new qba(this, b4));
        frameLayout.addView(oq4Var, qoe.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        a aVar = new a(context, null);
        this.u2 = aVar;
        aVar.setOccupyStatusBar(false);
        aVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i8 = cmb.i5;
        anb.l(aVar, 5, i8, this.J0);
        anb.l(aVar, 6, cmb.p5, this.J0);
        anb.l(aVar, 1, cmb.y6, null);
        anb.l(aVar, 3, cmb.t8, null);
        aVar.setActionBarMenuOnItemClick(new im8(this, (byte) 15));
        aVar.setVisibility(8);
        frameLayout.addView(aVar, qoe.e(-1, 58, 83));
        r59 r59Var = new r59(context, this.J0);
        this.z1 = r59Var;
        q55 q55Var = new q55(4);
        this.D1 = q55Var;
        r59Var.setLayoutManager(q55Var);
        q55Var.O = new wba(this, b3);
        r59Var.setOnScrollListener(new xba(this, b3));
        rca rcaVar = new rca(this, context);
        this.G1 = rcaVar;
        r59Var.setAdapter(rcaVar);
        int i9 = cmb.z5;
        anb.l(r59Var, 21, i9, this.J0);
        r59Var.setVerticalScrollBarEnabled(false);
        r59Var.setHorizontalScrollBarEnabled(false);
        r59Var.setOverScrollMode(2);
        r59Var.setSelectorDrawableColor(0);
        r59Var.setItemSelectorColorProvider(new dq9(b));
        r59Var.setPadding(0, 0, 0, gm.L(48.0f));
        r59Var.setClipToPadding(false);
        byte b8 = 11;
        r59Var.i(new as1(b8));
        r59Var.setOnItemClickListener(new f59(this) { // from class: rba
            public final /* synthetic */ tca b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // f59
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void g(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b4;
                TLRPC.Dialog dialog2 = null;
                tca tcaVar = this.b;
                switch (b9) {
                    case 0:
                        oq4 oq4Var2 = tcaVar.t2;
                        HashMap hashMap = tcaVar.Q1;
                        vh6 vh6Var = tcaVar.P1;
                        mca mcaVar = tcaVar.F1;
                        rca rcaVar2 = tcaVar.G1;
                        if (rcaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = tcaVar.x2;
                            if (dialog3 != null) {
                                vh6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar.e.f(dialog3.id)) == null) {
                                        mcaVar.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = mcaVar.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    mcaVar.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < tcaVar.J0().getChildCount(); i11++) {
                                    View childAt = tcaVar.J0().getChildAt(i11);
                                    if (childAt instanceof wca) {
                                        wca wcaVar = (wca) childAt;
                                        if (wcaVar.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar.d(null, false, true);
                                            wcaVar.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = rcaVar2.E(i10);
                            if (E != null && (dialog = tcaVar.x2) != null) {
                                long j = dialog.id;
                                boolean y2 = oc7.r1(tcaVar.a).y2(j);
                                TLRPC.Dialog dialog4 = tcaVar.x2;
                                vh6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar.e.f(dialog4.id)) == null) {
                                        mcaVar.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = mcaVar.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    mcaVar.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < tcaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = tcaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof wca) {
                                        wca wcaVar2 = (wca) childAt2;
                                        if (wcaVar2.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar2.d(E, y2, true);
                                            wcaVar2.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = tcaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                tcaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qca qcaVar = tcaVar.H1;
                            tca tcaVar2 = qcaVar.L;
                            int i14 = qcaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qcaVar.d.size();
                                    ArrayList arrayList5 = qcaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((ica) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qcaVar.e.d;
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
                                    tcaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < tcaVar2.z2.size()) {
                                    TLObject tLObject2 = ((lm3) tcaVar2.z2.get(i16)).a;
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
        r59Var.setVisibility(8);
        this.b.addView(r59Var, qoe.e(-1, -1, 51));
        vba vbaVar3 = new vba(this, context, this.J0, b4);
        this.A1 = vbaVar3;
        vbaVar3.setSelectorDrawableColor(0);
        vbaVar3.setItemSelectorColorProvider(new dq9((byte) 12));
        vbaVar3.setPadding(0, 0, 0, gm.L(48.0f));
        vbaVar3.setClipToPadding(false);
        getContext();
        q55 q55Var2 = new q55(4);
        this.C1 = q55Var2;
        vbaVar3.setLayoutManager(q55Var2);
        this.O2 = new ms0(this, b8);
        q55Var2.O = new wba(this, b4);
        vbaVar3.setHorizontalScrollBarEnabled(false);
        vbaVar3.setVerticalScrollBarEnabled(false);
        vbaVar3.setOverScrollMode(2);
        vbaVar3.i(new as1((byte) 12));
        this.b.addView(vbaVar3, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        mca mcaVar = new mca(this, context);
        this.F1 = mcaVar;
        vbaVar3.setAdapter(mcaVar);
        anb.l(vbaVar3, 21, i9, this.J0);
        vbaVar3.setOnItemClickListener(new f59(this) { // from class: rba
            public final /* synthetic */ tca b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // f59
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void g(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b2;
                TLRPC.Dialog dialog2 = null;
                tca tcaVar = this.b;
                switch (b9) {
                    case 0:
                        oq4 oq4Var2 = tcaVar.t2;
                        HashMap hashMap = tcaVar.Q1;
                        vh6 vh6Var = tcaVar.P1;
                        mca mcaVar2 = tcaVar.F1;
                        rca rcaVar2 = tcaVar.G1;
                        if (rcaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = tcaVar.x2;
                            if (dialog3 != null) {
                                vh6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar2.e.f(dialog3.id)) == null) {
                                        mcaVar2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = mcaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    mcaVar2.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < tcaVar.J0().getChildCount(); i11++) {
                                    View childAt = tcaVar.J0().getChildAt(i11);
                                    if (childAt instanceof wca) {
                                        wca wcaVar = (wca) childAt;
                                        if (wcaVar.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar.d(null, false, true);
                                            wcaVar.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = rcaVar2.E(i10);
                            if (E != null && (dialog = tcaVar.x2) != null) {
                                long j = dialog.id;
                                boolean y2 = oc7.r1(tcaVar.a).y2(j);
                                TLRPC.Dialog dialog4 = tcaVar.x2;
                                vh6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar2.e.f(dialog4.id)) == null) {
                                        mcaVar2.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = mcaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    mcaVar2.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < tcaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = tcaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof wca) {
                                        wca wcaVar2 = (wca) childAt2;
                                        if (wcaVar2.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar2.d(E, y2, true);
                                            wcaVar2.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = tcaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                tcaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qca qcaVar = tcaVar.H1;
                            tca tcaVar2 = qcaVar.L;
                            int i14 = qcaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qcaVar.d.size();
                                    ArrayList arrayList5 = qcaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((ica) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qcaVar.e.d;
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
                                    tcaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < tcaVar2.z2.size()) {
                                    TLObject tLObject2 = ((lm3) tcaVar2.z2.get(i16)).a;
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
        vbaVar3.setOnScrollListener(new xba(this, b4));
        this.X0.b(vbaVar3);
        vba vbaVar4 = new vba(this, context, this.J0, b2);
        this.B1 = vbaVar4;
        vbaVar4.setItemSelectorColorProvider(new dq9((byte) 12));
        vbaVar4.setSelectorDrawableColor(0);
        vbaVar4.setPadding(0, 0, 0, gm.L(48.0f));
        vbaVar4.setClipToPadding(false);
        getContext();
        vd4 vd4Var = new vd4(4, 0, vbaVar4);
        this.E1 = vd4Var;
        vbaVar4.setLayoutManager(vd4Var);
        vd4Var.O = new wba(this, b2);
        vbaVar4.setOnItemClickListener(new f59(this) { // from class: rba
            public final /* synthetic */ tca b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // f59
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void g(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b9 = b3;
                TLRPC.Dialog dialog2 = null;
                tca tcaVar = this.b;
                switch (b9) {
                    case 0:
                        oq4 oq4Var2 = tcaVar.t2;
                        HashMap hashMap = tcaVar.Q1;
                        vh6 vh6Var = tcaVar.P1;
                        mca mcaVar2 = tcaVar.F1;
                        rca rcaVar2 = tcaVar.G1;
                        if (rcaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = tcaVar.x2;
                            if (dialog3 != null) {
                                vh6Var.k(dialog3, dialog3.id);
                                hashMap.remove(dialog3);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar2.e.f(dialog3.id)) == null) {
                                        mcaVar2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList2 = mcaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    mcaVar2.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i11 = 0; i11 < tcaVar.J0().getChildCount(); i11++) {
                                    View childAt = tcaVar.J0().getChildAt(i11);
                                    if (childAt instanceof wca) {
                                        wca wcaVar = (wca) childAt;
                                        if (wcaVar.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar.d(null, false, true);
                                            wcaVar.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = rcaVar2.E(i10);
                            if (E != null && (dialog = tcaVar.x2) != null) {
                                long j = dialog.id;
                                boolean y2 = oc7.r1(tcaVar.a).y2(j);
                                TLRPC.Dialog dialog4 = tcaVar.x2;
                                vh6Var.k(dialog4, j);
                                hashMap.put(dialog4, E);
                                tcaVar.W0(2);
                                if (tcaVar.G2 || tcaVar.H2) {
                                    if (((TLRPC.Dialog) mcaVar2.e.f(dialog4.id)) == null) {
                                        mcaVar2.e.k(dialog4, dialog4.id);
                                        ArrayList arrayList3 = mcaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    mcaVar2.f();
                                    tcaVar.v2 = false;
                                    oq4Var2.r.setText("");
                                    tcaVar.D0(false);
                                }
                                for (int i12 = 0; i12 < tcaVar.J0().getChildCount(); i12++) {
                                    View childAt2 = tcaVar.J0().getChildAt(i12);
                                    if (childAt2 instanceof wca) {
                                        wca wcaVar2 = (wca) childAt2;
                                        if (wcaVar2.getCurrentDialog() == tcaVar.x2.id) {
                                            wcaVar2.d(E, y2, true);
                                            wcaVar2.b(true, true);
                                        }
                                    }
                                }
                                tcaVar.E0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = tcaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                tcaVar.O0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            qca qcaVar = tcaVar.H1;
                            tca tcaVar2 = qcaVar.L;
                            int i14 = qcaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = qcaVar.d.size();
                                    ArrayList arrayList5 = qcaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((ica) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = qcaVar.e.d;
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
                                    tcaVar.O0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < tcaVar2.z2.size()) {
                                    TLObject tLObject2 = ((lm3) tcaVar2.z2.get(i16)).a;
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
        vbaVar4.setHasFixedSize(true);
        vbaVar4.setItemAnimator(null);
        vbaVar4.setHorizontalScrollBarEnabled(false);
        vbaVar4.setVerticalScrollBarEnabled(false);
        vbaVar4.setOnScrollListener(new xba(this, b2));
        vbaVar4.i(new as1((byte) 13));
        vbaVar4.setAdapter(this.H1);
        anb.l(vbaVar4, 21, i9, this.J0);
        this.s2 = new w49(vbaVar4, true);
        tk4 tk4Var = new tk4(context, this.J0);
        tk4Var.setViewType(12);
        a1b a1bVar = new a1b(context, tk4Var, 1, this.J0);
        this.L1 = a1bVar;
        a1bVar.addView(tk4Var, 0);
        a1bVar.setAnimateLayoutChange(true);
        a1bVar.e(false, false);
        boolean z5 = this.c2;
        xna xnaVar = a1bVar.d;
        if (z5) {
            anb.X(xnaVar, cmb.dh, this.J0);
        }
        xnaVar.setText(jb6.M0(2131747901, null));
        vbaVar4.setEmptyView(a1bVar);
        vbaVar4.setHideIfEmpty(false);
        vbaVar4.X1 = true;
        vbaVar4.Y1 = false;
        this.b.addView(a1bVar, qoe.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(vbaVar4, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        xd9 xd9Var = new xd9((byte) 4, context, this);
        this.s1 = xd9Var;
        this.b.addView(xd9Var, qoe.e(-1, nm7.W4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm.e1(), 51);
        layoutParams.topMargin = gm.L((!this.c2 || this.j2[1] == null) ? 58.0f : 111.0f);
        this.N1[0] = new View(context);
        View view = this.N1[0];
        int i10 = cmb.U5;
        anb.h(i10, this.J0, view);
        this.N1[0].setAlpha(0.0f);
        this.N1[0].setTag(1);
        this.b.addView(this.N1[0], layoutParams);
        this.b.addView(frameLayout, qoe.e(-1, (!this.c2 || this.j2[1] == null) ? 58 : nm7.v1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm.e1(), 83);
        layoutParams2.bottomMargin = gm.L(48.0f);
        this.N1[1] = new View(context);
        anb.h(i10, this.J0, this.N1[1]);
        this.N1[1].setLayoutParams(layoutParams2);
        if (this.i2 || this.j2[0] != null) {
            f = 4.0f;
            if (this.c2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.q1 = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.t1 = frameLayout3;
                frameLayout2.addView(frameLayout3, qoe.d(-1, -1.0f, nm7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, qoe.e(-1, -1, nm7.D1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                rve.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new oba(this, (byte) 4));
                lka lkaVar = new lka(context);
                this.u1 = lkaVar;
                lkaVar.setTextSize(15);
                anb.W(lkaVar, cmb.Jl, this.J0);
                lkaVar.setEllipsizeByGradient(true);
                V0();
                linearLayout3.addView(lkaVar, qoe.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                anb.X(textView, cmb.F6, this.J0);
                textView.setText(jb6.M0(2131751704, null).toUpperCase());
                textView.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
                textView.setTypeface(gm.o());
                textView.setGravity(17);
                int i11 = cmb.h6;
                fg0 Y = cmb.Y(cmb.v0(i11, this.J0), 4, 4);
                wmb M = anb.M(i11);
                ylb ylbVar2 = this.J0;
                textView.setBackground(Y);
                vbaVar2 = vbaVar4;
                anb.j(textView, Y, null, M, ylbVar2);
                linearLayout3.addView(textView, qoe.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new oba(this, (byte) 5));
                rve.a(textView);
                this.b.addView(frameLayout2, qoe.e(-1, 58, 83));
                ArrayList arrayList2 = this.I1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((k47) this.I1.get(0)).k != null && ((k47) this.I1.get(0)).k.forwards > 0) {
                    final k47 k47Var3 = (k47) this.I1.get(0);
                    if (sd2.N(oc7.r1(this.a).L0(Long.valueOf(-k47.B0(k47Var3.k)))) && !k47.l3(k47Var3.k)) {
                        final byte b9 = 0;
                        linearLayout = hg9.i(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: uba
                            public final /* synthetic */ tca b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b10 = b9;
                                k47 k47Var4 = k47Var3;
                                tca tcaVar = this.b;
                                switch (b10) {
                                    case 0:
                                        d dVar = tcaVar.a2;
                                        if (dVar == null) {
                                            dVar = LaunchActivity.S();
                                        }
                                        if (dVar != null) {
                                            tcaVar.dismiss();
                                            dVar.presentFragment(new t67(k47Var4));
                                            break;
                                        }
                                        break;
                                    default:
                                        d dVar2 = tcaVar.a2;
                                        if (dVar2 == null) {
                                            dVar2 = LaunchActivity.S();
                                        }
                                        if (dVar2 != null) {
                                            tcaVar.dismiss();
                                            dVar2.presentFragment(new t67(k47Var4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), gm.L(4.0f));
                        fg0 Y2 = cmb.Y(cmb.v0(i11, this.J0), 6, 6);
                        wmb M2 = anb.M(i11);
                        ylb ylbVar3 = this.J0;
                        linearLayout.setBackground(Y2);
                        anb.j(linearLayout, Y2, null, M2, ylbVar3);
                        rve.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i12 = cmb.Ll;
                        anb.s(imageView, i12, this.J0, PorterDuff.Mode.SRC_IN);
                        vbaVar = vbaVar3;
                        linearLayout.addView(imageView, qoe.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        anb.X(textView2, i12, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(jb6.E(k47Var3.k.forwards, ','));
                        linearLayout.addView(textView2, qoe.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i2 = 8;
                        linearLayout2.addView(linearLayout3, qoe.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, qoe.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                vbaVar = vbaVar3;
                linearLayout = null;
                i2 = 11;
                linearLayout2.addView(linearLayout3, qoe.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                if (linearLayout != null) {
                }
            } else {
                vbaVar = vbaVar3;
                vbaVar2 = vbaVar4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.q1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.t1 = frameLayout5;
                frameLayout4.addView(frameLayout5, qoe.d(-1, -1.0f, nm7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i13 = cmb.h6;
                fg0 Y3 = cmb.Y(cmb.v0(i13, this.J0), 20, 20);
                wmb M3 = anb.M(i13);
                ylb ylbVar4 = this.J0;
                textView3.setBackground(Y3);
                anb.j(textView3, Y3, null, M3, ylbVar4);
                anb.X(textView3, this.c2 ? cmb.fh : cmb.m5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                textView3.setTypeface(gm.o());
                textView3.setGravity(17);
                if (!this.c2 || this.j2[1] == null) {
                    textView3.setText(jb6.M0(2131751699, null).toUpperCase());
                } else {
                    textView3.setText(jb6.M0(2131743071, null).toUpperCase());
                }
                textView3.setOnClickListener(new oba(this, (byte) 6));
                frameLayout5.addView(textView3, qoe.e(-1, -1, nm7.D1));
                this.b.addView(frameLayout4, qoe.e(-1, 58, 87));
                ArrayList arrayList3 = this.I1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((k47) this.I1.get(0)).k != null && ((k47) this.I1.get(0)).k.forwards > 0) {
                    final k47 k47Var4 = (k47) this.I1.get(0);
                    if (sd2.N(oc7.r1(this.a).L0(Long.valueOf(-k47.B0(k47Var4.k)))) && !k47.l3(k47Var4.k)) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        fg0 Y4 = cmb.Y(cmb.v0(this.c2 ? cmb.Ug : i13, this.J0), 20, 20);
                        wmb M4 = anb.M(this.c2 ? cmb.Ug : i13);
                        ylb ylbVar5 = this.J0;
                        linearLayout4.setBackground(Y4);
                        anb.j(linearLayout4, Y4, null, M4, ylbVar5);
                        frameLayout5.addView(linearLayout4, qoe.e(-2, -1, 21));
                        final byte b10 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: uba
                            public final /* synthetic */ tca b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b102 = b10;
                                k47 k47Var42 = k47Var4;
                                tca tcaVar = this.b;
                                switch (b102) {
                                    case 0:
                                        d dVar = tcaVar.a2;
                                        if (dVar == null) {
                                            dVar = LaunchActivity.S();
                                        }
                                        if (dVar != null) {
                                            tcaVar.dismiss();
                                            dVar.presentFragment(new t67(k47Var42));
                                            break;
                                        }
                                        break;
                                    default:
                                        d dVar2 = tcaVar.a2;
                                        if (dVar2 == null) {
                                            dVar2 = LaunchActivity.S();
                                        }
                                        if (dVar2 != null) {
                                            tcaVar.dismiss();
                                            dVar2.presentFragment(new t67(k47Var42));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        anb.s(imageView2, this.c2 ? cmb.fh : cmb.m5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, qoe.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(k47Var4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        anb.X(textView4, this.c2 ? cmb.fh : cmb.m5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(gm.o());
                        linearLayout4.addView(textView4, qoe.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            this.N1[1].setAlpha(0.0f);
            vbaVar = vbaVar3;
            vbaVar2 = vbaVar4;
            f = 4.0f;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v1 = frameLayout6;
        this.b.addView(frameLayout6, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.t1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w1 = frameLayout7;
        this.b.addView(frameLayout7, qoe.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        yba ybaVar = new yba(this, context, (byte) 0);
        this.m1 = ybaVar;
        ybaVar.setWillNotDraw(false);
        ybaVar.setAlpha(0.0f);
        ybaVar.setVisibility(4);
        this.b.addView(ybaVar, qoe.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        ybaVar.setOnTouchListener(new w02((byte) 24));
        dy0 dy0Var = this.c;
        boolean z6 = gm.B(cmb.v0(cmb.g5, this.J0)) > 0.721f;
        this.S2 = z6;
        gm.j3(dy0Var, z6);
        zba zbaVar = new zba(this, context, gcaVar, this.J0);
        this.n1 = zbaVar;
        zbaVar.K = true;
        if (this.c2) {
            qu3 editText = zbaVar.getEditText();
            int i14 = cmb.dh;
            editText.setTextColor(cmb.v0(i14, this.J0));
            zbaVar.getEditText().setCursorColor(cmb.v0(i14, this.J0));
        }
        zbaVar.setHint(jb6.M0(2131745196, null));
        zbaVar.s();
        zbaVar.setPadding(0, 0, gm.L(84.0f), 0);
        ybaVar.addView(zbaVar, qoe.e(-1, -2, 51));
        ybaVar.setClipChildren(false);
        ybaVar.setClipToPadding(false);
        zbaVar.setClipChildren(false);
        zbaVar.getEditText().addTextChangedListener(new aca(this, (byte) 0));
        yba ybaVar2 = new yba(this, context, (byte) 1);
        this.p1 = ybaVar2;
        ybaVar2.setFocusable(true);
        ybaVar2.setFocusableInTouchMode(true);
        ybaVar2.setVisibility(4);
        ybaVar2.setScaleX(0.2f);
        ybaVar2.setScaleY(0.2f);
        ybaVar2.setAlpha(0.0f);
        this.b.addView(ybaVar2, qoe.e(nm7.u1, 50, 85));
        vi3 vi3Var = new vi3(this, context, this.J0);
        this.o1 = vi3Var;
        int L3 = gm.L(52.0f);
        int L4 = gm.L(38.0f);
        vi3Var.L = L3;
        vi3Var.M = L4;
        float L5 = gm.L(1.0f);
        float L6 = gm.L(6.0f);
        vi3Var.P = L5;
        vi3Var.Q = L6;
        vi3Var.s0 = true;
        ybaVar2.addView(vi3Var, qoe.g());
        vi3Var.setOnClickListener(new oba(this, (byte) 0));
        vi3Var.setOnLongClickListener(new au(this, (byte) 16));
        this.e2.setTextSize(gm.L(12.0f));
        this.e2.setTypeface(gm.o());
        if (num != null) {
            this.W1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.X1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Y1 = linearLayout5;
            linearLayout5.setPadding(gm.L(12.0f), gm.L(f), gm.L(12.0f), gm.L(f));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i15 = cmb.h6;
            anb.R(linearLayout5, cmb.Y(S(i15), 6, 6), null, anb.M(i15), this.J0);
            jh2 jh2Var = new jh2(24, this.J0, context);
            this.Z1 = jh2Var;
            jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(false, false);
            jh2Var.setDrawBackgroundAsArc(10);
            linearLayout5.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            anb.X(textView5, i8, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(jb6.Z(2131743265, gm.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, qoe.t(-2, -2, 16, 9, 0, 0, 0));
            rve.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new oba(this, (byte) 1));
            frameLayout8.addView(linearLayout5, qoe.e(-2, -2, 17));
            if (this.q1 == null) {
                View view2 = new View(context);
                anb.h(cmb.c7, this.J0, view2);
                frameLayout8.addView(view2, qoe.a(-1.0f, this.c2 ? 0.66f : 1.0f / gm.p, 55));
            }
            this.b.addView(frameLayout8, qoe.e(-1, 58, 83));
            if (this.q1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        qm0 qm0Var = new qm0(this.N2.b(xd9Var, null));
        this.Q2 = qm0Var;
        if (gda.f()) {
            e86.e(262144);
        }
        qm0Var.b(gm.L(72.0f), true);
        im0 b11 = this.M2.b(this.y2, qqd.f(this.J0));
        this.P2 = b11;
        b11.U = true;
        b11.s(gm.L(29.0f), gm.L(29.0f), 0.0f, 0.0f);
        b11.u(gm.L(32.0f));
        b11.S.g = 0.4f;
        b11.n();
        im0 b12 = this.L2.b(ybaVar, qqd.f(this.J0));
        this.R2 = b12;
        b12.r(gm.L(22.0f));
        b12.q(gm.L(9.0f));
        ybaVar.setPadding(gm.L(9.0f), gm.L(7.0f), gm.L(9.0f), gm.L(7.0f));
        FrameLayout frameLayout9 = this.t1;
        if (frameLayout9 != null) {
            im0 b13 = this.L2.b(frameLayout9, qqd.f(this.J0));
            b13.q(gm.L(9.0f));
            b13.r(gm.L(22.0f));
            this.t1.setBackground(b13);
            this.t1.setPadding(gm.L(9.0f), gm.L(9.0f), gm.L(9.0f), gm.L(9.0f));
        }
        FrameLayout frameLayout10 = this.X1;
        if (frameLayout10 != null) {
            im0 b14 = this.L2.b(frameLayout10, qqd.f(this.J0));
            b14.q(gm.L(9.0f));
            b14.r(gm.L(22.0f));
            this.X1.setBackground(b14);
            this.X1.setPadding(gm.L(9.0f), gm.L(9.0f), gm.L(9.0f), gm.L(9.0f));
        }
        W0(0);
        nk3.x4(j5.a(this.a));
        if (mcaVar.d.isEmpty()) {
            nm7.f(this.a).b(this, nm7.r);
        }
        int i16 = this.a;
        byte b15 = 0;
        cf7.Y(i16).a.c(new cu(i16, (int) b15, (Object) new bca(this), (byte) 6));
        hs6.d0(this.a).O0(true);
        this.X0.i(this.b);
        sy4 sy4Var2 = this.X0;
        sy4Var2.a = new pba(this, b15);
        sy4Var2.d = new cz4(gm.L(48.0f));
        gm.Q3(1.0f, vbaVar, true, false);
        gm.Q3(1.0f, vbaVar2, false, false);
        dy0 dy0Var2 = this.c;
        pba pbaVar = new pba(this, (byte) 1);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(dy0Var2, pbaVar);
    }

    public static tca G0(Context context, k47 k47Var, String str, boolean z, String str2) {
        return new tca(context, k47Var != null ? td4.u(k47Var) : null, str, null, z, str2, null, false);
    }

    public static void Q0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, ylb ylbVar) {
        int v0 = cmb.v0(i, ylbVar);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i2 = 0;
        while (i2 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
            int i3 = 6;
            int i4 = i2 == 0 ? 6 : 0;
            if (i2 != itemsCount - 1) {
                i3 = 0;
            }
            anb.R(childAt, cmb.Y(v0, i4, i3), null, anb.M(i), ylbVar);
            i2++;
        }
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final void D0(boolean z) {
        oq4 oq4Var = this.t2;
        l7 l7Var = oq4Var.r;
        l7 l7Var2 = oq4Var.r;
        boolean isEmpty = TextUtils.isEmpty(l7Var.getText());
        vba vbaVar = this.A1;
        vba vbaVar2 = this.B1;
        boolean z2 = true;
        if (!isEmpty || ((this.d && l7Var2.hasFocus()) || this.H2)) {
            this.v2 = true;
            if (this.x2 == null) {
                gm.T3(vbaVar, false, 0.98f, true, true);
                gm.R3(vbaVar2, true);
            }
        } else {
            if (this.x2 == null) {
                gm.T3(vbaVar, true, 0.98f, true, true);
                gm.R3(vbaVar2, false);
            }
            z2 = false;
        }
        if (this.G2 != z2 || z) {
            this.G2 = z2;
            qca qcaVar = this.H1;
            qcaVar.f();
            this.F1.f();
            boolean z3 = this.G2;
            int i = this.F2;
            if (z3) {
                if (i == Integer.MAX_VALUE) {
                    ((u46) vbaVar2.getLayoutManager()).g1(0, -vbaVar2.getPaddingTop());
                } else {
                    ((u46) vbaVar2.getLayoutManager()).g1(0, this.F2 - vbaVar2.getPaddingTop());
                }
                qcaVar.E(l7Var2.getText().toString());
                return;
            }
            q55 q55Var = this.C1;
            if (i == Integer.MAX_VALUE) {
                q55Var.g1(0, 0);
            } else {
                q55Var.g1(0, 0);
            }
        }
    }

    public final void E0() {
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            View view = null;
            this.x2 = null;
            byte b = 0;
            for (int i = 0; i < J0().getChildCount(); i++) {
                View childAt = J0().getChildAt(i);
                if ((childAt instanceof wca) && ((wca) childAt).getCurrentDialog() == dialog.id) {
                    view = childAt;
                }
            }
            if (view == null) {
                return;
            }
            zna znaVar = this.w2;
            if (znaVar != null) {
                znaVar.d();
            }
            J0().setVisibility(0);
            oq4 oq4Var = this.t2;
            oq4Var.setVisibility(0);
            l7 l7Var = oq4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                l7Var.requestFocus();
                gm.E3(l7Var);
            }
            int[] iArr = new int[2];
            zna znaVar2 = new zna(new xk4(1000.0f));
            aoa aoaVar = new aoa(0.0f);
            yv1 yv1Var = this.a2;
            aoaVar.b((yv1Var == null || !yv1Var.b) ? 800.0f : 10.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            this.w2 = znaVar2;
            znaVar2.b(new nba(this, (wca) view, iArr, b));
            this.w2.a(new hx0(this, (byte) 9));
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
            jca jcaVar = this.n2;
            if ((jcaVar == null || !jcaVar.F()) && (this.b2 instanceof LaunchActivity)) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.b2).H0(new z64((byte) 6, z));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0
    public void H() {
        super.H();
        zba zbaVar = this.n1;
        if (zbaVar != null) {
            zbaVar.o();
        }
    }

    public final int H0() {
        vba vbaVar = this.A1;
        if (vbaVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = vbaVar.getChildAt(0);
        b59 b59Var = (b59) vbaVar.G(childAt);
        if (b59Var == null) {
            return -1000;
        }
        int paddingTop = vbaVar.getPaddingTop();
        if (b59Var.c() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    public final String I0() {
        String str;
        String[] strArr = this.j2;
        hca hcaVar = this.R1;
        if (hcaVar != null) {
            str = strArr[hcaVar.e ? 1 : 0];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        jh2 jh2Var = this.Z1;
        if (jh2Var != null && jh2Var.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", gm.n0(this.W1)).build().toString();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return str == null ? "" : str;
    }

    public final r59 J0() {
        return (this.G2 || this.H2) ? this.B1 : this.A1;
    }

    public final void K0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        r59 r59Var = this.z1;
        r59Var.setPivotX(width);
        r59Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        r59Var.setScaleX(f3);
        r59Var.setScaleY(f3);
        r59Var.setAlpha(f);
        r59 J0 = J0();
        J0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        J0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        J0.setScaleX(f4);
        J0.setScaleY(f4);
        float f5 = 1.0f - f;
        J0.setAlpha(f5);
        oq4 oq4Var = this.t2;
        oq4Var.setPivotX(oq4Var.getWidth() / 2.0f);
        oq4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        oq4Var.setScaleX(f6);
        oq4Var.setScaleY(f6);
        oq4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-gm.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(gm.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(gm.L(16.0f) * f5);
        aVar.setAlpha(f);
        r59Var.getLocationInWindow(iArr);
        float interpolation = d53.g.getInterpolation(f);
        for (int i = 0; i < J0.getChildCount(); i++) {
            View childAt = J0.getChildAt(i);
            if (childAt instanceof wca) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
            View childAt2 = r59Var.getChildAt(i2);
            if (childAt2 instanceof cda) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((r59Var.getTranslationY() + childAt2.getY()) - view.getY()))));
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
        animatorSetArr[0].addListener(new eca(this, z, b));
        animatorSetArr[0].start();
    }

    public final void O0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        pca pcaVar;
        if (dialog instanceof lca) {
            M0(view);
            return;
        }
        if (((view instanceof wca) && ((wca) view).G) || ((view instanceof ut8) && ((ut8) view).o0)) {
            S0(dialog.id, view);
            return;
        }
        r59 r59Var = this.z1;
        if (r59Var.getVisibility() != 8 || (activity = this.b2) == null) {
            return;
        }
        boolean y = pg3.y(dialog.id);
        byte b = this.K1;
        if (y) {
            TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
            if (sd2.T(L0) && !L0.megagroup) {
                TLRPC.Chat L02 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
                if ((!sd2.n(L02) && !L02.megagroup) || b == 2 || b == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = jb6.M0(2131745330, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    if (b == 3) {
                        if (sd2.P(10, L0)) {
                            heVar.U = jb6.M0(2131751021, null);
                        } else {
                            heVar.U = jb6.M0(2131751022, null);
                        }
                    } else if (b != 2) {
                        heVar.U = jb6.M0(2131752386, null);
                    } else if (this.i2) {
                        heVar.U = jb6.M0(2131746320, null);
                    } else if (sd2.P(10, L0)) {
                        heVar.U = jb6.M0(2131751029, null);
                    } else {
                        heVar.U = jb6.M0(2131751030, null);
                    }
                    wi8.y(null, 2131747564, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (pg3.B(dialog.id) && b != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M02 = jb6.M0(2131745330, null);
            he heVar2 = alertDialog$Builder2.a;
            heVar2.S = M02;
            if (b == 3) {
                heVar2.U = jb6.M0(2131743775, null);
            } else if (b != 0) {
                heVar2.U = jb6.M0(2131746909, null);
            } else {
                heVar2.U = jb6.M0(2131748861, null);
            }
            wi8.y(null, 2131747564, alertDialog$Builder2, null);
            return;
        }
        long j = dialog.id;
        vh6 vh6Var = this.P1;
        if (vh6Var.h(j) >= 0) {
            vh6Var.l(dialog.id);
            this.Q1.remove(dialog);
            if (view instanceof ut8) {
                ((ut8) view).w(false, true);
            } else if (view instanceof wca) {
                ((wca) view).b(false, true);
            }
            W0(1);
        } else {
            TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(dialog.id));
            TLRPC.Chat L03 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
            if ((m9c.w(W1) && (((l = oc7.r1(this.a).g4.l(-W1.id)) != null && !l.isEmpty()) || !oc7.r1(this.a).g4.e(-W1.id))) || (pg3.y(dialog.id) && (sd2.c0(L03) || (sd2.p0(L03) && sd2.A(this.a, L03, 24))))) {
                this.x2 = dialog;
                this.D1.g1(0, this.k2 - r59Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                cca ccaVar = new cca(this, dialog, atomicReference, view);
                atomicReference.set(new no8((Object) this, (Object) atomicReference, (Object) ccaVar, (Object) dialog, (byte) 23));
                nm7 f = nm7.f(this.a);
                int i = nm7.u5;
                f.a(ccaVar, i);
                ArrayList l2 = oc7.r1(this.a).g4.l(-dialog.id);
                int i2 = this.a;
                if (l2 != null) {
                    ccaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                    return;
                } else {
                    oc7.r1(i2).g4.o(-dialog.id);
                    gm.d3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            vh6Var.k(dialog, dialog.id);
            if (view instanceof ut8) {
                ((ut8) view).w(true, true);
            } else if (view instanceof wca) {
                ((wca) view).b(true, true);
            }
            W0(2);
            long j2 = z8c.h(this.a).n;
            if (this.G2) {
                mca mcaVar = this.F1;
                vh6 vh6Var2 = mcaVar.e;
                ArrayList arrayList = mcaVar.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var2.f(dialog.id);
                if (dialog2 == null) {
                    mcaVar.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j2) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                mcaVar.f();
                this.v2 = false;
                oq4 oq4Var = this.t2;
                oq4Var.r.setText("");
                D0(false);
                gm.t1(oq4Var.r);
            }
        }
        qca qcaVar = this.H1;
        if (qcaVar == null || (pcaVar = qcaVar.I) == null) {
            return;
        }
        pcaVar.l(0, pcaVar.b());
    }

    @Override // my0
    public final int P() {
        return this.b.getMeasuredHeight() - this.S1;
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
            vh6 vh6Var = this.P1;
            int m = vh6Var.m();
            yba ybaVar = this.m1;
            zba zbaVar = this.n1;
            if (i3 >= m) {
                Editable text = zbaVar.getText();
                wu3 wu3Var = zbaVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = hs6.d0(this.a).Y(charSequenceArr, true, true);
                jh2 jh2Var = this.Z1;
                int i4 = (jh2Var == null || !jh2Var.a.q) ? -1 : this.W1;
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i = 0;
                    while (i2 < vh6Var.m()) {
                        long j = vh6Var.j(i2);
                        long L1 = oc7.r1(this.a).L1(j);
                        if (L1 <= 0) {
                            L1 = pg3.j(oc7.r1(this.a).L2(j));
                        }
                        if (ybaVar.getTag() != null && wu3Var.length() > 0 && L1 > 0) {
                            i++;
                        }
                        if (L1 > 0) {
                            i++;
                        }
                        if (L1 > 0 && !arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                        }
                        i2++;
                    }
                } else {
                    hca hcaVar = this.R1;
                    ?? r9 = hcaVar != null ? hcaVar.e : 0;
                    if (this.A2 != null) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < vh6Var.m()) {
                            long j2 = vh6Var.j(i5);
                            long L12 = oc7.r1(this.a).L1(j2);
                            if (L12 <= 0) {
                                L12 = pg3.j(oc7.r1(this.a).L2(j2));
                            }
                            int i7 = i2;
                            if (this.A2 != null && ybaVar.getTag() != null && wu3Var.length() > 0 && charSequenceArr[i7] != null && L12 > 0) {
                                i6++;
                            }
                            if (L12 > 0) {
                                i6++;
                            }
                            if (L12 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                                arrayList.add(Long.valueOf(j2));
                            }
                            i5++;
                            i2 = i7;
                        }
                        i = i6;
                    } else {
                        int i8 = 0;
                        if (this.J1[r9] != null) {
                            for (int i9 = 0; i9 < vh6Var.m(); i9++) {
                                long j3 = vh6Var.j(i9);
                                long L13 = oc7.r1(this.a).L1(j3);
                                if (L13 <= 0) {
                                    L13 = pg3.j(oc7.r1(this.a).L2(j3));
                                }
                                if (ybaVar.getTag() != null && wu3Var.length() > 0 && L13 > 0) {
                                    i8++;
                                }
                                if (L13 > 0) {
                                    i8++;
                                }
                                if (L13 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                                    arrayList.add(Long.valueOf(j3));
                                }
                            }
                        }
                        i = i8;
                    }
                }
                final int i10 = i4;
                ik.Z(this.a, arrayList, i, new qac() { // from class: tba
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v10, types: [ylb] */
                    /* JADX WARN: Type inference failed for: r11v12 */
                    /* JADX WARN: Type inference failed for: r11v9 */
                    /* JADX WARN: Type inference failed for: r12v1 */
                    /* JADX WARN: Type inference failed for: r12v2 */
                    /* JADX WARN: Type inference failed for: r12v9 */
                    @Override // qac
                    public final void a(Object obj) {
                        int i11;
                        boolean z2;
                        int i12;
                        HashMap hashMap;
                        long j4;
                        boolean z3;
                        char c;
                        k47 k47Var;
                        zba zbaVar2;
                        long longValue;
                        String[] strArr;
                        boolean z4;
                        long j5;
                        int i13;
                        Long l;
                        k47 k47Var2;
                        y5a b;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i14;
                        boolean z5;
                        long j6;
                        Long l2;
                        CharSequence[] charSequenceArr2;
                        k47 k47Var3;
                        k47 k47Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        tca tcaVar = tca.this;
                        String[] strArr2 = tcaVar.J1;
                        yba ybaVar2 = tcaVar.m1;
                        zba zbaVar3 = tcaVar.n1;
                        HashMap hashMap3 = tcaVar.Q1;
                        Long l3 = 0L;
                        vh6 vh6Var2 = tcaVar.P1;
                        ArrayList arrayList4 = tcaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z6 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i15 = 0;
                            boolean z7 = false;
                            while (true) {
                                if (i15 >= vh6Var2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z8 = z6;
                                long j7 = vh6Var2.j(i15);
                                boolean y2 = oc7.r1(tcaVar.a).y2(j7);
                                yba ybaVar3 = ybaVar2;
                                Long l4 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j7));
                                boolean z9 = (l4 == null || l4.longValue() <= 0) ? z7 : true;
                                Long l5 = l4;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j7));
                                if (tL_forumTopic2 == null || !y2) {
                                    i14 = i15;
                                    z5 = y2;
                                    j6 = 0;
                                } else {
                                    i14 = i15;
                                    z5 = y2;
                                    j6 = pg3.n(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z5) {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    k47Var3 = null;
                                } else {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    k47Var3 = new k47(tcaVar.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (k47Var3 != null) {
                                    k47Var3.p = true;
                                }
                                if (ybaVar3.getTag() == null || zbaVar3.a.length() <= 0) {
                                    k47Var4 = k47Var3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    k47Var4 = k47Var3;
                                    ArrayList arrayList7 = arrayList5;
                                    y5a b2 = y5a.b(charSequence == null ? null : charSequence.toString(), j7, k47Var4, k47Var3, null, true, arrayList7, null, null, z8, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z8 = z8;
                                    b2.Q = l5 == null ? 0L : l5.longValue();
                                    b2.R = j6;
                                    a6a.B(tcaVar.a).q0(b2);
                                }
                                boolean z10 = z8;
                                int p0 = a6a.B(tcaVar.a).p0(tcaVar.I1, j7, !tcaVar.D2, false, z10, 0, 0, k47Var4, i10, l5 == null ? 0L : l5.longValue(), j6, null);
                                if (p0 != 0) {
                                    arrayList6.add(Long.valueOf(j7));
                                }
                                if (vh6Var2.m() == 1) {
                                    ik.q0(p0, r11, tcaVar.a2);
                                    if (p0 != 0) {
                                        z7 = z9;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i15 = i14 + 1;
                                arrayList5 = arrayList3;
                                z6 = z10;
                                ybaVar2 = ybaVar3;
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
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var2.f(longValue2);
                                vh6Var2.l(longValue2);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!vh6Var2.i()) {
                                tcaVar.L0(vh6Var2, arrayList2.size(), vh6Var2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(0)) : tL_forumTopic, !z7);
                            }
                        } else {
                            boolean z11 = z6;
                            hca hcaVar2 = tcaVar.R1;
                            ?? r12 = hcaVar2 != null ? hcaVar2.e : 0;
                            if (tcaVar.A2 != null) {
                                int i17 = 0;
                                boolean z12 = false;
                                while (i17 < vh6Var2.m()) {
                                    long j8 = vh6Var2.j(i17);
                                    boolean y22 = oc7.r1(tcaVar.a).y2(j8);
                                    Long l6 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j8));
                                    if (l6 != null && l6.longValue() > 0) {
                                        z12 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j8));
                                    if (tL_forumTopic3 == null || !y22) {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = 0;
                                    } else {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = pg3.n(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || y22) {
                                        i13 = i17;
                                        l = l6;
                                        k47Var2 = null;
                                    } else {
                                        i13 = i17;
                                        l = l6;
                                        k47Var2 = new k47(tcaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (tcaVar.A2 != null) {
                                        if (ybaVar2.getTag() != null && zbaVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            k47 k47Var5 = k47Var2;
                                            k47Var2 = k47Var5;
                                            a6a.B(tcaVar.a).q0(y5a.b(charSequenceArr3[0].toString(), j8, null, k47Var5, null, true, null, null, null, z11, 0, 0, null, false));
                                        }
                                        b = y5a.b(null, j8, k47Var2, k47Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                        b.I = tcaVar.A2;
                                    } else if (ybaVar2.getTag() == null || zbaVar3.a.length() <= 0) {
                                        b = y5a.b(strArr[r12], j8, k47Var2, k47Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z13 = z11;
                                        b = y5a.b(charSequence2 == null ? null : charSequence2.toString(), j8, k47Var2, k47Var2, null, true, arrayList5, null, null, z13, 0, 0, null, false);
                                        z11 = z13;
                                    }
                                    b.Q = l == null ? 0L : l.longValue();
                                    b.R = j5;
                                    a6a.B(tcaVar.a).q0(b);
                                    i17 = i13 + 1;
                                    z12 = z4;
                                    strArr2 = strArr;
                                }
                                z2 = z12;
                            } else if (strArr2[r12] != null) {
                                int i18 = 0;
                                boolean z14 = false;
                                while (i18 < vh6Var2.m()) {
                                    long j9 = vh6Var2.j(i18);
                                    boolean y23 = oc7.r1(tcaVar.a).y2(j9);
                                    Long l7 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j9));
                                    if (l7 != null && l7.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j9));
                                    if (tL_forumTopic4 == null || !y23) {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = 0;
                                    } else {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = pg3.n(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || y23) {
                                        z3 = z14;
                                        c = 0;
                                        k47Var = null;
                                    } else {
                                        z3 = z14;
                                        c = 0;
                                        k47Var = new k47(tcaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (ybaVar2.getTag() == null || zbaVar3.a.length() <= 0) {
                                        zbaVar2 = zbaVar3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c];
                                        boolean z15 = z11;
                                        y5a b3 = y5a.b(charSequence3 == null ? null : charSequence3.toString(), j9, k47Var, k47Var, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                        z11 = z15;
                                        if (l7 == null) {
                                            zbaVar2 = zbaVar3;
                                            longValue = 0;
                                        } else {
                                            zbaVar2 = zbaVar3;
                                            longValue = l7.longValue();
                                        }
                                        b3.Q = longValue;
                                        b3.R = j4;
                                        a6a.B(tcaVar.a).q0(b3);
                                    }
                                    k47 k47Var6 = k47Var;
                                    y5a b4 = y5a.b(strArr2[r12], j9, k47Var6, k47Var6, null, true, null, null, null, z11, 0, 0, null, false);
                                    b4.Q = l7 == null ? 0L : l7.longValue();
                                    b4.R = j4;
                                    a6a.B(tcaVar.a).q0(b4);
                                    i18 = i12 + 1;
                                    z14 = z3;
                                    zbaVar3 = zbaVar2;
                                    hashMap2 = hashMap;
                                }
                                z2 = z14;
                            } else {
                                i11 = 0;
                                z2 = false;
                                tcaVar.L0(vh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(i11)), !z2);
                            }
                            i11 = 0;
                            tcaVar.L0(vh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(i11)), !z2);
                        }
                        jca jcaVar = tcaVar.n2;
                        if (jcaVar != null) {
                            jcaVar.s();
                        }
                        tcaVar.dismiss();
                    }
                });
                return;
            }
            if (ik.h(getContext(), this.a, vh6Var.j(i3), ybaVar.getTag() != null && zbaVar.a.length() > 0)) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void R0(boolean z) {
        yba ybaVar = this.m1;
        byte b = 1;
        if (z == (ybaVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ybaVar.setTag(z ? 1 : null);
        zba zbaVar = this.n1;
        if (zbaVar.getEditText().isFocused()) {
            gm.t1(zbaVar.getEditText());
        }
        zbaVar.k(true);
        FrameLayout frameLayout = this.X1;
        yba ybaVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            ybaVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            ybaVar2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i = z ? 4 : 1;
            WeakHashMap weakHashMap = kfc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            int i2 = z ? 4 : 1;
            WeakHashMap weakHashMap2 = kfc.a;
            linearLayout.setImportantForAccessibility(i2);
        }
        this.y1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(ybaVar, (Property<yba, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, (Property<yba, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, (Property<yba, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, (Property<yba, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.N1[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.t1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.c2 && z) {
                f = gm.L(this.Y1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new eca(this, z, b));
        this.y1.start();
    }

    public final void S0(long j, View view) {
        int i = -this.C2;
        this.C2 = i;
        gm.A3(i, view, null);
        xx0.E.a();
        String r = j >= 0 ? m9c.r(oc7.r1(this.a).W1(Long.valueOf(j))) : "";
        boolean H3 = oc7.r1(this.a).H3();
        ylb ylbVar = this.J0;
        byte b = 1;
        FrameLayout frameLayout = this.v1;
        (H3 ? new c41(frameLayout, ylbVar).Q(R.raw.star_premium_2, 36, gm.S2(jb6.a0(null, null, 2131743447, r))) : new c41(frameLayout, ylbVar).K(R.raw.star_premium_2, gm.S2(jb6.a0(null, null, 2131743447, r)), jb6.M0(2131743446, null), new qba(this, b))).j();
    }

    public final void T0() {
        gb gbVar;
        yba ybaVar = this.m1;
        if (ybaVar == null) {
            return;
        }
        zba zbaVar = this.n1;
        if (zbaVar == null || !zbaVar.m()) {
            gca gcaVar = this.y2;
            if (gcaVar != null && (gbVar = gcaVar.I) != null && !gbVar.f) {
                Typeface typeface = gm.a;
            }
        } else {
            zbaVar.getEmojiPaddingShown();
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + gm.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        ybaVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void U0() {
        if (this.m2) {
            return;
        }
        boolean z = this.G2;
        vba vbaVar = this.A1;
        vba vbaVar2 = this.B1;
        vba vbaVar3 = z ? vbaVar2 : vbaVar;
        if (vbaVar3.getChildCount() > 0) {
            View childAt = vbaVar3.getChildAt(0);
            for (int i = 0; i < vbaVar3.getChildCount(); i++) {
                if (vbaVar3.getChildAt(i).getTop() < childAt.getTop()) {
                    childAt = vbaVar3.getChildAt(i);
                }
            }
            b59 b59Var = (b59) vbaVar3.G(childAt);
            int top = childAt.getTop() - gm.L(8.0f);
            int i2 = (top <= 0 || b59Var == null || b59Var.b() != 0) ? 0 : top;
            if (top < 0 || b59Var == null || b59Var.b() != 0) {
                this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                N0(true);
                top = i2;
            } else {
                this.F2 = childAt.getTop();
                N0(false);
            }
            r59 r59Var = this.z1;
            if (r59Var.getVisibility() == 0) {
                if (r59Var.getChildCount() <= 0) {
                    return;
                }
                View childAt2 = r59Var.getChildAt(0);
                for (int i3 = 0; i3 < r59Var.getChildCount(); i3++) {
                    if (r59Var.getChildAt(i3).getTop() < childAt2.getTop()) {
                        childAt2 = r59Var.getChildAt(i3);
                    }
                }
                b59 b59Var2 = (b59) r59Var.G(childAt2);
                int top2 = childAt2.getTop() - gm.L(8.0f);
                int i4 = (top2 <= 0 || b59Var2 == null || b59Var2.b() != 0) ? 0 : top2;
                if (top2 < 0 || b59Var2 == null || b59Var2.b() != 0) {
                    this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    N0(true);
                    top2 = i4;
                } else {
                    this.F2 = childAt2.getTop();
                    N0(false);
                }
                top = gm.U1(r59Var.getAlpha(), top, top2);
            }
            int i5 = this.k2;
            if (i5 != top) {
                this.l2 = i5;
                float f = top;
                int i6 = (int) (this.o2 + f);
                this.k2 = i6;
                vbaVar.setTopGlowOffset(i6);
                int i7 = (int) (this.o2 + f);
                this.k2 = i7;
                vbaVar2.setTopGlowOffset(i7);
                int i8 = (int) (f + this.o2);
                this.k2 = i8;
                r59Var.setTopGlowOffset(i8);
                this.l1.setTranslationY(this.k2 + this.o2);
                this.L1.setTranslationY(this.k2 + this.o2);
                this.b.invalidate();
            }
        }
    }

    public final void V0() {
        lka lkaVar = this.u1;
        if (lkaVar != null) {
            String I0 = I0();
            if (I0.startsWith("https://")) {
                I0 = I0.substring(8);
            } else if (I0.startsWith("http://")) {
                I0 = I0.substring(7);
            }
            lkaVar.l(I0, false);
        }
    }

    public final void W0(int i) {
        vh6 vh6Var = this.P1;
        if (vh6Var.m() == 0) {
            R0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.m1.getTag();
        zba zbaVar = this.n1;
        if (tag != null && zbaVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < vh6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) vh6Var.n(i2)).id;
            long L1 = oc7.r1(this.a).L1(j2);
            if (L1 <= 0) {
                L1 = pg3.j(oc7.r1(this.a).L2(j2));
            }
            j += L1;
        }
        int max = Math.max(1, vh6Var.m());
        boolean z = i != 0;
        vi3 vi3Var = this.o1;
        vi3Var.f(max, z);
        vi3Var.i(size, j, i != 0);
        R0(true);
        zbaVar.setPadding(0, 0, Math.max(gm.L(84.0f), vi3Var.l()), 0);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.r;
        if (i == i3) {
            mca mcaVar = this.F1;
            if (mcaVar != null) {
                mcaVar.E();
            }
            nm7.f(this.a).n(this, i3);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        zba zbaVar = this.n1;
        if (zbaVar != null) {
            gm.t1(zbaVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        nm7.f(this.a).n(this, nm7.r);
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        if (this.x2 != null) {
            E0();
            return;
        }
        zba zbaVar = this.n1;
        if (zbaVar == null || !zbaVar.e) {
            super.onBackPressed();
        } else {
            zbaVar.k(true);
        }
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            kz4 kz4Var = this.K2;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.c6, this.J0));
            }
            dy0 dy0Var = this.c;
            if (dy0Var != null) {
                boolean z = gm.B(cmb.v0(cmb.g5, this.J0)) > 0.721f;
                if (z != this.S2) {
                    this.S2 = z;
                    gm.j3(dy0Var, z);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void M0(View view) {
    }

    public void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public tca(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public tca(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, ylb ylbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, ylbVar);
    }
}
