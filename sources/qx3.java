// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class qx3 extends fx0 implements gk7 {
    public static Pattern P1;
    public m8 A1;
    public final boolean B1;
    public boolean C1;
    public float D1;
    public int E1;
    public int F1;
    public final lm G1;
    public final ax3 H1;
    public int I1;
    public boolean J1;
    public long K1;
    public ValueAnimator L1;
    public boolean M1;
    public PorterDuffColorFilter N1;
    public int O1;
    public LongSparseArray l1;
    public final d m1;
    public final d62 n1;
    public final bx3 o1;
    public final hx3 p1;
    public final hw q1;
    public fx3 r1;
    public final View s1;
    public final FrameLayout t1;
    public final TextView u1;
    public final TextView v1;
    public final ah8 w1;
    public final r35 x1;
    public final cu6 y1;
    public final ih2 z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qx3(d dVar, Context context, wjb wjbVar, ArrayList arrayList) {
        super(1, r4, context, false);
        wjb resourceProvider = (dVar == null || dVar.getResourceProvider() == null) ? wjbVar : dVar.getResourceProvider();
        this.E1 = -1;
        this.F1 = -1;
        this.H1 = new ax3(this);
        this.I1 = -1;
        this.J1 = false;
        this.M1 = true;
        this.m1 = dVar;
        K();
        if (arrayList != null) {
            this.B1 = arrayList.size() > 1;
        }
        this.o1 = new bx3(this, this.a, arrayList);
        float L = gl.L(32.0f);
        float L2 = gl.L(3.5f);
        int i = bkb.Ei;
        this.z1 = new ih2(L, L2, bkb.v0(i, this.J0));
        hx3 hx3Var = new hx3(this, context);
        this.p1 = hx3Var;
        this.b = hx3Var;
        byte b = 8;
        this.n1 = new d62(context, b);
        hw hwVar = new hw(this, context, this.J0);
        this.q1 = hwVar;
        this.G1 = new lm(0.0f, hwVar, 0L, 1250L, s33.i);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, gl.m, i2, 0);
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        this.b.setWillNotDraw(false);
        hwVar.setWillNotDraw(false);
        hwVar.setSelectorRadius(gl.L(6.0f));
        zkb.l(hwVar, 20, bkb.h6, resourceProvider);
        hwVar.setPadding(gl.L(8.0f), 0, gl.L(8.0f), gl.L(this.B1 ? 8.0f : 68.0f));
        r35 r35Var = new r35(8);
        this.x1 = r35Var;
        hwVar.setLayoutManager(r35Var);
        byte b2 = 4;
        hwVar.i(new kr(this, b2));
        hwVar.j(new ao2(this, b));
        r52 r52Var = new r52(this, arrayList, dVar, resourceProvider);
        hwVar.setOnItemClickListener(r52Var);
        hwVar.setOnItemLongClickListener(new v82((Object) this, (Object) context, (byte) 25));
        hwVar.setOnTouchListener(new f8(this, r52Var, b2));
        r35Var.j1(false);
        r35Var.O = new dx3(this);
        this.y1 = new cu6(hwVar, r35Var);
        this.b.addView(hwVar, nme.e(-1, -1, 51));
        View view = new View(context);
        this.s1 = view;
        zkb.h(bkb.U5, null, view);
        this.b.addView(view, nme.a(-1.0f, 1.0f / gl.p, 80));
        view.setTranslationY(-gl.L(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.t1 = frameLayout;
        zkb.h(bkb.g5, this.J0, frameLayout);
        this.b.addView(frameLayout, nme.e(-1, 68, 87));
        TextView textView = new TextView(context);
        this.u1 = textView;
        textView.setVisibility(8);
        ff0 e = sjb.e(bkb.v0(i, this.J0), 24.0f);
        vkb M = zkb.M(i);
        vkb e2 = zkb.e(i);
        wjb wjbVar2 = this.J0;
        textView.setBackground(e);
        zkb.j(textView, e, M, e2, wjbVar2);
        zkb.X(textView, bkb.Ii, this.J0);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        ote.b(textView, 0.02f, 1.2f);
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f), context);
        this.v1 = l;
        l.setVisibility(8);
        int i3 = bkb.p7;
        ff0 Y = bkb.Y(bkb.v0(i3, this.J0) & 268435455, 0, 0);
        vkb g = zkb.g(i3, 15);
        wjb wjbVar3 = this.J0;
        l.setBackground(Y);
        zkb.j(l, Y, null, g, wjbVar3);
        zkb.X(l, i3, this.J0);
        l.setTypeface(gl.o());
        l.setGravity(17);
        l.setClickable(true);
        frameLayout.addView(l, nme.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        ah8 ah8Var = new ah8(this.J0, context, false);
        this.w1 = ah8Var;
        ah8Var.b(k96.M0(2131743626, null), new yj3(this, (byte) 3), false);
        ah8Var.setIcon(R.raw.unlock_icon);
        ah8Var.w.setClickable(true);
        frameLayout.addView(ah8Var, nme.d(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void E0(final d dVar, TLObject tLObject, final boolean z, final go2 go2Var, final li3 li3Var) {
        int currentAccount;
        final View fragmentView;
        TLRPC.StickerSet stickerSet = null;
        if (dVar == null) {
            currentAccount = y6c.t0;
            fragmentView = null;
        } else {
            currentAccount = dVar.getCurrentAccount();
            fragmentView = dVar.getFragmentView();
        }
        final int i = currentAccount;
        if (tLObject != null) {
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                Runnable runnable = (Runnable) hq6.d0(i).U.f(stickerSet2.id);
                if (runnable != null) {
                    runnable.run();
                    if (go2Var != null) {
                        go2Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.id = stickerSet2.id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_installStickerSet, new RequestDelegate() { // from class: zw3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z2 = z;
                        final View view = fragmentView;
                        final d dVar2 = dVar;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i2 = i;
                        final go2 go2Var2 = go2Var;
                        final li3 li3Var2 = li3Var;
                        gl.c3(new Runnable() { // from class: yw3
                            @Override // java.lang.Runnable
                            public final void run() {
                                TLObject tLObject3 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                int i3 = stickerSet4.masks ? 1 : stickerSet4.emojis ? 5 : 0;
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                d dVar3 = dVar2;
                                int i4 = i2;
                                go2 go2Var3 = go2Var2;
                                try {
                                    if (tL_error2 == null) {
                                        if (z2 && view2 != null) {
                                            Context context = dVar3.getFragmentView().getContext();
                                            TLObject tLObject4 = tL_messages_stickerSet2;
                                            m21.g(dVar3, new nza(context, tLObject4 == null ? stickerSet4 : tLObject4, 1, 2, null, dVar3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            hq6.d0(i4).C1(dVar3, true, i3, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                        }
                                        if (go2Var3 != null) {
                                            go2Var3.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(dVar3.getFragmentView().getContext(), k96.M0(2131751093, null), 0).show();
                                        if (go2Var3 != null) {
                                            go2Var3.a(Boolean.FALSE);
                                        }
                                    } else if (go2Var3 != null) {
                                        go2Var3.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                                hq6.d0(i4).c1(i3, false, true, false, new hj3(li3Var2, (byte) 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // fx0
    public final boolean D() {
        return false;
    }

    public final int D0() {
        if (this.b == null) {
            return 0;
        }
        hw hwVar = this.q1;
        if (hwVar == null || hwVar.getChildCount() < 1) {
            return this.b.getPaddingTop();
        }
        View childAt = hwVar.getChildAt(0);
        d62 d62Var = this.n1;
        return childAt != d62Var ? this.b.getPaddingTop() : d62Var.getBottom() + ((int) hwVar.getY());
    }

    public final void H0() {
        d dVar = this.m1;
        if (dVar != null) {
            new jh8(dVar, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void I0() {
        final byte b;
        TLRPC.StickerSet stickerSet;
        if (this.t1 == null) {
            return;
        }
        bx3 bx3Var = this.o1;
        ArrayList arrayList = bx3Var.b == null ? new ArrayList() : new ArrayList(bx3Var.b);
        final byte b2 = 0;
        int i = 0;
        while (true) {
            b = 1;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        hq6 d0 = hq6.d0(this.a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (d0.D0(stickerSet.id, true)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z = bx3Var.a != null && arrayList.size() == bx3Var.a.size();
        if (!this.M1 && z && this.L1 == null) {
            this.L1 = ValueAnimator.ofFloat(this.D1, 1.0f);
            this.b.getY();
            this.L1.addUpdateListener(new uz1(this, (byte) 18));
            this.L1.setDuration(250L);
            this.L1.setInterpolator(s33.h);
            this.L1.start();
        }
        this.M1 = z;
        hw hwVar = this.q1;
        if (!z) {
            hwVar.setAlpha(0.0f);
        } else if (this.I1 >= 0) {
            int K0 = this.x1.K0();
            int E = this.r1.E(this.I1);
            if (Math.abs(K0 - E) > 54) {
                int i3 = K0 < E ? 0 : 1;
                cu6 cu6Var = this.y1;
                cu6Var.b = i3;
                cu6Var.k(E, (gl.q.y / 2) - gl.L(170.0f), false, false);
            } else {
                hwVar.z0(E);
            }
            this.E1 = this.r1.E(this.I1);
            fx3 fx3Var = this.r1;
            int i4 = this.I1;
            qx3 qx3Var = fx3Var.c;
            boolean z2 = qx3Var.C1;
            bx3 bx3Var2 = qx3Var.o1;
            int i5 = z2 ? 2 : 1;
            int i6 = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var2.c;
                if (i6 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i6].size();
                if (bx3Var2.c.length > 1) {
                    size = Math.min(qx3Var.x1.J << 1, size);
                }
                if (i6 == i4) {
                    i5 = i5 + size + 1;
                    break;
                } else {
                    i5 += size + 2;
                    i6++;
                }
            }
            this.F1 = i5;
            this.G1.e(true, 1.0f);
            hwVar.invalidate();
            this.I1 = -1;
        }
        boolean z3 = this.M1;
        ah8 ah8Var = this.w1;
        TextView textView = this.u1;
        TextView textView2 = this.v1;
        if (!z3 || this.B1) {
            ah8Var.setVisibility(8);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            K0(false);
            return;
        }
        ah8Var.setVisibility(4);
        if (arrayList4.size() > 0) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView.setText(k96.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
            } else {
                textView.setText(k96.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
            }
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: xw3
                public final /* synthetic */ qx3 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
                /* JADX WARN: Type inference failed for: r7v7, types: [int[], java.io.Serializable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                    int i7;
                    boolean z4;
                    byte b3 = b2;
                    qx3 qx3Var2 = this.b;
                    int i8 = 0;
                    boolean z5 = true;
                    switch (b3) {
                        case 0:
                            ArrayList arrayList5 = arrayList4;
                            int size2 = arrayList5.size();
                            int[] iArr = new int[2];
                            while (i8 < arrayList5.size()) {
                                qx3.E0(qx3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new go2(qx3Var2, iArr, size2, arrayList5) : null, null);
                                i8++;
                            }
                            qx3Var2.F0(true);
                            if (size2 <= 1) {
                                qx3Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            qx3Var2.dismiss();
                            d dVar = qx3Var2.m1;
                            ArrayList arrayList6 = arrayList4;
                            if (dVar != null) {
                                hq6 d02 = hq6.d0(dVar.getCurrentAccount());
                                Context context = dVar.getContext();
                                ArrayList[] arrayListArr2 = d02.H;
                                if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b00.f(1, arrayList6)) != null) {
                                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                    int i9 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                    for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                        ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                    }
                                    ?? r7 = new int[arrayList6.size()];
                                    int i11 = 0;
                                    while (i11 < arrayListArr2[i9].size()) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i9].get(i11);
                                        int i12 = i8;
                                        while (true) {
                                            if (i12 < arrayList6.size()) {
                                                i7 = i8;
                                                z4 = z5;
                                                if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                    r7[i12] = i11;
                                                    arrayListArr2[i9].remove(i11);
                                                    d02.J.l(tL_messages_stickerSet3.set.id);
                                                    d02.K.l(tL_messages_stickerSet3.set.id);
                                                    d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                                } else {
                                                    i12++;
                                                    i8 = i7;
                                                    z5 = z4;
                                                }
                                            } else {
                                                i7 = i8;
                                                z4 = z5;
                                            }
                                        }
                                        i11++;
                                        i8 = i7;
                                        z5 = z4;
                                    }
                                    boolean z6 = i8;
                                    int i13 = z5;
                                    ArrayList arrayList7 = arrayListArr2[i9];
                                    int i14 = d02.Z[i9];
                                    long[] jArr = d02.Y;
                                    int i15 = i9;
                                    long s = hq6.s(arrayList7);
                                    jArr[i15] = s;
                                    d02.M1(i15, i14, s, arrayList7);
                                    kk7 notificationCenter = d02.getNotificationCenter();
                                    Object[] objArr = new Object[2];
                                    objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                    objArr[i13] = Boolean.TRUE;
                                    notificationCenter.k(60, objArr);
                                    for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                        d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                    }
                                    nza nzaVar = new nza(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar.getResourceProvider());
                                    ?? r15 = new boolean[i13];
                                    k21 k21Var = new k21(null, context, z6);
                                    k21Var.b = new bb6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                    byte b4 = 5;
                                    k21Var.c = new ct2(d02, (boolean[]) r15, arrayList6, context, dVar, i15);
                                    nzaVar.setButton(k21Var);
                                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                        d02.U.k(new vl6(k21Var, b4), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                    }
                                    m21.g(dVar, nzaVar, 2750).j();
                                }
                            } else {
                                int i18 = 0;
                                while (i18 < arrayList6.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                    Context context2 = qx3Var2.getContext();
                                    boolean z7 = i18 == 0;
                                    if (tL_messages_stickerSet4 != null) {
                                        hq6.d0(y6c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                    }
                                    i18++;
                                }
                            }
                            qx3Var2.F0(false);
                            break;
                    }
                }
            });
            K0(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            K0(false);
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView2.setText(k96.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
        } else {
            textView2.setText(k96.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: xw3
            public final /* synthetic */ qx3 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v3, types: [boolean[], java.io.Serializable] */
            /* JADX WARN: Type inference failed for: r7v7, types: [int[], java.io.Serializable] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                int i7;
                boolean z4;
                byte b3 = b;
                qx3 qx3Var2 = this.b;
                int i8 = 0;
                boolean z5 = true;
                switch (b3) {
                    case 0:
                        ArrayList arrayList5 = arrayList2;
                        int size2 = arrayList5.size();
                        int[] iArr = new int[2];
                        while (i8 < arrayList5.size()) {
                            qx3.E0(qx3Var2.m1, (TLObject) arrayList5.get(i8), size2 == 1, size2 > 1 ? new go2(qx3Var2, iArr, size2, arrayList5) : null, null);
                            i8++;
                        }
                        qx3Var2.F0(true);
                        if (size2 <= 1) {
                            qx3Var2.dismiss();
                            break;
                        }
                        break;
                    default:
                        qx3Var2.dismiss();
                        d dVar = qx3Var2.m1;
                        ArrayList arrayList6 = arrayList2;
                        if (dVar != null) {
                            hq6 d02 = hq6.d0(dVar.getCurrentAccount());
                            Context context = dVar.getContext();
                            ArrayList[] arrayListArr2 = d02.H;
                            if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) b00.f(1, arrayList6)) != null) {
                                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                int i9 = stickerSet2.masks ? 1 : stickerSet2.emojis ? 5 : 0;
                                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                                    ((TLRPC.TL_messages_stickerSet) arrayList6.get(i10)).set.archived = false;
                                }
                                ?? r7 = new int[arrayList6.size()];
                                int i11 = 0;
                                while (i11 < arrayListArr2[i9].size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i9].get(i11);
                                    int i12 = i8;
                                    while (true) {
                                        if (i12 < arrayList6.size()) {
                                            i7 = i8;
                                            z4 = z5;
                                            if (tL_messages_stickerSet3.set.id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i12)).set.id) {
                                                r7[i12] = i11;
                                                arrayListArr2[i9].remove(i11);
                                                d02.J.l(tL_messages_stickerSet3.set.id);
                                                d02.K.l(tL_messages_stickerSet3.set.id);
                                                d02.O.remove(tL_messages_stickerSet3.set.short_name);
                                            } else {
                                                i12++;
                                                i8 = i7;
                                                z5 = z4;
                                            }
                                        } else {
                                            i7 = i8;
                                            z4 = z5;
                                        }
                                    }
                                    i11++;
                                    i8 = i7;
                                    z5 = z4;
                                }
                                boolean z6 = i8;
                                int i13 = z5;
                                ArrayList arrayList7 = arrayListArr2[i9];
                                int i14 = d02.Z[i9];
                                long[] jArr = d02.Y;
                                int i15 = i9;
                                long s = hq6.s(arrayList7);
                                jArr[i15] = s;
                                d02.M1(i15, i14, s, arrayList7);
                                kk7 notificationCenter = d02.getNotificationCenter();
                                Object[] objArr = new Object[2];
                                objArr[z6 ? 1 : 0] = Integer.valueOf(i15);
                                objArr[i13] = Boolean.TRUE;
                                notificationCenter.k(60, objArr);
                                for (int i16 = z6 ? 1 : 0; i16 < arrayList6.size(); i16++) {
                                    d02.h1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i16)).set.id, i13);
                                }
                                nza nzaVar = new nza(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, dVar.getResourceProvider());
                                ?? r15 = new boolean[i13];
                                k21 k21Var = new k21(null, context, z6);
                                k21Var.b = new bb6(d02, r15, arrayList6, i15, r7, (byte) 1);
                                byte b4 = 5;
                                k21Var.c = new ct2(d02, (boolean[]) r15, arrayList6, context, dVar, i15);
                                nzaVar.setButton(k21Var);
                                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                    d02.U.k(new vl6(k21Var, b4), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i17)).set.id);
                                }
                                m21.g(dVar, nzaVar, 2750).j();
                            }
                        } else {
                            int i18 = 0;
                            while (i18 < arrayList6.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                                Context context2 = qx3Var2.getContext();
                                boolean z7 = i18 == 0;
                                if (tL_messages_stickerSet4 != null) {
                                    hq6.d0(y6c.t0).i2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z7, null, true);
                                }
                                i18++;
                            }
                        }
                        qx3Var2.F0(false);
                        break;
                }
            }
        });
        K0(true);
    }

    public final void J0(boolean z) {
        boolean z2 = gl.B(bkb.v0(bkb.g5, this.J0)) > 0.721f;
        boolean z3 = gl.B(bkb.v(bkb.v0(bkb.r8, this.J0), 855638016)) > 0.721f;
        if (!z) {
            z2 = z3;
        }
        gl.l3(this, z2);
    }

    public final void K0(boolean z) {
        boolean z2 = !this.J1 && z;
        float L = this.v1.getVisibility() == 0 ? gl.L(19.0f) : 0;
        boolean z3 = this.B1;
        hw hwVar = this.q1;
        FrameLayout frameLayout = this.t1;
        View view = this.s1;
        float f = 0.0f;
        if (z2) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z ? L : gl.L(16.0f)).alpha(z ? 1.0f : 0.0f).setDuration(250L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            view.animate().translationY(z ? -(gl.L(68.0f) - L) : 0.0f).alpha(z ? 1.0f : 0.0f).setDuration(250L).setInterpolator(s33Var).start();
            ViewPropertyAnimator animate = hwVar.animate();
            if (!z3 && !z) {
                f = gl.L(68.0f) - L;
            }
            animate.translationY(f).setDuration(250L).setInterpolator(s33Var).start();
        } else {
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z ? L : gl.L(16.0f));
            view.setAlpha(z ? 1.0f : 0.0f);
            view.setTranslationY(z ? -(gl.L(68.0f) - L) : 0.0f);
            if (!z3 && !z) {
                f = gl.L(68.0f) - L;
            }
            hwVar.setTranslationY(f);
        }
        this.J1 = z;
    }

    @Override // fx0
    public final int Q() {
        hw hwVar = this.q1;
        int measuredHeight = (hwVar == null ? 0 : hwVar.getMeasuredHeight()) - D0();
        ViewGroup viewGroup = this.b;
        return gl.L(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + gl.n;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        mx3 mx3Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i != kk7.w0) {
            return;
        }
        int i3 = 0;
        while (true) {
            hw hwVar = this.q1;
            if (i3 >= hwVar.getChildCount()) {
                I0();
                return;
            }
            View childAt = hwVar.getChildAt(i3);
            if ((childAt instanceof mx3) && (tL_messages_stickerSet = (mx3Var = (mx3) childAt).r) != null && tL_messages_stickerSet.set != null) {
                mx3Var.a(hq6.d0(this.a).D0(mx3Var.r.set.id, true), true);
            }
            i3++;
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public void dismiss() {
        hx3 hx3Var = this.p1;
        if (hx3Var != null && hx3Var.x) {
            hx3Var.x = false;
            hx3Var.invalidate();
        }
        super.dismiss();
        bx3 bx3Var = this.o1;
        if (bx3Var != null) {
            kk7.f(bx3Var.d).n(bx3Var, kk7.A0);
        }
        kk7.e().k(kk7.j1, 4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.w0);
    }

    @Override // fx0, android.app.Dialog
    public final void onBackPressed() {
        if (xv2.e().E) {
            xv2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.w0);
    }

    @Override // fx0
    public final void p0() {
        Boolean bool;
        try {
            super.p0();
            ih2 ih2Var = this.z1;
            if (ih2Var != null) {
                ih2Var.b(bkb.v0(bkb.Ei, this.J0));
            }
            hx3 hx3Var = this.p1;
            if (hx3Var != null && (bool = hx3Var.c) != null) {
                J0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        fx3 fx3Var = new fx3(this);
        this.r1 = fx3Var;
        this.q1.setAdapter(fx3Var);
        byte b = 0;
        kk7.e().k(kk7.i1, 4);
        bx3 bx3Var = this.o1;
        if (!bx3Var.e) {
            bx3Var.e = true;
            qx3 qx3Var = bx3Var.f;
            int i = bx3Var.d;
            bx3Var.b = new ArrayList(bx3Var.a.size());
            bx3Var.c = new ArrayList[bx3Var.a.size()];
            kk7.f(i).b(bx3Var, 64);
            boolean[] zArr = new boolean[1];
            int i2 = 0;
            while (true) {
                if (i2 < bx3Var.c.length) {
                    TLRPC.TL_messages_stickerSet m0 = hq6.d0(i).m0((TLRPC.InputStickerSet) bx3Var.a.get(i2), null, false, false, new pz1((Object) bx3Var, (Object) zArr, (byte) 15));
                    if (bx3Var.c.length != 1 || m0 == null || (stickerSet = m0.set) == null || stickerSet.emojis) {
                        bx3Var.b.add(m0);
                        bx3Var.a(i2, m0);
                        i2++;
                    } else {
                        gl.c3(new nx3(bx3Var, b));
                        Context context = qx3Var.getContext();
                        d dVar = qx3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) bx3Var.a.get(i2);
                        d dVar2 = qx3Var.m1;
                        new u0b(context, dVar, inputStickerSet, null, dVar2 instanceof mu1 ? ((mu1) dVar2).a0 : null, qx3Var.J0).show();
                    }
                } else {
                    qx3 qx3Var2 = bx3Var.h;
                    qx3Var2.I0();
                    hw hwVar = qx3Var2.q1;
                    if (hwVar != null && hwVar.getAdapter() != null) {
                        hwVar.getAdapter().f();
                    }
                }
            }
        }
        I0();
        d dVar3 = this.m1;
        hq6.d0(dVar3 == null ? y6c.t0 : dVar3.getCurrentAccount()).D(5);
    }

    public void G0() {
    }

    public void F0(boolean z) {
    }
}
