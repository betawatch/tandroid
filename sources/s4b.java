// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class s4b extends nx0 implements fn7 {
    public TextView A1;
    public t39 B1;
    public final AnimatorSet[] C1;
    public final View[] D1;
    public d26 E1;
    public final e F1;
    public ar0 G1;
    public final Activity H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public TLRPC.TL_messages_stickerSet M1;
    public TLRPC.Document N1;
    public k7a O1;
    public TLRPC.InputStickerSet P1;
    public ArrayList Q1;
    public final ArrayList R1;
    public ArrayList S1;
    public HashMap T1;
    public final String U1;
    public final p4b V1;
    public q4b W1;
    public id5 X1;
    public int Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public final fp f2;
    public final h4b g2;
    public pwa h2;
    public String i2;
    public int j2;
    public boolean k2;
    public Pattern l1;
    public String l2;
    public gw9 m1;
    public Runnable m2;
    public o4b n1;
    public ArrayList n2;
    public lu5 o1;
    public int o2;
    public TLRPC.Document p1;
    public int p2;
    public p66 q1;
    public s7 r1;
    public b8 s1;
    public in t1;
    public ok8 u1;
    public FrameLayout v1;
    public FrameLayout w1;
    public TextView x1;
    public View y1;
    public de0 z1;

    public s4b(Context context, Object obj, TLObject tLObject, vnb vnbVar) {
        super(1, vnbVar, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        byte b = 7;
        this.f2 = new fp((byte) 7);
        this.g2 = new h4b(this);
        this.J0 = vnbVar;
        J();
        this.H1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        fb8 fb8Var = (fb8) this;
        this.Z1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new au0((Object) fb8Var, obj, (Object) tL_messages_getAttachedStickers, (Object) new isa(fb8Var, tL_messages_getAttachedStickers, b), (byte) 24));
        K0(context);
    }

    public static void H0(e eVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (eVar != null) {
            zu1 zu1Var = eVar instanceof zu1 ? (zu1) eVar : null;
            boolean z = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
            if (document == null || !document.mime_type.equals("image/webp")) {
                hl.d3(new va7(eVar, (Object) tL_messages_stickerSet, (Object) document, (Object) zu1Var, z, (byte) 21), 300L);
                return;
            }
            ArrayList arrayList = new ArrayList();
            xb4.G(yac.t0);
            File J = xb4.J(document, null, true, true);
            if (J == null || !J.exists()) {
                return;
            }
            hl.d3(new d6a(J, arrayList, eVar, zu1Var, document, z, tL_messages_stickerSet), 300L);
        }
    }

    @Override // nx0
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.I5));
        hashSet.add(Integer.valueOf(aob.F8));
        hashSet.add(Integer.valueOf(aob.E8));
        hashSet.add(Integer.valueOf(aob.Aj));
        hashSet.add(Integer.valueOf(aob.l5));
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void E0() {
        if (this.M1 != null) {
            TLRPC.TL_messages_stickerSet x0 = uc7.s1(this.a).x0(this.M1);
            this.M1 = x0;
            if (x0 == null) {
                dismiss();
            }
        }
    }

    public final void F0(TextView textView, String str, boolean z) {
        if (z) {
            textView.setText(ob6.M0(2131748989, null));
            yob.X(textView, aob.w6, this.J0);
            this.k2 = true;
            this.i2 = str;
            return;
        }
        pwa pwaVar = this.h2;
        if (pwaVar != null) {
            hl.r(pwaVar);
            this.h2 = null;
            this.i2 = null;
            if (this.j2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.j2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(ob6.M0(2131748991, null));
            yob.X(textView, aob.q5, this.J0);
            return;
        }
        this.k2 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(ob6.M0(2131748987, null));
                yob.X(textView, aob.p7, this.J0);
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    textView.setText(ob6.M0(2131748991, null));
                    yob.X(textView, aob.p7, this.J0);
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(ob6.M0(2131748985, null));
            yob.X(textView, aob.p7, this.J0);
        } else {
            if (str.length() > 32) {
                textView.setText(ob6.M0(2131748986, null));
                yob.X(textView, aob.p7, this.J0);
                return;
            }
            textView.setText(ob6.M0(2131748988, null));
            yob.X(textView, aob.F6, this.J0);
            this.i2 = str;
            pwa pwaVar2 = new pwa(this, str, textView, (byte) 6);
            this.h2 = pwaVar2;
            hl.d3(pwaVar2, 300L);
        }
    }

    public final void G0() {
        if (this.L1) {
            this.o1.h(null);
            this.L1 = false;
            this.f2.o(true);
            hl.d0(this.m1, new bm0((byte) 28));
            this.r1.postDelayed(new f4b(this, (byte) 0), 200L);
            this.t1.c(ob6.M0(2131751186, null), true, true);
        }
    }

    public final void I0() {
        if (this.L1) {
            return;
        }
        this.o1.h(this.m1);
        byte b = 1;
        this.L1 = true;
        fp fpVar = this.f2;
        boolean z = false;
        fpVar.o(false);
        float f = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) fpVar.d;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                arrayList.add(valueOf);
                ((ArrayList) fpVar.e).add(valueOf);
                ((ArrayList) fpVar.f).add(valueOf);
            }
        }
        int i2 = 0;
        for (int i3 = 6; i2 < i3; i3 = 6) {
            long nextFloat = (long) (Utilities.b.nextFloat() * 300.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new r4b(fpVar, i2, (byte) 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            ofFloat.setDuration(300L);
            ofFloat.start();
            float L = hl.L(0.5f);
            boolean z2 = z;
            float f2 = f;
            float[] fArr = new float[5];
            fArr[z2 ? 1 : 0] = f2;
            fArr[1] = L;
            fArr[2] = f2;
            fArr[3] = -L;
            fArr[4] = f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new r4b(fpVar, i2, (byte) 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration(360L);
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[z2 ? 1 : 0] = f2;
            fArr2[1] = L;
            fArr2[2] = f2 - L;
            fArr2[3] = f2;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new r4b(fpVar, i2, (byte) 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(300L);
            ofFloat3.start();
            ((ArrayList) fpVar.a).add(ofFloat);
            ((ArrayList) fpVar.b).add(ofFloat2);
            ((ArrayList) fpVar.c).add(ofFloat3);
            i2++;
            z = z2 ? 1 : 0;
            f = f2;
        }
        hl.d0(this.m1, new bm0((byte) 29));
        this.r1.postDelayed(new f4b(this, b), 200L);
        this.t1.c(ob6.M0(2131751319, null), true, true);
    }

    public final void J0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.w1, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new po9((Object) this, (byte) 22));
        animatorSet.start();
    }

    public final void K0(Context context) {
        k4b k4bVar = new k4b(this, context);
        this.b = k4bVar;
        k4bVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i = this.u0;
        viewGroup.setPadding(i, 0, i, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.D1;
        viewArr[0] = view;
        int i2 = aob.V5;
        yob.h(i2, this.J0, view);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        gw9 gw9Var = new gw9((byte) 5, context, this);
        this.m1 = gw9Var;
        gw9Var.setTag(14);
        gw9 gw9Var2 = this.m1;
        getContext();
        ar0 ar0Var = new ar0(this);
        this.G1 = ar0Var;
        gw9Var2.setLayoutManager(ar0Var);
        this.G1.O = new ar1(this, (byte) 18);
        this.o1 = new lu5(new l4b(this));
        gw9 gw9Var3 = this.m1;
        o4b o4bVar = new o4b(this, context);
        this.n1 = o4bVar;
        gw9Var3.setAdapter(o4bVar);
        this.m1.setVerticalScrollBarEnabled(false);
        this.m1.i(new br1((byte) 14));
        this.m1.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        this.m1.setClipToPadding(false);
        this.m1.setEnabled(true);
        yob.H(this.m1, aob.A5, this.J0);
        this.m1.setOnTouchListener(new b7(this, (byte) 16));
        byte b = 29;
        this.m1.setOnScrollListener(new e98(this, b));
        t39 t39Var = new t39(this, (byte) 17);
        this.B1 = t39Var;
        this.m1.setOnItemClickListener(t39Var);
        this.b.addView(this.m1, tre.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        d26 d26Var = new d26(b, context, this);
        this.E1 = d26Var;
        this.b.addView(d26Var, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.m1.setEmptyView(this.E1);
        this.E1.setOnTouchListener(new b02((byte) 26));
        p66 p66Var = new p66(context, null);
        this.q1 = p66Var;
        p66Var.setLines(1);
        this.q1.setSingleLine(true);
        yob.X(this.q1, aob.j5, this.J0);
        this.q1.setTextSize(1, 20.0f);
        yob.G(this.q1, aob.k5, this.J0);
        this.q1.setEllipsize(TextUtils.TruncateAt.END);
        this.q1.setPadding(hl.L(18.0f), hl.L(6.0f), hl.L(18.0f), hl.L(6.0f));
        this.q1.setGravity(16);
        this.q1.setTypeface(hl.o());
        this.b.addView(this.q1, tre.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        s7 s7Var = new s7(context, null, 0, aob.v0(aob.Aj, this.J0), false, this.J0);
        this.r1 = s7Var;
        s7Var.setLongClickEnabled(false);
        this.r1.setSubMenuOpenSide(2);
        this.r1.setIcon(R.drawable.ic_ab_other);
        s7 s7Var2 = this.r1;
        int i3 = aob.Ej;
        yob.R(s7Var2, aob.f0(aob.v0(i3, this.J0), 1, -1), null, yob.M(i3), this.J0);
        this.b.addView(this.r1, tre.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.r1.e(1, R.drawable.msg_share, ob6.M0(2131744503, null));
        this.r1.e(2, R.drawable.msg_link, ob6.M0(2131751727, null));
        this.r1.setOnClickListener(new d4b(this, (byte) 1));
        this.r1.setDelegate(new e4b(this));
        this.r1.setContentDescription(ob6.M0(2131754834, null));
        this.r1.setVisibility(this.P1 != null ? 0 : 8);
        this.E1.addView(new RadialProgressView(context, null), tre.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, hl.e1(), 83);
        layoutParams2.bottomMargin = hl.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        yob.h(i2, this.J0, view2);
        this.b.addView(viewArr[1], layoutParams2);
        in inVar = new in(context, false, false, false);
        this.t1 = inVar;
        int i4 = aob.h5;
        int v0 = aob.v0(i4, this.J0);
        int i5 = aob.i6;
        hf0 g0 = aob.g0(v0, aob.v0(i5, this.J0));
        uob M = yob.M(i4);
        uob M2 = yob.M(i5);
        vnb vnbVar = this.J0;
        inVar.setBackground(g0);
        yob.j(inVar, g0, M, M2, vnbVar);
        in inVar2 = this.t1;
        int i6 = aob.n5;
        this.e2 = i6;
        yob.U(inVar2, i6, this.J0);
        this.t1.setTextSize(hl.L(14.0f));
        this.t1.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        this.t1.setTypeface(hl.o());
        this.t1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.v1 = frameLayout;
        frameLayout.addView(this.t1, tre.c(48.0f, -1));
        this.b.addView(this.v1, tre.e(-1, -2, 83));
        ok8 ok8Var = new ok8(hl.L(24.0f), this.J0, context, false);
        this.u1 = ok8Var;
        ok8Var.setIcon(R.raw.unlock_icon);
        this.u1.setVisibility(4);
        this.b.addView(this.u1, tre.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.w1.setSoundEffectsEnabled(false);
        this.b.addView(this.w1, tre.c(-1.0f, -1));
        this.w1.setOnClickListener(new d4b(this, (byte) 2));
        de0 de0Var = new de0(context);
        this.z1 = de0Var;
        de0Var.setAspectFit(true);
        this.z1.setLayerNum(7);
        this.w1.addView(this.z1);
        TextView textView = new TextView(context);
        this.A1 = textView;
        textView.setTextSize(1, 30.0f);
        this.A1.setGravity(85);
        this.w1.addView(this.A1);
        TextView textView2 = new TextView(context);
        this.x1 = textView2;
        textView2.setTextSize(1, 14.0f);
        yob.X(this.x1, i6, this.J0);
        yob.R(this.x1, aob.g0(aob.v0(i4, this.J0), aob.v0(i5, this.J0)), yob.M(i4), yob.M(i5), this.J0);
        this.x1.setGravity(17);
        this.x1.setPadding(hl.L(29.0f), 0, hl.L(29.0f), 0);
        this.x1.setTypeface(hl.o());
        this.w1.addView(this.x1, tre.e(-1, 48, 83));
        this.x1.setOnClickListener(new d4b(this, (byte) 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, hl.e1(), 83);
        layoutParams3.bottomMargin = hl.L(48.0f);
        View view3 = new View(context);
        this.y1 = view3;
        yob.h(i2, this.J0, view3);
        this.w1.addView(this.y1, layoutParams3);
        jn7.e().b(this, jn7.l4);
        if (this.R1 != null) {
            jn7.f(this.a).b(this, jn7.U1);
            jn7.f(this.a).b(this, jn7.V1);
        }
        jn7.f(this.a).b(this, jn7.x0);
        U0();
        W0();
        T0();
        S0(false);
        this.n1.f();
    }

    public final boolean L0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.K1;
        }
        return true;
    }

    public final void M0() {
        String str;
        if (this.P1 != null) {
            ls6 d0 = ls6.d0(this.a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
            if (tL_messages_stickerSet == null && (str = this.P1.short_name) != null) {
                tL_messages_stickerSet = d0.q0(str);
                this.M1 = tL_messages_stickerSet;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet == null) {
                tL_messages_stickerSet2 = d0.p0(this.P1.id);
                this.M1 = tL_messages_stickerSet2;
            }
            if (tL_messages_stickerSet2 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.P1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new isa(this, d0, (byte) 6));
            } else {
                if (this.n1 != null) {
                    W0();
                    U0();
                    this.n1.f();
                }
                T0();
                d0.r1(this.M1);
                E0();
            }
        }
        if (this.M1 != null) {
            this.b2 = !r0.set.masks;
        }
        E0();
    }

    public final void N0(k7a k7aVar) {
        int indexOf = this.S1.indexOf(k7aVar);
        if (indexOf >= 0) {
            this.S1.remove(indexOf);
            this.n1.s(indexOf);
            if (this.S1.isEmpty()) {
                dismiss();
            } else {
                U0();
            }
        }
    }

    public final void O0(int i, boolean z) {
        if (this.Q1 == null) {
            View[] viewArr = this.D1;
            if (z) {
                if (viewArr[i].getTag() == null) {
                    return;
                }
            } else if (viewArr[i].getTag() != null) {
                return;
            }
            viewArr[i].setTag(z ? null : 1);
            if (z) {
                viewArr[i].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.C1;
            AnimatorSet animatorSet = animatorSetArr[i];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i] = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            animatorSetArr[i].setDuration(150L);
            animatorSetArr[i].addListener(new y5(this, i, z));
            animatorSetArr[i].start();
        }
    }

    public final void P0(View.OnClickListener onClickListener, String str, int i) {
        Q0(onClickListener, str, i, -1, -1);
    }

    public final void Q0(View.OnClickListener onClickListener, String str, int i, int i2, int i3) {
        if (i >= 0) {
            in inVar = this.t1;
            this.e2 = i;
            yob.U(inVar, i, this.J0);
        }
        this.t1.c(str, false, true);
        this.t1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.m1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.E1.getLayoutParams();
        if (onClickListener == null) {
            this.t1.setAlpha(0.0f);
        } else if (i2 < 0 || i3 < 0) {
            in inVar2 = this.t1;
            int i4 = aob.h5;
            int v0 = aob.v0(i4, this.J0);
            int i5 = aob.q7;
            yob.R(inVar2, aob.g0(v0, aob.p1(0.1f, aob.v0(i5, this.J0))), yob.M(i4), yob.K(0.1f, i5), this.J0);
            this.v1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L = hl.L(48.0f);
            marginLayoutParams2.bottomMargin = L;
            marginLayoutParams3.bottomMargin = L;
            marginLayoutParams4.bottomMargin = L;
            if (this.t1.getAlpha() < 1.0f) {
                ik8.t(this.t1.animate().alpha(1.0f), k43.h, 240L);
            }
        } else {
            in inVar3 = this.t1;
            int L2 = hl.L(24.0f);
            int v02 = aob.v0(i2, this.J0);
            int v03 = aob.v0(i3, this.J0);
            yob.R(inVar3, aob.i0(L2, L2, L2, L2, v02, v03, v03), yob.M(i2), yob.M(i3), this.J0);
            yob.h(aob.h5, this.J0, this.v1);
            int L3 = hl.L(8.0f);
            marginLayoutParams.bottomMargin = L3;
            marginLayoutParams.rightMargin = L3;
            marginLayoutParams.topMargin = L3;
            marginLayoutParams.leftMargin = L3;
            int L4 = hl.L(64.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.t1.getAlpha() < 1.0f) {
                ik8.t(this.t1.animate().alpha(1.0f), k43.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void R0(int i) {
        this.Y1 = i;
        if (this.Q1 == null) {
            float f = i;
            this.q1.setTranslationY(f);
            if (this.R1 == null) {
                this.r1.setTranslationY(f);
            }
            this.D1[0].setTranslationY(f);
        }
        this.b.invalidate();
    }

    @Override // nx0
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 20);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.s0};
        int i = aob.h5;
        arrayList.add(new apb(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (zob) null, i));
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.zj));
        if (this.n1.r.Q1 != null) {
            h94.a(arrayList, u00Var);
        }
        arrayList.add(new apb(this.r1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Ej));
        arrayList.add(new apb(this.t1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        in inVar = this.t1;
        int i2 = aob.i6;
        arrayList.add(new apb(inVar, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.t1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, this.e2));
        arrayList.add(new apb(this.x1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.x1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        return arrayList;
    }

    public final void S0(boolean z) {
        this.n1.getClass();
        this.q1.setHighlightColor(aob.v0(aob.l5, this.J0));
        this.w1.setBackgroundColor(aob.v0(aob.h5, this.J0) & (-536870913));
        this.r1.setIconColor(aob.v0(aob.Aj, this.J0));
        this.r1.O(aob.v0(aob.E8, this.J0), false);
        this.r1.O(aob.v0(aob.F8, this.J0), true);
        this.r1.setPopupItemsSelectorColor(aob.v0(aob.I5, this.J0));
        this.r1.I(aob.v0(aob.G8, this.J0));
        if (this.s1 != null) {
            int v0 = aob.v0(aob.q7, this.J0);
            this.s1.d(v0, v0);
            this.s1.setSelectorColor(aob.p1(0.1f, v0));
            if (this.s1.getRightIcon() != null && v0 != this.o2) {
                this.o2 = v0;
                this.s1.getRightIcon().setColorFilter(v0);
            }
        }
        if (z) {
            if (aob.f1() && this.n2 == null) {
                ArrayList S = S();
                this.n2 = S;
                int size = S.size();
                for (int i = 0; i < size; i++) {
                    ((apb) this.n2.get(i)).g = null;
                }
            }
            int size2 = this.n2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                apb apbVar = (apb) this.n2.get(i2);
                apbVar.e(aob.v0(apbVar.e, this.J0), false, false);
            }
        }
        if (aob.f1() || this.n2 == null) {
            return;
        }
        this.n2 = null;
    }

    public final void T0() {
        if (this.b == null || yac.h(this.a).p()) {
            return;
        }
        r47.U3(this.M1);
    }

    public final void U0() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z;
        TLRPC.StickerSet stickerSet;
        String G;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        TLRPC.StickerSet stickerSet6;
        boolean z2;
        TLRPC.StickerSet stickerSet7;
        if (this.q1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        int i = 1;
        byte b = 0;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.R1;
            if (arrayList3 == null) {
                P0(new d4b(this, b), ob6.M0(2131752006, null), aob.n5);
                return;
            }
            p66 p66Var = this.q1;
            ArrayList arrayList4 = this.S1;
            p66Var.setText(ob6.G(arrayList4 != null ? arrayList4.size() : arrayList3.size(), "Stickers", new Object[0]));
            HashMap hashMap = this.T1;
            if (hashMap != null && !hashMap.isEmpty()) {
                P0(null, ob6.M0(2131748983, null), aob.q5);
                this.t1.setEnabled(false);
                return;
            } else {
                d4b d4bVar = new d4b(this, (byte) 14);
                ArrayList arrayList5 = this.S1;
                P0(d4bVar, ob6.a0("ImportStickers", null, 2131748996, ob6.G(arrayList5 != null ? arrayList5.size() : arrayList3.size(), "Stickers", new Object[0])), aob.n5);
                this.t1.setEnabled(true);
                return;
            }
        }
        CharSequence m = pv3.m(this.M1.set.title, this.q1.getPaint().getFontMetricsInt(), false, null, 0);
        byte b2 = 4;
        try {
            Pattern pattern = this.l1;
            if (pattern == null) {
                pattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                this.l1 = pattern;
            }
            Matcher matcher = pattern.matcher(m);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(m);
                }
                int start = matcher.start();
                int end = matcher.end();
                if (this.M1.set.title.charAt(start) != '@') {
                    start++;
                }
                spannableStringBuilder.setSpan(new vi(b2, this, m.subSequence(start + 1, end).toString()), start, end, 0);
            }
            if (spannableStringBuilder != null) {
                m = spannableStringBuilder;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.q1.setText(m);
        if (L0()) {
            int measuredWidth = this.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = hl.q.x;
            }
            this.n1.d = Math.max(1, measuredWidth / hl.L(hl.O1() ? 60.0f : 45.0f));
        } else {
            this.n1.d = 5;
        }
        this.G1.x1(this.n1.d);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.M1;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || yac.h(this.a).p() || this.X1 != null) {
            this.u1.setVisibility(4);
        } else if (this.M1.documents != null) {
            for (int i2 = 0; i2 < this.M1.documents.size(); i2++) {
                if (!r47.m3(this.M1.documents.get(i2))) {
                    this.u1.setVisibility(0);
                    this.t1.setBackground(null);
                    P0(null, null, -1);
                    this.u1.b(ob6.M0(2131743520, null), new d4b(this, (byte) 8), false);
                    return;
                }
            }
        }
        ls6 d0 = ls6.d0(this.a);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.M1;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !d0.D0(stickerSet.id, true);
        } else {
            ArrayList t0 = d0.t0(5);
            for (int i3 = 0; t0 != null && i3 < t0.size(); i3++) {
                if (t0.get(i3) != null && ((TLRPC.TL_messages_stickerSet) t0.get(i3)).set != null && ((TLRPC.TL_messages_stickerSet) t0.get(i3)).set.id == this.M1.set.id) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            z = !z2;
        }
        id5 id5Var = this.X1;
        if (id5Var != null) {
            d4b d4bVar2 = new d4b(this, (byte) 9);
            boolean z3 = id5Var.c.O;
            boolean z4 = id5Var.a;
            String M0 = z3 ? ob6.M0(z4 ? 2131746037 : 2131745272, null) : ob6.M0(z4 ? 2131746036 : 2131745271, null);
            boolean z5 = this.X1.a;
            Q0(d4bVar2, M0, z5 ? aob.q7 : aob.Ji, !z5 ? aob.Fi : -1, z5 ? -1 : aob.Hi);
            return;
        }
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.M1;
            if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                i = 5;
            } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                i = 0;
            }
            if (!d0.X[i]) {
                d0.D(i);
                Q0(null, "", -1, -1, -1);
                return;
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.M1;
        if (z) {
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                G2 = ob6.G(arrayList6 == null ? 0 : arrayList6.size(), "AddManyMasksCount", new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                G2 = ob6.G((tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), "AddManyStickersCount", new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                G2 = ob6.G(arrayList7 == null ? 0 : arrayList7.size(), "AddManyEmojiCount", new Object[0]);
            }
            Q0(new d4b(this, (byte) 10), G2, aob.Ji, aob.Fi, aob.Hi);
        } else {
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet5.set;
            boolean z6 = stickerSet8.creator;
            if (z6) {
                G = ob6.M0(this.L1 ? 2131751319 : 2131751186, null);
            } else if (stickerSet8.masks) {
                G = ob6.G(tL_messages_stickerSet5.documents.size(), "RemoveManyMasksCount", new Object[0]);
            } else {
                boolean z7 = stickerSet8.emojis;
                ArrayList<TLRPC.Document> arrayList8 = tL_messages_stickerSet5.documents;
                G = z7 ? ob6.G(arrayList8.size(), "RemoveManyEmojiCount", new Object[0]) : ob6.G(arrayList8.size(), "RemoveManyStickersCount", new Object[0]);
            }
            String str = G;
            if (z6) {
                Q0(new d4b(this, (byte) 11), str, aob.Ji, aob.Fi, aob.Hi);
            } else if (this.M1.set.official) {
                P0(new d4b(this, (byte) 12), str, aob.q7);
            } else {
                P0(new d4b(this, (byte) 13), str, aob.q7);
            }
        }
        this.n1.f();
    }

    public final void V0() {
        if (this.m1.getChildCount() <= 0) {
            R0(this.m1.getPaddingTop());
            return;
        }
        int i = 0;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.m1.getChildCount(); i3++) {
            View childAt = this.m1.getChildAt(i3);
            this.m1.getClass();
            int S = RecyclerView.S(childAt);
            if (i2 == -1 || i2 > S) {
                view = childAt;
                i2 = S;
            }
        }
        if (view == null || view.getTop() < 0) {
            O0(0, true);
        } else {
            int top = view.getTop();
            O0(0, false);
            i = top;
        }
        O0(1, true);
        if (this.Y1 != i) {
            R0(i);
        }
    }

    public final void W0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = hl.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / hl.p);
        if (this.R1 != null) {
            this.x1.setText(ob6.M0(2131748982, null));
            yob.X(this.x1, aob.q7, this.J0);
            float f = min;
            this.z1.setLayoutParams(tre.d(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(tre.d(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setVisibility(0);
            this.y1.setVisibility(0);
            return;
        }
        if (this.V1 == null || ((tL_messages_stickerSet = this.M1) != null && tL_messages_stickerSet.set.masks)) {
            this.x1.setText(ob6.M0(2131752006, null));
            this.z1.setLayoutParams(tre.e(min, min, 17));
            this.A1.setLayoutParams(tre.e(min, min, 17));
            this.x1.setVisibility(8);
            this.y1.setVisibility(8);
            return;
        }
        this.x1.setText(ob6.M0(2131745317, null));
        float f2 = min;
        this.z1.setLayoutParams(tre.d(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.A1.setLayoutParams(tre.d(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.x1.setVisibility(0);
        this.y1.setVisibility(0);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            gw9 gw9Var = this.m1;
            if (gw9Var != null) {
                int childCount = gw9Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.m1.getChildAt(i3).invalidate();
                }
                return;
            }
            return;
        }
        if (i == jn7.U1) {
            HashMap hashMap = this.T1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                k7a k7aVar = (k7a) hashMap.get(str);
                if (k7aVar != null) {
                    k7aVar.a(this.a, (TLRPC.InputFile) objArr[1], new pwa(this, str, k7aVar, (byte) 4));
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.V1) {
            HashMap hashMap2 = this.T1;
            if (hashMap2 != null) {
                k7a k7aVar2 = (k7a) hashMap2.remove((String) objArr[0]);
                if (k7aVar2 != null) {
                    N0(k7aVar2);
                }
                if (this.T1.isEmpty()) {
                    U0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.x0) {
            if (this.P1 != null) {
                ls6 d0 = ls6.d0(this.a);
                String str2 = this.P1.short_name;
                r5 = str2 != null ? d0.q0(str2) : null;
                if (r5 == null) {
                    r5 = d0.p0(this.P1.id);
                }
            }
            if (r5 != null && r5 != this.M1) {
                this.M1 = r5;
                M0();
            }
            U0();
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public void dismiss() {
        super.dismiss();
        this.f2.o(false);
        Runnable runnable = this.m2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        jn7.e().n(this, jn7.l4);
        if (this.R1 != null) {
            ArrayList arrayList = this.S1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    k7a k7aVar = (k7a) this.S1.get(i);
                    if (!k7aVar.c) {
                        xb4.G(this.a).b(k7aVar.a, false);
                    }
                    if (k7aVar.e) {
                        new File(k7aVar.a).delete();
                    }
                }
            }
            jn7.f(this.a).n(this, jn7.U1);
            jn7.f(this.a).n(this, jn7.V1);
        }
        jn7.f(this.a).n(this, jn7.x0);
        jn7.e().k(jn7.k1, 4);
    }

    @Override // nx0, ag0
    public final void n(Runnable runnable) {
        this.m2 = runnable;
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        if (rw2.e().E) {
            rw2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // nx0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        v21.a((FrameLayout) this.b, new t10(this, (byte) 20));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        v21.h((FrameLayout) this.b);
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        S0(false);
        try {
            int v0 = aob.v0(aob.h5, this.J0);
            if (this.s0 != null && v0 != this.p2) {
                this.p2 = v0;
                s0(v0);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        jn7.e().k(jn7.j1, 4);
    }

    public s4b(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, (vnb) null, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new fp((byte) 7);
        this.g2 = new h4b(this);
        J();
        this.H1 = (Activity) context;
        this.R1 = arrayList;
        this.U1 = str;
        Utilities.e.c(new pwa(this, arrayList, arrayList2, (byte) 2));
        K0(context);
    }

    public s4b(Context context, e eVar, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, p4b p4bVar, vnb vnbVar) {
        super(1, vnbVar, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new fp((byte) 7);
        this.g2 = new h4b(this);
        J();
        this.V1 = p4bVar;
        this.P1 = inputStickerSet;
        this.M1 = tL_messages_stickerSet;
        this.F1 = eVar;
        M0();
        K0(context);
    }
}
