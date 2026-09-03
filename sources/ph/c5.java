package ph;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j21;
import org.telegram.ui.s61;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class c5 extends rv0 implements dg.n2, dg.h, dg.i2, pv0, z9 {
    public final cg.i2 A0;
    public float A1;
    public final DispatchQueue B0;
    public final Paint B1;
    public final MediaController.CropState C0;
    public final int C1;
    public boolean D0;
    public final q4 D1;
    public jv0 E0;
    public org.telegram.ui.ActionBar.p1 E1;
    public boolean F0;
    public b5 F1;
    public dg.j G0;
    public Rect G1;
    public boolean H0;
    public Runnable H1;
    public int I0;
    public Runnable I1;
    public boolean J0;
    public final ca J1;
    public final boolean K0;
    public AnimatorSet K1;
    public final s4 L0;
    public final j4 L1;
    public final u4 M0;
    public t6 M1;
    public final x4 N0;
    public ArrayList N1;
    public final w4 O0;
    public int O1;
    public final FrameLayout P0;
    public int P1;
    public final y4 Q0;
    public cg.e0 Q1;
    public final g4 R0;
    public final boolean R1;
    public final FrameLayout S0;
    public final File S1;
    public dg.k0 T0;
    public final boolean T1;
    public final View U0;
    public final boolean U1;
    public int V0;
    public boolean V1;
    public int W0;
    public pk0 W1;
    public float X0;
    public dg.a3 X1;
    public ValueAnimator Y0;
    public float Y1;
    public boolean Z0;
    public boolean Z1;
    public final dg.t2 a1;
    public boolean a2;
    public final o3.c b1;
    public org.telegram.ui.Components.ba b2;
    public final int c1;
    public final j5 c2;
    public BigInteger d1;
    public final k5 d2;
    public TextView e1;
    public boolean e2;
    public TextView f1;
    public ObjectAnimator f2;
    public TextView g1;
    public final float[] g2;
    public final dg.o2 h1;
    public l4 h2;
    public final dg.k2 i1;
    public boolean i2;
    public final dg.q2 j1;
    public boolean j2;
    public final ImageView k1;
    public boolean k2;
    public final TextView l1;
    public final int[] l2;
    public final TextView m1;
    public kz m2;
    public final TextView n1;
    public boolean n2;
    public final Paint o1;
    public boolean o2;
    public final Paint p1;
    public boolean p2;
    public float q1;
    public int q2;
    public boolean r1;
    public boolean r2;
    public o1.j s1;
    public int s2;
    public final h4 t1;
    public int t2;
    public final Paint u1;
    public int u2;
    public final Paint v1;
    public boolean v2;
    public final Paint w1;
    public final dg.b2 x0;
    public final cg.f2 x1;
    public final dg.f2 y0;
    public boolean y1;
    public final Bitmap z0;
    public o1.j z1;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public c5(android.content.Context r30, boolean r31, java.io.File r32, boolean r33, boolean r34, ph.ca r35, android.app.Activity r36, int r37, android.graphics.Bitmap r38, android.graphics.Bitmap r39, int r40, java.util.ArrayList r41, ph.t6 r42, int r43, int r44, org.telegram.messenger.MediaController.CropState r45, org.telegram.ui.Components.ba r46, org.telegram.ui.ActionBar.f6 r47, ph.j5 r48, ph.k5 r49) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.c5.<init>(android.content.Context, boolean, java.io.File, boolean, boolean, ph.ca, android.app.Activity, int, android.graphics.Bitmap, android.graphics.Bitmap, int, java.util.ArrayList, ph.t6, int, int, org.telegram.messenger.MediaController$CropState, org.telegram.ui.Components.ba, org.telegram.ui.ActionBar.f6, ph.j5, ph.k5):void");
    }

    public static void G0(dg.b4 b4Var, int i10) {
        b4Var.setAlign(i10);
        int i11 = 2;
        b4Var.getEditText().setGravity(i10 != 1 ? i10 != 2 ? 19 : 21 : 17);
        if (i10 == 1) {
            i11 = 4;
        } else if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i11 = 3;
        }
        b4Var.getEditText().setTextAlignment(i11);
    }

    public static void Z(h9 h9Var, cg.f1 f1Var, Integer num) {
        f1Var.h(num.intValue(), true);
        f1Var.g();
        h9Var.setNewColor(num.intValue());
        h9Var.t1.setSelectedColorIndex(f1Var.d());
        h9Var.Q1 = null;
    }

    public static /* synthetic */ void a0(h9 h9Var, Integer num) {
        h9Var.setNewColor(num.intValue());
        h9Var.I0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.V0 == 2 ? this.i1 : this.h1;
    }

    private int getFrameRotation() {
        int i10 = this.c1;
        if (i10 == 90) {
            return 1;
        }
        if (i10 != 180) {
            return i10 != 270 ? 0 : 3;
        }
        return 2;
    }

    private jv0 getPaintingSize() {
        jv0 jv0Var = this.E0;
        if (jv0Var != null) {
            return jv0Var;
        }
        jv0 jv0Var2 = new jv0(1080.0f, 1920.0f);
        this.E0 = jv0Var2;
        return jv0Var2;
    }

    private void setCoverPause(boolean z4) {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 >= w4Var.getChildCount()) {
                return;
            }
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.r3) {
                ImageReceiver imageReceiver = ((dg.r3) childAt).u0;
                gj0 lottieAnimation = imageReceiver.getLottieAnimation();
                org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
                boolean z10 = !z4;
                imageReceiver.setAllowStartLottieAnimation(z10);
                imageReceiver.setAllowStartAnimation(z10);
                if (lottieAnimation != null) {
                    if (z4) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.y = z4;
                    if (z4) {
                        animation.x(false);
                    }
                    if (z4) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(int i10) {
        cg.f2 f2Var = this.x1;
        int i11 = f2Var.a;
        f2Var.a = i10;
        E0(f2Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new dg.g0(this, i11, i10, 5));
        duration.start();
    }

    private void setTextType(int i10) {
        this.I0 = i10;
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            ((dg.b4) jVar).setType(i10);
        }
        cg.f1 e = cg.f1.e(this.C1);
        e.h = i10;
        e.a.edit().putInt("text_type", i10).apply();
        this.i1.e(i10, true);
    }

    private void setupTabsLayout(Context context) {
        dg.k0 k0Var = new dg.k0(this, context);
        this.T0 = k0Var;
        k0Var.setClipToPadding(false);
        this.T0.setOrientation(0);
        this.Q0.addView(this.T0, k7.b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.e1;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        q4 q4Var = this.D1;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.e1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.e1.setTextColor(-1);
        this.e1.setTextSize(1, 14.0f);
        this.e1.setGravity(1);
        this.e1.setTypeface(AndroidUtilities.bold());
        this.e1.setSingleLine();
        final int i11 = 0;
        this.e1.setOnClickListener(new View.OnClickListener(this) { // from class: ph.t3
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c5 c5Var = this.b;
                        if (!c5Var.H0) {
                            c5Var.R0(0);
                            break;
                        } else {
                            c5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        c5 c5Var2 = this.b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.i2 = true;
                            c5Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.T0.addView(this.e1, k7.b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.f1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i12 = 1;
        this.f1.setOnClickListener(new View.OnClickListener(this) { // from class: ph.t3
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c5 c5Var = this.b;
                        if (!c5Var.H0) {
                            c5Var.R0(0);
                            break;
                        } else {
                            c5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        c5 c5Var2 = this.b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.i2 = true;
                            c5Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.f1.setTextColor(-1);
        this.f1.setTextSize(1, 14.0f);
        this.f1.setGravity(1);
        this.f1.setTypeface(AndroidUtilities.bold());
        this.f1.setAlpha(0.6f);
        this.f1.setSingleLine();
        this.T0.addView(this.f1, k7.b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.g1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.g1.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i10, q4Var), 7, -1));
        this.g1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.g1.setTextColor(-1);
        this.g1.setTextSize(1, 14.0f);
        this.g1.setGravity(1);
        this.g1.setTypeface(AndroidUtilities.bold());
        this.g1.setAlpha(0.6f);
        this.g1.setSingleLine();
        final int i13 = 2;
        this.g1.setOnClickListener(new View.OnClickListener(this) { // from class: ph.t3
            public final /* synthetic */ c5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c5 c5Var = this.b;
                        if (!c5Var.H0) {
                            c5Var.R0(0);
                            break;
                        } else {
                            c5Var.D0(null, true);
                            break;
                        }
                    case 1:
                        this.b.A0();
                        break;
                    default:
                        c5 c5Var2 = this.b;
                        c5Var2.R0(2);
                        if (!(c5Var2.G0 instanceof dg.b4)) {
                            c5Var2.i2 = true;
                            c5Var2.o0(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.T0.addView(this.g1, k7.b6.l(1.0f, 0, -2));
    }

    public static boolean x0(TLRPC.Document document) {
        if (document != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    @Override // dg.n2
    public final void A() {
        N0(new a4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void A0() {
        final int i10 = this.V0;
        R0(1);
        postDelayed(new j21(this, 13), 350L);
        l4 l4Var = new l4(this, getContext(), this.D1, i10);
        this.h2 = l4Var;
        ca caVar = this.J1;
        Objects.requireNonNull(caVar);
        l4Var.w = new d4(caVar, 1);
        final boolean[] zArr = {true};
        l4Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ph.f4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c5 c5Var = c5.this;
                c5Var.h2 = null;
                if (zArr[0]) {
                    c5Var.z0(false);
                }
                c5Var.R0(i10);
            }
        });
        l4Var.y = new b4(this);
        l4Var.q0(new org.telegram.ui.Components.i(this, zArr, l4Var, 3));
        l4Var.show();
        z0(true);
    }

    public final void B0(dg.j jVar) {
        this.A0.b(jVar.getUUID(), new z3(this, jVar, 0));
    }

    public final void C0(dg.j jVar) {
        dg.j jVar2 = this.G0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.j0, false);
            D0(null, true);
            if (jVar instanceof dg.b4) {
                ValueAnimator valueAnimator = this.Y0;
                if (valueAnimator != null && this.W0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.O0.removeView(jVar);
        g0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            cg.i2 i2Var = this.A0;
            i2Var.b.remove(uuid);
            i2Var.c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.d(i2Var, 15));
        }
        dg.t2 t2Var = this.a1;
        o3.c cVar = this.b1;
        t2Var.setValueOverride(cVar);
        t2Var.setShowPreview(true);
        float f10 = cVar.get();
        cg.f2 f2Var = this.x1;
        f2Var.c = f10;
        E0(f2Var, null, false);
        if (this.k2 || !(jVar instanceof dg.b3)) {
            return;
        }
        da daVar = ((h9) this).x2;
        s9 s9Var = daVar.U0;
        if (s9Var != null) {
            s9Var.s(null, null, true);
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            h9Var.q0();
        }
        t9 t9Var = daVar.Z0;
        if (t9Var != null) {
            t9Var.setHasRoundVideo(false);
        }
        t6 t6Var = daVar.H1;
        if (t6Var != null) {
            File file = t6Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                daVar.H1.o0 = null;
            }
            if (daVar.H1.p0 != null) {
                try {
                    new File(daVar.H1.p0).delete();
                } catch (Exception unused2) {
                }
                daVar.H1.p0 = null;
            }
        }
    }

    @Override // dg.i2
    public final void D() {
        P0(true);
    }

    public final boolean D0(dg.j jVar, boolean z4) {
        boolean z10;
        oa oaVar;
        oa oaVar2;
        pk0 pk0Var;
        int i10;
        boolean z11 = jVar instanceof dg.b4;
        int i11 = 2;
        if (z11 && (((i10 = this.W0) == -1 && this.V0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.y1) {
                I0(false);
            }
            R0(2);
        }
        boolean z12 = true;
        if (z11 && z4) {
            dg.b4 b4Var = (dg.b4) jVar;
            int gravity = b4Var.getEditText().getGravity();
            if (gravity == 17) {
                i11 = 1;
            } else if (gravity != 21) {
                i11 = 0;
            }
            dg.k2 k2Var = this.i1;
            k2Var.setAlignment(i11);
            cg.t0 typeface = b4Var.getTypeface();
            if (typeface != null) {
                k2Var.setTypeface(typeface.a);
            }
            k2Var.e(b4Var.getType(), true);
            this.R0.invalidate();
        }
        dg.j jVar2 = this.G0;
        if (jVar2 == null) {
            z10 = false;
        } else {
            if (jVar2 == jVar) {
                if (!jVar.a0) {
                    if (jVar instanceof dg.m1) {
                        dg.m1 m1Var = (dg.m1) jVar;
                        m1Var.setType((m1Var.getType() + 1) % m1Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof dg.c4) {
                        dg.c4 c4Var = (dg.c4) jVar;
                        c4Var.setType((c4Var.getType() + 1) % c4Var.getTypesCount());
                        return true;
                    }
                    if (jVar instanceof dg.i1) {
                        dg.i1 i1Var = (dg.i1) jVar;
                        dg.g1 g1Var = i1Var.n0;
                        if (g1Var.e()) {
                            g1Var.setPreviewType(g1Var.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        i1Var.setType(i1Var.getNextType());
                        return true;
                    }
                    if (!this.H0) {
                        if (jVar instanceof dg.b4) {
                            this.J0 = true;
                            r0();
                            return true;
                        }
                        if (!(jVar instanceof dg.a3)) {
                            M0(jVar2);
                            return true;
                        }
                        dg.a3 a3Var = (dg.a3) jVar;
                        if (this.Z1 && this.X1 == jVar) {
                            a3Var.q(true);
                            return true;
                        }
                        dg.a3 a3Var2 = this.X1;
                        if (a3Var2 != null && a3Var2 != a3Var && (pk0Var = this.W1) != null) {
                            pk0Var.animate().alpha(0.0f).setListener(new ck0(pk0Var, 2));
                            this.W1 = null;
                            this.Z1 = false;
                            this.Y1 = 0.0f;
                        }
                        if (this.W1 == null) {
                            pk0 pk0Var2 = new pk0(2, this.C1, getContext(), LaunchActivity.R(), new nh.m2(7, new nh.b()));
                            this.W1 = pk0Var2;
                            org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(this.b2, pk0Var2, 0, false);
                            this.W1.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.J1.addView(this.W1, k7.b6.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            Paint paint = new Paint(1);
                            paint.setColor(i0.a.k(-16777216, 120));
                            pk0 pk0Var3 = this.W1;
                            c5.j jVar3 = new c5.j();
                            jVar3.e = this;
                            jVar3.c = faVar;
                            jVar3.d = paint;
                            jVar3.b = new Path();
                            pk0Var3.setDelegate(jVar3);
                            this.W1.p(null, null, true);
                        }
                        this.W1.setFragment(LaunchActivity.R());
                        this.X1 = a3Var;
                        O0(true);
                        return true;
                    }
                    if (jVar2 instanceof dg.b4) {
                        AndroidUtilities.showKeyboard(((dg.b4) jVar2).getFocusedView());
                        v0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.j0, false);
            dg.j jVar4 = this.G0;
            if (jVar4 instanceof dg.b4) {
                dg.b4 b4Var2 = (dg.b4) jVar4;
                dg.z3 z3Var = b4Var2.n0;
                z3Var.clearFocus();
                z3Var.setEnabled(false);
                z3Var.setClickable(false);
                b4Var2.m();
                if (!z11) {
                    this.H0 = false;
                    AndroidUtilities.hideKeyboard(((dg.b4) this.G0).getFocusedView());
                    v0(false);
                }
            } else if ((jVar4 instanceof dg.b3) && (oaVar2 = ((h9) this).x2.W0) != null) {
                oaVar2.l(false);
            }
            z10 = true;
        }
        dg.j jVar5 = this.G0;
        this.G0 = jVar;
        if ((jVar5 instanceof dg.b4) && TextUtils.isEmpty(((dg.b4) jVar5).getText())) {
            C0(jVar5);
        }
        dg.j jVar6 = this.G0;
        if (jVar5 != jVar6 && (jVar6 instanceof dg.b3) && (oaVar = ((h9) this).x2.W0) != null) {
            oaVar.l(true);
        }
        dg.j jVar7 = this.G0;
        o3.c cVar = this.b1;
        cg.f2 f2Var = this.x1;
        dg.t2 t2Var = this.a1;
        if (jVar7 != null) {
            x4 x4Var = this.N0;
            jVar7.j0 = x4Var;
            jVar7.l(x4Var, true);
            dg.j jVar8 = this.G0;
            if (jVar8 instanceof dg.b4) {
                dg.b4 b4Var3 = (dg.b4) jVar8;
                b4Var3.getSwatch().c = f2Var.c;
                b4Var3.w0 = false;
                F0(b4Var3.getSwatch());
                t2Var.setValueOverride(new dg.j0(b4Var3, (int) (this.E0.a / 9.0f), 1));
                t2Var.setShowPreview(false);
            } else {
                t2Var.setValueOverride(cVar);
                t2Var.setShowPreview(true);
                f2Var.c = cVar.get();
                E0(f2Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.Y0;
            if (valueAnimator2 != null && this.W0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.y1) {
                I0(false);
            }
            R0(0);
            t2Var.setValueOverride(cVar);
            t2Var.setShowPreview(true);
            f2Var.c = cVar.get();
            E0(f2Var, null, false);
            z12 = z10;
        }
        U0();
        return z12;
    }

    public final void E0(cg.f2 f2Var, Integer num, boolean z4) {
        cg.f2 f2Var2 = this.x1;
        if (f2Var2 != f2Var) {
            f2Var2.a = f2Var.a;
            f2Var2.b = f2Var.b;
            f2Var2.c = f2Var.c;
            int i10 = this.C1;
            cg.f1.e(i10).h(f2Var.a, true);
            cg.f1.e(i10).j(f2Var.c);
        }
        int i11 = f2Var.a;
        s4 s4Var = this.L0;
        s4Var.setColor(i11);
        s4Var.setBrushSize(f2Var.c);
        int i12 = f2Var2.a;
        if (num == null || num.intValue() == i12) {
            y4 y4Var = this.Q0;
            if (y4Var != null) {
                y4Var.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new dg.t(this, num, i12, 2));
            duration.start();
        }
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            ((dg.b4) jVar).setSwatch(new cg.f2(f2Var.b, f2Var.c, f2Var.a));
            return;
        }
        if (z4 && (jVar instanceof dg.m1)) {
            ((dg.m1) jVar).setColor(f2Var.a);
            ((dg.m1) this.G0).setType(3);
        } else if (z4 && (jVar instanceof dg.c4)) {
            ((dg.c4) jVar).setColor(f2Var.a);
            ((dg.c4) this.G0).setType(3);
        } else if (z4 && (jVar instanceof dg.i1)) {
            ((dg.i1) jVar).setColor(f2Var.a);
            ((dg.i1) this.G0).setType(0);
        }
    }

    public final void F0(cg.f2 f2Var) {
        E0(f2Var, null, false);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        boolean z10;
        if (i10 > AndroidUtilities.dp(50.0f) && this.o2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.t2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.t2).commit();
            } else {
                this.s2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.s2).commit();
            }
        }
        boolean z11 = this.n2;
        j4 j4Var = this.L1;
        if (z11) {
            int paddingUnderContainer = this.J1.getPaddingUnderContainer() + (z4 ? this.t2 : this.s2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = AndroidUtilities.displaySize.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.m2.setLayoutParams(layoutParams);
                this.q2 = layoutParams.height;
                j4Var.a();
                requestLayout();
            }
        }
        if (this.u2 == i10 && this.v2 == z4) {
            return;
        }
        this.u2 = i10;
        this.v2 = z4;
        boolean z12 = this.o2;
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            this.o2 = ((dg.b4) jVar).getEditText().isFocused() && j4Var.c();
        } else {
            this.o2 = false;
        }
        if (this.o2 && this.n2) {
            J0(0);
        }
        if (this.q2 != 0 && !(z10 = this.o2) && z10 != z12 && !this.n2) {
            this.q2 = 0;
            j4Var.a();
            requestLayout();
        }
        U0();
        if (z12 && !this.o2 && this.q2 > 0 && this.r2) {
            this.r2 = false;
        }
        S0();
    }

    public final void H0() {
        int i10;
        Emoji.EmojiSpan[] emojiSpanArr;
        dg.j jVar;
        ArrayList arrayList = this.N1;
        if (arrayList == null) {
            return;
        }
        t6 t6Var = this.M1;
        this.M1 = null;
        this.N1 = null;
        int size = arrayList.size();
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i11 >= size) {
                w4Var.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i11);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                p4 n02 = n0(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    n02.r(z4);
                }
                ViewGroup.LayoutParams layoutParams = n02.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i10 = i11;
                jVar = n02;
            } else if (b10 == 1) {
                dg.b4 o02 = o0(z4);
                o02.setType(mediaEntity.subType);
                o02.setTypeface(mediaEntity.textTypeface);
                o02.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i12);
                    i12++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(emojiEntity2.document_id, 1.0f, o02.getFontMetricsInt());
                    int i13 = emojiEntity2.offset;
                    spannableString.setSpan(u5Var, i13, emojiEntity2.length + i13, 33);
                    i11 = i11;
                }
                i10 = i11;
                CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, o02.getFontMetricsInt(), false);
                if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                o02.setText(replaceEmoji);
                G0(o02, mediaEntity.textAlign);
                cg.f2 swatch = o02.getSwatch();
                swatch.a = mediaEntity.color;
                o02.setSwatch(swatch);
                jVar = o02;
            } else {
                i10 = i11;
                if (b10 == 2) {
                    dg.v2 k02 = k0(mediaEntity.text, false);
                    k02.D0 = mediaEntity.crop;
                    k02.y0 = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        k02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        k02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = k02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    jVar = k02;
                } else if (b10 == 6) {
                    ArrayList arrayList3 = t6Var.v;
                    boolean z10 = t6Var.K;
                    this.i2 = true;
                    dg.j o4Var = new o4(this, getContext(), e0(), arrayList3, this.b2, z10, this.c2);
                    o4Var.setDelegate(this);
                    w4Var.addView(o4Var);
                    g0();
                    jVar = o4Var;
                    if (mediaEntity.viewWidth > 0) {
                        jVar = o4Var;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = o4Var.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            jVar = o4Var;
                        }
                    }
                } else if (b10 == 3) {
                    dg.m1 j02 = j0(mediaEntity.media, mediaEntity.mediaArea);
                    int i14 = mediaEntity.color;
                    if (i14 != 0) {
                        j02.setColor(i14);
                    }
                    j02.setType(mediaEntity.subType);
                    jVar = j02;
                } else if (b10 == 8) {
                    za zaVar = mediaEntity.weather;
                    if (zaVar == null) {
                        i11 = i10 + 1;
                        z4 = false;
                    } else {
                        dg.c4 p02 = p0(zaVar);
                        int i15 = mediaEntity.color;
                        if (i15 != 0) {
                            p02.setColor(i15);
                        }
                        p02.setType(mediaEntity.subType);
                        jVar = p02;
                    }
                } else if (b10 == 7) {
                    dg.i1 i02 = i0(mediaEntity.linkSettings);
                    dg.g1 g1Var = i02.n0;
                    int i16 = mediaEntity.color;
                    if (i16 != 0) {
                        i02.setColor(i16);
                    }
                    boolean e = g1Var.e();
                    int i17 = g1Var.h;
                    int i18 = g1Var.f;
                    if (e) {
                        g1Var.setPreviewType(mediaEntity.subType);
                    }
                    byte b11 = mediaEntity.subType;
                    if (b11 == -1) {
                        i02.setType(3);
                        g1Var.d();
                        mediaEntity.viewWidth = ((int) Math.ceil(g1Var.U)) + i18 + i18;
                        mediaEntity.viewHeight = ((int) Math.ceil(g1Var.V)) + i17 + i17;
                        PointF position = i02.getPosition();
                        position.y = (this.P1 * 0.3f) + position.y;
                        i02.setPosition(position);
                        i11 = i10 + 1;
                        z4 = false;
                    } else {
                        i02.setType(b11);
                        jVar = i02;
                    }
                } else if (b10 == 4) {
                    dg.a3 l02 = l0(false);
                    l02.s(mg.q0.d(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        l02.r(false);
                    }
                    jVar = l02;
                    if (mediaEntity.mediaArea.dark) {
                        l02.q(false);
                        jVar = l02;
                    }
                } else {
                    if (b10 == 5 && t6Var.o0 != null) {
                        dg.b3 m0 = m0(t6Var.p0, false);
                        da daVar = ((h9) this).x2;
                        s9 s9Var = daVar.U0;
                        if (s9Var != null) {
                            s9Var.w = m0;
                            i71 i71Var = s9Var.x;
                            if (i71Var != null) {
                                i71Var.V(m0.r0);
                            }
                        }
                        t9 t9Var = daVar.Z0;
                        if (t9Var != null) {
                            t9Var.setHasRoundVideo(true);
                        }
                        jVar = m0;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z11 = !m0.o0;
                            m0.o0 = z11;
                            m0.p0.f(z11, true);
                            m0.invalidate();
                            jVar = m0;
                        }
                    }
                    i11 = i10 + 1;
                    z4 = false;
                }
            }
            jVar.setX((mediaEntity.x * this.O1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            jVar.setY((mediaEntity.y * this.P1) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            jVar.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + jVar.getX(), (mediaEntity.viewHeight / 2.0f) + jVar.getY()));
            jVar.setScale(mediaEntity.scale);
            jVar.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            i11 = i10 + 1;
            z4 = false;
        }
    }

    public final void I0(final boolean z4) {
        if (this.y1 != z4) {
            this.y1 = z4;
            o1.j jVar = this.z1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new kb.a(z4 ? 0.0f : 1000.0f));
            this.z1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z4 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            int i10 = 0;
            final boolean[] zArr = {this.L1.c() || this.q2 > 0};
            final float translationY = this.Q0.getTranslationY();
            final float alpha = this.y0.getAlpha();
            final ViewGroup barView = getBarView();
            this.z1.b(new o1.g() { // from class: ph.u3
                @Override // o1.g
                public final void a(o1.h hVar, float f10, float f11) {
                    c5 c5Var = c5.this;
                    y4 y4Var = c5Var.Q0;
                    float f12 = f10 / 1000.0f;
                    c5Var.A1 = f12;
                    float f13 = ((1.0f - f12) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f13);
                    view.setScaleY(f13);
                    view.setTranslationY((Math.min(c5Var.A1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(c5Var.A1, 0.25f) / 0.25f));
                    h4 h4Var = c5Var.t1;
                    float f14 = c5Var.A1;
                    boolean z10 = z4;
                    h4Var.x1(f14, z10);
                    dg.f2 f2Var = c5Var.y0;
                    f2Var.setProgress(c5Var.A1);
                    dg.b2 b2Var = c5Var.x0;
                    b2Var.setProgress(c5Var.A1);
                    c5Var.T0.setTranslationY(AndroidUtilities.dp(32.0f) * c5Var.A1);
                    AnimatorSet animatorSet = c5Var.K1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f15 = c5Var.A1;
                        if (!z10) {
                            f15 = 1.0f - f15;
                        }
                        float f16 = z10 ? 1.0f : 0.0f;
                        float f17 = alpha;
                        f2Var.setAlpha(AndroidUtilities.lerp(f17, f16, f15));
                        b2Var.setAlpha(AndroidUtilities.lerp(f17, z10 ? 1.0f : 0.0f, f15));
                        y4Var.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f15) * (z10 ? 1 : -1)));
                    }
                    y4Var.invalidate();
                    if (view == c5Var.i1) {
                        c5Var.R0.invalidate();
                    }
                }
            });
            this.z1.a(new v3(this, z4, i10));
            this.z1.f();
            if (z4) {
                h4 h4Var = this.t1;
                h4Var.setVisibility(0);
                h4Var.setSelectedColorIndex(cg.f1.e(this.C1).d());
            }
        }
    }

    public final void J0(int i10) {
        dg.k2 k2Var = this.i1;
        j4 j4Var = this.L1;
        int i11 = 1;
        if (i10 == 1) {
            kz kzVar = this.m2;
            boolean z4 = kzVar != null && kzVar.getVisibility() == 0;
            kz kzVar2 = this.m2;
            ca caVar = this.J1;
            if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                caVar.removeView(kzVar2);
                this.m2 = null;
            }
            if (this.m2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.D1, false, false);
                this.m2 = kzVar3;
                kzVar3.u2 = false;
                kzVar3.R0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.m2.setForseMultiwindowLayout(true);
                }
                this.m2.setDelegate(new r4(this));
                caVar.addView(this.m2);
            }
            this.m2.setVisibility(0);
            this.n2 = true;
            kz kzVar4 = this.m2;
            if (this.s2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.s2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.s2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.t2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.t2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.t2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = caVar.getPaddingUnderContainer() + (point.x > point.y ? this.t2 : this.s2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                dg.j jVar = this.G0;
                if (jVar instanceof dg.b4) {
                    AndroidUtilities.hideKeyboard(((dg.b4) jVar).getEditText());
                }
            }
            this.q2 = paddingUnderContainer;
            j4Var.a();
            requestLayout();
            qg emojiButton = k2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (!z4) {
                if (this.o2) {
                    this.r2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q2, 0.0f);
                    ofFloat.addUpdateListener(new w3(this, i11));
                    ofFloat.addListener(new k4(this, i11));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                    ofFloat.start();
                }
            }
        } else {
            qg emojiButton2 = k2Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(og.e, true);
            }
            kz kzVar5 = this.m2;
            if (kzVar5 != null) {
                this.n2 = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    kzVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.q2 = 0;
                j4Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(dg.i1 i1Var) {
        c7 c7Var = new c7(getContext(), this.D1, this.d2, new s1(3, this, i1Var));
        if (i1Var != null) {
            dg.f1 f1Var = i1Var.r0;
            c7Var.Z = true;
            org.telegram.ui.Cells.h3 h3Var = c7Var.W;
            org.telegram.ui.Cells.h3 h3Var2 = c7Var.V;
            if (f1Var != null) {
                c7Var.d0 = f1Var.d;
                c7Var.e0 = false;
                h3Var2.setText(f1Var.c);
                h3Var.setText(f1Var.b);
                c7Var.j0 = !TextUtils.isEmpty(f1Var.b);
                c7Var.k0 = f1Var.f;
                c7Var.l0 = f1Var.e;
            } else {
                h3Var2.setText("");
                h3Var.setText("");
                c7Var.k0 = true;
                c7Var.l0 = false;
            }
            String string = LocaleController.getString(R.string.StoryLinkEdit);
            d dVar = c7Var.Y;
            dVar.g(string, false, true);
            y6 y6Var = c7Var.U;
            if (y6Var != null) {
                y6Var.N(false);
            }
            dVar.setEnabled(c7Var.V(h3Var2.getText().toString()));
            c7Var.Z = false;
        }
        c7Var.setOnDismissListener(new e4(this, 1));
        c7Var.show();
        z0(true);
    }

    public final void L0(dg.m1 m1Var, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        li liVar = new li(getContext(), new m4(this, callback2), false, true, false, this.D1);
        liVar.W1 = new n4();
        mh mhVar = liVar.u1;
        if (m1Var != null && (messageMedia = m1Var.r0) != null && (geoPoint = messageMedia.geo) != null) {
            liVar.u2 = new double[]{geoPoint.lat, geoPoint._long};
            liVar.L = true;
            mhVar.setVisibility(8);
        } else if (this.R1) {
            liVar.s2 = this.T1;
            liVar.t2 = this.S1;
            liVar.L = true;
            mhVar.setVisibility(8);
        } else {
            liVar.L = true;
            mhVar.setVisibility(8);
        }
        liVar.setOnDismissListener(new e4(this, 0));
        liVar.r1();
        liVar.show();
    }

    public final void M0(dg.j jVar) {
        if (jVar instanceof dg.a2) {
            org.telegram.ui.ActionBar.p1 p1Var = this.E1;
            if (p1Var == null || !p1Var.isShowing()) {
                return;
            }
            this.E1.d(true);
            return;
        }
        int[] iArr = this.l2;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        w4 w4Var = this.O0;
        float scaleX2 = w4Var.getScaleX() * scaleX;
        float scaleY = w4Var.getScaleY() * jVar.getScaleY() * jVar.getHeight();
        int i10 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i10;
        int i11 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i11;
        N0(new z3(this, jVar, 1), this, 51, i10, i11 - AndroidUtilities.dp(32.0f), true);
    }

    public final void N0(Runnable runnable, c5 c5Var, int i10, int i11, int i12, boolean z4) {
        org.telegram.ui.ActionBar.p1 p1Var = this.E1;
        if (p1Var != null && p1Var.isShowing()) {
            this.E1.d(true);
            return;
        }
        if (this.F1 == null) {
            this.G1 = new Rect();
            b5 b5Var = new b5(this, getContext());
            this.F1 = b5Var;
            b5Var.setAnimationEnabled(true);
            this.F1.setOnTouchListener(new dg.v(this, 1));
            this.F1.setDispatchKeyEventListener(new b4(this));
            this.F1.setShownFromBottom(true);
        }
        b5 b5Var2 = this.F1;
        b5Var2.T = z4;
        b5Var2.d();
        runnable.run();
        if (this.E1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.F1, -2, -2);
            this.E1 = p1Var2;
            p1Var2.b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.E1.setOutsideTouchable(true);
            this.E1.setClippingEnabled(true);
            this.E1.setInputMethodMode(2);
            this.E1.setSoftInputMode(0);
            this.E1.getContentView().setFocusableInTouchMode(true);
            this.E1.setOnDismissListener(new dg.x(this, 1));
        }
        this.F1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
        this.E1.setFocusable(true);
        int measuredWidth = i11 - (this.F1.getMeasuredWidth() / 2);
        int measuredHeight = i12 - this.F1.getMeasuredHeight();
        this.E1.showAtLocation(c5Var, i10, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.p1.i(this.F1);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z4) {
            b5 b5Var3 = this.F1;
            b5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ea(new org.telegram.ui.Components.fa(this.b2, b5Var3, 5, false), measuredWidth, measuredHeight, mutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.F1.setBackgroundDrawable(mutate);
            this.F1.setBackgroundColor(-14145495);
        }
    }

    public final void O0(boolean z4) {
        if (this.Z1 != z4) {
            if (z4 || this.W1 != null) {
                this.Z1 = z4;
                int i10 = 0;
                if (z4) {
                    this.W1.n();
                    this.W1.setVisibility(0);
                    this.W1.setSelectedReaction(this.X1.getCurrentReaction());
                    this.W1.getParent().bringChildToFront(this.W1);
                } else {
                    this.X1 = null;
                }
                if (!z4) {
                    if (this.W1.getReactionsWindow() != null) {
                        this.W1.getReactionsWindow().e();
                    }
                    this.W1.animate().alpha(0.0f).setDuration(150L).setListener(new k4(this, i10)).start();
                    return;
                }
                this.a2 = true;
                this.J1.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y1, z4 ? 1.0f : 0.0f);
                this.W1.setTransitionProgress(this.Y1);
                ofFloat.addUpdateListener(new w3(this, 2));
                ofFloat.addListener(new s61(11, this, z4));
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(mr.g);
                ofFloat.start();
            }
        }
    }

    public final void P0(boolean z4) {
        if (this.r1 != z4) {
            this.r1 = z4;
            o1.j jVar = this.s1;
            if (jVar != null) {
                jVar.c();
            }
            o1.j jVar2 = new o1.j(new kb.a(z4 ? 0.0f : 1000.0f));
            this.s1 = jVar2;
            o1.k kVar = new o1.k();
            kVar.i = z4 ? 1000.0f : 0.0f;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.u = kVar;
            if (z4) {
                dg.q2 q2Var = this.j1;
                q2Var.setAlpha(0.0f);
                q2Var.setVisibility(0);
            }
            this.s1.b(new dg.y(2, this));
            this.s1.a(new v3(this, z4, 1));
            this.s1.f();
        }
    }

    public final PointF Q0(dg.j jVar) {
        float f10;
        MediaController.CropState cropState = this.C0;
        float f11 = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f12 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF e02 = e0();
        int i10 = 0;
        while (i10 < 10) {
            int i11 = 0;
            boolean z4 = false;
            while (true) {
                w4 w4Var = this.O0;
                if (i11 >= w4Var.getChildCount()) {
                    break;
                }
                View childAt = w4Var.getChildAt(i11);
                if (!(childAt instanceof dg.j) || (childAt instanceof dg.a2)) {
                    f10 = f12;
                } else {
                    PointF position2 = ((dg.j) childAt).getPosition();
                    f10 = f12;
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        f11 = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z4 = true;
                    }
                }
                i11++;
                f12 = f10;
            }
            float f13 = f12;
            if (!z4) {
                break;
            }
            i10++;
            e02 = new PointF(e02.x + f11, e02.y + f11);
            f12 = f13;
        }
        return e02;
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0
    public final int R() {
        return this.L1.l - this.J1.getBottomPadding2();
    }

    public final void R0(int i10) {
        if (this.V0 == i10 || this.W0 == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i11 = this.V0;
        ViewGroup viewGroup = this.i1;
        ViewGroup viewGroup2 = this.h1;
        int i12 = 2;
        ViewGroup viewGroup3 = i11 == 0 ? viewGroup2 : i11 == 2 ? viewGroup : null;
        this.W0 = i10;
        ViewGroup viewGroup4 = i10 == 0 ? viewGroup2 : i10 == 2 ? viewGroup : null;
        int i13 = this.C1;
        cg.f1 e = cg.f1.e(i13);
        boolean z4 = i10 == 2;
        if (e.l != z4) {
            e.l = z4;
            if (z4) {
                e.i(-1, false);
            } else {
                e.i(e.a.getInt("brush", 0), false);
            }
        }
        int c3 = cg.f1.e(i13).c();
        cg.f2 f2Var = this.x1;
        f2Var.a = c3;
        E0(f2Var, null, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.Y0 = duration;
        duration.setInterpolator(mr.f);
        this.Y0.addUpdateListener(new dg.r(this, viewGroup3, viewGroup4, i12));
        this.Y0.addListener(new dg.l0(this, viewGroup3, viewGroup4, i10, 2));
        this.Y0.start();
    }

    public final void S0() {
        j4 j4Var = this.L1;
        dg.k2 k2Var = this.i1;
        if (k2Var != null) {
            if (j4Var.c()) {
                k2Var.a(R.drawable.input_smile);
            } else if (this.n2) {
                k2Var.a(R.drawable.input_keyboard);
            } else {
                k2Var.a(R.drawable.msg_add);
            }
        }
        boolean z4 = j4Var.c() || this.n2;
        boolean z10 = !z4;
        AndroidUtilities.updateViewShow(this.l1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.k1, z10, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.n1, z4, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.m1, z4, false, 1.0f, true, null);
    }

    public final void T0() {
        dg.j jVar;
        ObjectAnimator objectAnimator = this.f2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.L0.getParent();
        if (view == null) {
            return;
        }
        j4 j4Var = this.L1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!j4Var.c() || j4Var.d) && this.q2 <= 0) || (jVar = this.G0) == null) ? 0.0f : view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.f2 = ofFloat;
        ofFloat.setDuration(350L);
        this.f2.setInterpolator(mr.h);
        this.f2.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        boolean z4;
        if (this.G0 instanceof dg.b4) {
            j4 j4Var = this.L1;
            if ((j4Var.c() || this.q2 > 0) && !j4Var.d) {
                z4 = true;
                View view = this.U0;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(!z4 ? 1.0f : 0.0f).withEndAction(new kv0(13, this, z4)).start();
            }
        }
        z4 = false;
        View view2 = this.U0;
        view2.animate().cancel();
        view2.setVisibility(0);
        view2.animate().alpha(!z4 ? 1.0f : 0.0f).withEndAction(new kv0(13, this, z4)).start();
    }

    @Override // dg.n2, dg.i2
    public final void a() {
        I0(true);
    }

    @Override // dg.h
    public final void b(dg.j jVar) {
        O0(false);
        M0(jVar);
    }

    @Override // dg.i2
    public final void d() {
        setTextType((this.I0 + 1) % 4);
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new sg1(21, this, view)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        if ((view == this.L0 || view == this.M0 || view == this.O0 || view == this.N0) && (cropState = this.C0) != null) {
            canvas.save();
            r1 = this.K0 ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = cropState.transformRotation;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r1 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qv0, org.telegram.ui.ActionBar.a6
    public final void e() {
        this.B1.setColor(-15132391);
    }

    public final PointF e0() {
        w4 w4Var = this.O0;
        int measuredWidth = w4Var.getMeasuredWidth();
        int measuredHeight = w4Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.O1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.P1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override // dg.i2
    public final void f(int i10) {
        dg.j jVar = this.G0;
        if (jVar instanceof dg.b4) {
            G0((dg.b4) jVar, i10);
            cg.f1 e = cg.f1.e(this.C1);
            e.g = i10;
            e.a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public abstract boolean f0(dw dwVar);

    public final void g0() {
        boolean z4 = this.T1;
        w4 w4Var = this.O0;
        boolean z10 = true;
        if (!z4 && !this.V1) {
            int i10 = 0;
            loop0: while (true) {
                if (i10 >= w4Var.getChildCount()) {
                    z10 = false;
                    break;
                }
                View childAt = w4Var.getChildAt(i10);
                boolean z11 = childAt instanceof dg.b4;
                int i11 = this.C1;
                if (z11) {
                    CharSequence text = ((dg.b4) childAt).getText();
                    if (text instanceof Spanned) {
                        for (org.telegram.ui.Components.u5 u5Var : (org.telegram.ui.Components.u5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.u5.class)) {
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.l5.f(i11, u5Var.getDocumentId());
                            }
                            if (document != null) {
                                org.telegram.ui.Components.l5.h(i11).e(document);
                            }
                            if (t6.u(document, FileLoader.getInstance(i11).getPathToAttach(document, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i10++;
                } else if (childAt instanceof dg.r3) {
                    TLRPC.Document sticker = ((dg.r3) childAt).getSticker();
                    if (t6.u(sticker, FileLoader.getInstance(i11).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i10++;
                    }
                } else if (childAt instanceof dg.b3) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        for (int i12 = 0; i12 < w4Var.getChildCount(); i12++) {
            View childAt2 = w4Var.getChildAt(i12);
            if (childAt2 instanceof dg.j) {
                ((dg.j) childAt2).setIsVideo(z10);
            }
        }
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.L0.c(true, false);
    }

    public View getBottomLayout() {
        return this.Q0;
    }

    public View getCancelView() {
        return this.x0;
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.y0;
    }

    public View getEntitiesView() {
        return this.O0;
    }

    public long getLcm() {
        return this.d1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.u5[] u5VarArr;
        w4 w4Var = this.O0;
        int childCount = w4Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.r3) {
                TLRPC.Document sticker = ((dg.r3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof dg.b4) {
                CharSequence text = ((dg.b4) childAt).getText();
                if ((text instanceof Spanned) && (u5VarArr = (org.telegram.ui.Components.u5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.u5.class)) != null) {
                    for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
                        if (u5Var != null) {
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.l5.f(this.C1, u5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.L0, this.M0, this.O0, this.N0);
    }

    public View getRenderInputView() {
        return this.M0;
    }

    public cg.p1 getRenderView() {
        return this.L0;
    }

    public dg.j getSelectedEntity() {
        return this.G0;
    }

    public View getSelectionEntitiesView() {
        return this.N0;
    }

    public View getTextDimView() {
        return this.U0;
    }

    public View getTopLayout() {
        return this.P0;
    }

    public View getWeightChooserView() {
        return this.a1;
    }

    public final TextView h0(int i10, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, this.D1));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(str);
        return textView;
    }

    public final dg.i1 i0(dg.f1 f1Var) {
        int i10;
        this.i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        float measuredWidth = w4Var.getMeasuredWidth() <= 0 ? this.O1 : w4Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        dg.i1 i1Var = new dg.i1(getContext(), Q0, this.C1, f1Var, measuredWidth / 360.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            i1Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            i1Var.setStickyY(2);
        }
        cg.f2 f2Var = this.x1;
        if (f2Var != null && (i10 = f2Var.a) != -47814) {
            i1Var.setColor(i10);
        }
        i1Var.setDelegate(this);
        i1Var.setMaxWidth(dp);
        w4Var.addView(i1Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            i1Var.j(1.0f / cropState.cropScale);
            i1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return i1Var;
    }

    public final dg.m1 j0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i10;
        this.i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        float measuredWidth = w4Var.getMeasuredWidth() <= 0 ? this.O1 : w4Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        dg.m1 m1Var = new dg.m1(getContext(), Q0, this.C1, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            m1Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            m1Var.setStickyY(2);
        }
        cg.f2 f2Var = this.x1;
        if (f2Var != null && (i10 = f2Var.a) != -47814) {
            m1Var.setColor(i10);
        }
        m1Var.setDelegate(this);
        m1Var.setMaxWidth(dp);
        w4Var.addView(m1Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            m1Var.j(1.0f / cropState.cropScale);
            m1Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return m1Var;
    }

    public final dg.v2 k0(String str, boolean z4) {
        float f10;
        jv0 jv0Var;
        this.i2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f10 = 1.0f;
        }
        w4 w4Var = this.O0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(Math.max(this.O1, w4Var.getMeasuredWidth()) * 0.5d);
            jv0Var = new jv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.P1, w4Var.getMeasuredHeight()) * 0.5d);
            jv0Var = new jv0(f10 * floor2, floor2);
        }
        jv0 jv0Var2 = jv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = jv0Var2.a;
            jv0Var2.a = jv0Var2.b;
            jv0Var2.b = f11;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        dg.v2 v2Var = new dg.v2(context, e02, jv0Var2, str, intValue);
        v2Var.setDelegate(this);
        w4Var.addView(v2Var);
        g0();
        return v2Var;
    }

    @Override // ph.z9
    public final boolean l(MotionEvent motionEvent) {
        if (this.j2) {
            return false;
        }
        if (this.G0 != null) {
            D0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.L0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final dg.a3 l0(boolean z4) {
        String str;
        jv0 jv0Var = new jv0(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF e02 = e0();
        w4 w4Var = this.O0;
        if (w4Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i10 = 0; i10 < w4Var.getChildCount(); i10++) {
                    View childAt = w4Var.getChildAt(i10);
                    if (k7.n6.a(e02.x, e02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                e02.x = (w4Var.getMeasuredWidth() * 0.05f) + e02.x;
                e02.y = (w4Var.getMeasuredHeight() * 0.05f) + e02.y;
                e02.x = Utilities.clamp(e02.x, w4Var.getMeasuredWidth(), 0.0f);
                e02.y = Utilities.clamp(e02.y, w4Var.getMeasuredHeight(), 0.0f);
            }
        }
        dg.a3 a3Var = new dg.a3(getContext(), e02);
        a3Var.o0 = new nh.o8(a3Var);
        a3Var.p0 = new nh.o8(a3Var);
        a3Var.q0 = new mg.h0(a3Var);
        a3Var.r0 = new mg.h0(a3Var);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(a3Var);
        a3Var.t0 = z5Var;
        org.telegram.ui.Components.z5 z5Var2 = new org.telegram.ui.Components.z5(a3Var);
        a3Var.u0 = z5Var2;
        a3Var.w0 = 1.0f;
        a3Var.n0 = jv0Var;
        z5Var2.d(1.0f, true);
        z5Var.d(1.0f, true);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsList();
        mg.h0 h0Var = a3Var.q0;
        int i11 = 0;
        while (true) {
            if (i11 >= reactionsList.size()) {
                str = reactionsList.get(0).reaction;
                break;
            }
            if (reactionsList.get(i11).title.equals("Red Heart")) {
                str = reactionsList.get(i11).reaction;
                break;
            }
            i11++;
        }
        mg.q0 b10 = mg.q0.b(str);
        a3Var.s0 = b10;
        h0Var.e(b10);
        a3Var.k();
        a3Var.setDelegate(this);
        w4Var.addView(a3Var);
        g0();
        if (z4) {
            B0(a3Var);
            D0(a3Var, true);
        }
        return a3Var;
    }

    public final dg.b3 m0(String str, boolean z4) {
        this.i2 = true;
        this.k2 = true;
        q0();
        w4 w4Var = this.O0;
        int measuredWidth = w4Var.getMeasuredWidth();
        w4Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.O1;
        }
        float floor = (float) Math.floor(0.43f * r1);
        jv0 jv0Var = new jv0(floor, floor);
        dg.b3 b3Var = new dg.b3(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - AndroidUtilities.dp(16.0f), (jv0Var.b / 2.0f) + AndroidUtilities.dp(72.0f)), jv0Var, str);
        b3Var.setDelegate(this);
        w4Var.addView(b3Var);
        g0();
        if (z4) {
            B0(b3Var);
            post(new s3(this, b3Var, 0));
        }
        this.k2 = false;
        return b3Var;
    }

    public final p4 n0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i10 = 0; i10 < document.attributes.size() && !(document.attributes.get(i10) instanceof TLRPC.TL_documentAttributeSticker); i10++) {
        }
        float f11 = 0.75f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 = -(cropState.transformRotation + cropState.cropRotate);
            f11 = 0.75f / cropState.cropScale;
        } else {
            f10 = 0.0f;
        }
        dg.d1 d1Var = new dg.d1(e0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        p4 p4Var = new p4(this, context, d1Var.a, d1Var.c, d1Var.b, new jv0(floor, floor), document, obj);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = p4Var.u0;
        if (isTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        p4Var.setDelegate(this);
        this.O0.addView(p4Var);
        g0();
        return p4Var;
    }

    public final dg.b4 o0(boolean z4) {
        jv0 paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        dg.b4 b4Var = new dg.b4(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.x1, this.I0);
        float f10 = paintingSize.a / 9.0f;
        a4 a4Var = new a4(this, 0);
        b4Var.t0 = (int) (0.5f * f10);
        b4Var.u0 = (int) (f10 * 2.0f);
        b4Var.v0 = a4Var;
        float f11 = Q0.x;
        w4 w4Var = this.O0;
        if (f11 == w4Var.getMeasuredWidth() / 2.0f) {
            b4Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            b4Var.setStickyY(2);
        }
        b4Var.setDelegate(this);
        b4Var.setMaxWidth(this.O1 - AndroidUtilities.dp(32.0f));
        int i10 = this.C1;
        b4Var.setTypeface(cg.f1.e(i10).j);
        b4Var.setType(cg.f1.e(i10).h);
        w4Var.addView(b4Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            b4Var.j(1.0f / cropState.cropScale);
            b4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            B0(b4Var);
            b4Var.q();
            D0(b4Var, false);
            b4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(b4Var.getFocusedView());
            this.H0 = true;
            int i11 = cg.f1.e(i10).g;
            dg.k2 k2Var = this.i1;
            k2Var.d(i11, true);
            k2Var.setOutlineType(cg.f1.e(i10).h);
        }
        return b4Var;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        pk0 pk0Var = this.W1;
        if (pk0Var != null) {
            AndroidUtilities.removeFromParent(pk0Var);
            this.W1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f10;
        this.D0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.z0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((r3 * f10) / currentActionBarHeight);
        }
        float f11 = this.E0.a;
        dg.j jVar = this.G0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.Q0, i10, i11);
        measureChild(this.a1, i10, i11);
        measureChild(this.S0, i10, i11);
        measureChild(this.R0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.q2 - this.J1.getPaddingUnderContainer(), R()), TLObject.FLAG_30));
        FrameLayout frameLayout = this.P0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.D0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.n2 && !this.p2) {
            this.D0 = true;
            w0();
            this.D0 = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        w0();
    }

    @Override // dg.h
    public final boolean p() {
        return !(this.G0 instanceof dg.a2);
    }

    public final dg.c4 p0(za zaVar) {
        int i10;
        this.i2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        w4 w4Var = this.O0;
        float measuredWidth = w4Var.getMeasuredWidth() <= 0 ? this.O1 : w4Var.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        dg.c4 c4Var = new dg.c4(getContext(), Q0, this.C1, zaVar, measuredWidth / 240.0f, dp);
        if (Q0.x == w4Var.getMeasuredWidth() / 2.0f) {
            c4Var.setStickyX(2);
        }
        if (Q0.y == w4Var.getMeasuredHeight() / 2.0f) {
            c4Var.setStickyY(2);
        }
        cg.f2 f2Var = this.x1;
        if (f2Var != null && (i10 = f2Var.a) != -47814) {
            c4Var.setColor(i10);
        }
        c4Var.setDelegate(this);
        c4Var.setMaxWidth(dp);
        w4Var.addView(c4Var, k7.b6.c(-2.0f, -2));
        g0();
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            c4Var.j(1.0f / cropState.cropScale);
            c4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        return c4Var;
    }

    @Override // dg.h
    public final boolean q() {
        return !this.H0;
    }

    public final void q0() {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 >= w4Var.getChildCount()) {
                return;
            }
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.b3) {
                if (this.G0 == childAt) {
                    D0(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(mr.h).withEndAction(new s3(this, (dg.b3) childAt, 1)).start();
            }
            i10++;
        }
    }

    @Override // dg.h
    public final int[] r(dg.j jVar) {
        int i10 = (int) jVar.getPosition().x;
        int[] iArr = this.l2;
        iArr[0] = i10;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public abstract void r0();

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D0) {
            return;
        }
        super.requestLayout();
    }

    public final dg.a2 s0() {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 >= w4Var.getChildCount()) {
                return null;
            }
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.a2) {
                return (dg.a2) childAt;
            }
            i10++;
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ba baVar) {
        this.b2 = baVar;
    }

    public void setCoverPreview(boolean z4) {
        if (this.j2 != z4) {
            this.j2 = z4;
            if (z4) {
                D0(null, true);
            }
            setCoverPause(z4);
        }
    }

    public void setCoverTime(long j10) {
        int i10 = 0;
        while (true) {
            w4 w4Var = this.O0;
            if (i10 >= w4Var.getChildCount()) {
                return;
            }
            View childAt = w4Var.getChildAt(i10);
            if (childAt instanceof dg.r3) {
                ImageReceiver imageReceiver = ((dg.r3) childAt).u0;
                gj0 lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.L(Math.round(((j10 % lottieAnimation.p()) / lottieAnimation.p()) * lottieAnimation.e[0]), true, false);
                }
            }
            i10++;
        }
    }

    public void setHasAudio(boolean z4) {
        if (z4 != this.V1) {
            this.V1 = z4;
            g0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.I1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.H1 = runnable;
    }

    @Override // dg.i2
    public final void t() {
        if (!this.o2 && !this.n2) {
            this.i2 = true;
            o0(true);
            return;
        }
        if (this.n2) {
            dg.j jVar = this.G0;
            if (jVar instanceof dg.b4) {
                this.L1.e = true;
                AndroidUtilities.showKeyboard(((dg.b4) jVar).getEditText());
            }
        }
        J0(!this.n2 ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap t0(ArrayList arrayList, boolean z4, boolean z10, boolean z11, boolean z12, t6 t6Var) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i10;
        int i11;
        w4 w4Var;
        int i12;
        int i13;
        View view;
        boolean z13;
        boolean z14;
        ImageReceiver imageReceiver;
        Canvas canvas;
        View view2;
        int i14;
        dg.a2 a2Var;
        dg.s1 s1Var;
        boolean z15;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z16;
        TLRPC.Message message;
        org.telegram.ui.Cells.v0 v0Var;
        lh.i5 i5Var;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        float scaleX;
        boolean z17;
        boolean z18;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        dg.b4 b4Var;
        boolean z19;
        c5 c5Var = this;
        s4 s4Var = c5Var.L0;
        int i15 = 0;
        byte b10 = 1;
        w4 w4Var2 = c5Var.O0;
        if (z4) {
            createBitmap = s4Var.c(false, z12);
        } else if (z11) {
            createBitmap = Bitmap.createBitmap(Math.max(1, w4Var2.getMeasuredWidth()), Math.max(1, w4Var2.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z10) {
                bitmap = null;
                c5Var.d1 = BigInteger.ONE;
                i11 = 0;
                for (i10 = 0; i10 < w4Var2.getChildCount(); i10++) {
                    if (w4Var2.getChildAt(i10) instanceof dg.j) {
                        i11++;
                    }
                }
                if (i11 > 0) {
                    int childCount = w4Var2.getChildCount();
                    int i16 = 0;
                    while (i16 < childCount) {
                        View childAt = w4Var2.getChildAt(i16);
                        if (childAt instanceof dg.j) {
                            dg.j jVar = (dg.j) childAt;
                            jVar.getPosition();
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != null) {
                                boolean z20 = jVar instanceof dg.b4;
                                int i17 = c5Var.C1;
                                if (z20) {
                                    mediaEntity.type = b10;
                                    dg.b4 b4Var2 = (dg.b4) jVar;
                                    CharSequence text = b4Var2.getText();
                                    if (text instanceof Spanned) {
                                        Spanned spanned = (Spanned) text;
                                        b4Var = b4Var2;
                                        org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(i15, text.length(), org.telegram.ui.Components.u5.class);
                                        if (u5VarArr != null) {
                                            int i18 = 0;
                                            while (i18 < u5VarArr.length) {
                                                org.telegram.ui.Components.u5 u5Var = u5VarArr[i18];
                                                org.telegram.ui.Components.u5[] u5VarArr2 = u5VarArr;
                                                TLRPC.Document document = u5Var.document;
                                                int i19 = i18;
                                                w4 w4Var3 = w4Var2;
                                                if (document == null) {
                                                    document = org.telegram.ui.Components.l5.f(i17, u5Var.getDocumentId());
                                                }
                                                if (document != null) {
                                                    org.telegram.ui.Components.l5.h(i17).e(document);
                                                }
                                                VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                                int i20 = childCount;
                                                int i21 = i16;
                                                emojiEntity.document_id = u5Var.getDocumentId();
                                                emojiEntity.document = document;
                                                emojiEntity.offset = spanned.getSpanStart(u5Var);
                                                emojiEntity.length = spanned.getSpanEnd(u5Var) - emojiEntity.offset;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(document, true).getAbsolutePath();
                                                int i22 = 0;
                                                while (document != null) {
                                                    ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                                                    if (arrayList2 == null || arrayList2.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                        break;
                                                    }
                                                    FileLoader fileLoader = FileLoader.getInstance(i17);
                                                    TLRPC.PhotoSize photoSize = document.thumbs.get(i22);
                                                    int i23 = i22;
                                                    z19 = true;
                                                    emojiEntity.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                    int i24 = i23 + 1;
                                                    if (i24 >= document.thumbs.size()) {
                                                        break;
                                                    }
                                                    i22 = i24;
                                                }
                                                z19 = true;
                                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z19);
                                                if (isAnimatedStickerDocument || x0(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                    emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity);
                                                if (document != null) {
                                                    BigInteger valueOf = BigInteger.valueOf(5000L);
                                                    c5Var.d1 = c5Var.d1.multiply(valueOf).divide(c5Var.d1.gcd(valueOf));
                                                }
                                                i18 = i19 + 1;
                                                childCount = i20;
                                                u5VarArr = u5VarArr2;
                                                w4Var2 = w4Var3;
                                                i16 = i21;
                                            }
                                        }
                                    } else {
                                        b4Var = b4Var2;
                                    }
                                    w4Var = w4Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) b4Var.getType();
                                    mediaEntity.color = b4Var.getSwatch().a;
                                    mediaEntity.fontSize = b4Var.getTextSize();
                                    mediaEntity.textTypeface = b4Var.getTypeface();
                                    mediaEntity.textAlign = b4Var.getAlign();
                                } else {
                                    w4Var = w4Var2;
                                    i14 = childCount;
                                    i13 = i16;
                                    if (jVar instanceof dg.r3) {
                                        mediaEntity.type = (byte) 0;
                                        dg.r3 r3Var = (dg.r3) jVar;
                                        jv0 baseSize = r3Var.getBaseSize();
                                        mediaEntity.width = baseSize.a;
                                        mediaEntity.height = baseSize.b;
                                        mediaEntity.document = r3Var.getSticker();
                                        mediaEntity.parentObject = r3Var.getParentObject();
                                        TLRPC.Document sticker = r3Var.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || x0(sticker)) {
                                            boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                            r20 = (isAnimatedStickerDocument2 || x0(sticker)) ? r3Var.getDuration() : 5000L;
                                            if (r20 != 0) {
                                                BigInteger valueOf2 = BigInteger.valueOf(r20);
                                                c5Var.d1 = c5Var.d1.multiply(valueOf2).divide(c5Var.d1.gcd(valueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (r3Var.q0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof dg.v2) {
                                        dg.v2 v2Var = (dg.v2) jVar;
                                        mediaEntity.type = (byte) 2;
                                        jv0 baseSize2 = v2Var.getBaseSize();
                                        mediaEntity.width = baseSize2.a;
                                        mediaEntity.height = baseSize2.b;
                                        mediaEntity.text = v2Var.q(i17);
                                        mediaEntity.crop = v2Var.D0;
                                        if (v2Var.q0) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (jVar instanceof dg.m1) {
                                        dg.m1 m1Var = (dg.m1) jVar;
                                        dg.l1 l1Var = m1Var.n0;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) m1Var.getType();
                                        mediaEntity.width = l1Var.getWidth();
                                        mediaEntity.height = l1Var.getHeight();
                                        mediaEntity.text = l1Var.getText();
                                        mediaEntity.color = m1Var.o0 ? m1Var.getColor() : 0;
                                        mediaEntity.density = l1Var.y;
                                        mediaEntity.media = m1Var.r0;
                                        TL_stories.MediaArea mediaArea2 = m1Var.s0;
                                        mediaEntity.mediaArea = mediaArea2;
                                        mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument = l1Var.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument.id;
                                            emojiEntity2.document = codeEmojiDocument;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (isAnimatedStickerDocument3 || x0(emojiEntity2.document)) {
                                                emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (jVar instanceof dg.c4) {
                                        dg.c4 c4Var = (dg.c4) jVar;
                                        dg.l1 l1Var2 = c4Var.n0;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) c4Var.getType();
                                        mediaEntity.width = l1Var2.getWidth();
                                        mediaEntity.height = l1Var2.getHeight();
                                        mediaEntity.text = l1Var2.getText();
                                        mediaEntity.color = c4Var.o0 ? c4Var.getColor() : 0;
                                        mediaEntity.density = l1Var2.y;
                                        mediaEntity.weather = c4Var.r0;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = c4Var.r0.c;
                                        tL_mediaAreaWeather.temperature_c = Math.round(r4.d);
                                        tL_mediaAreaWeather.color = l1Var2.f.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        TLRPC.Document codeEmojiDocument2 = l1Var2.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            VideoEditedInfo.EmojiEntity emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity3.document_id = codeEmojiDocument2.id;
                                            emojiEntity3.document = codeEmojiDocument2;
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i17).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                            if (isAnimatedStickerDocument4 || x0(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                        }
                                        i12 = i14;
                                        view = childAt;
                                        z15 = false;
                                        z16 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = view.getScaleX();
                                        float scaleY = view.getScaleY();
                                        float x10 = view.getX();
                                        float y10 = view.getY();
                                        mediaEntity.viewWidth = view.getWidth();
                                        mediaEntity.viewHeight = view.getHeight();
                                        mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY) / w4Var.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10) / w4Var.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * view.getHeight()) / 2.0f) + y10) / w4Var.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10) / w4Var.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y10) / w4Var.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (jVar instanceof dg.a2) {
                                            z17 = z15;
                                            if (jVar instanceof dg.r3) {
                                                float imageAspectRatio = ((dg.r3) jVar).u0.getImageAspectRatio();
                                                float f10 = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                float f11 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                float measuredWidth = w4Var.getMeasuredWidth() / w4Var.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f12 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f12;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f11 - (f12 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f13 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f13;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f10 - (f13 / 2.0f);
                                                }
                                            } else {
                                                TL_stories.MediaArea mediaArea3 = mediaEntity.mediaArea;
                                                if (mediaArea3 != null && (((z18 = jVar instanceof dg.m1)) || (jVar instanceof dg.c4) || (jVar instanceof dg.i1) || (jVar instanceof dg.a3))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                    float f14 = mediaEntity.x;
                                                    float f15 = mediaEntity.width;
                                                    mediaAreaCoordinates2.x = ((f15 / 2.0f) + f14) * 100.0f;
                                                    mediaAreaCoordinates2.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z18) {
                                                        dg.l1 l1Var3 = ((dg.m1) jVar).n0;
                                                        mediaAreaCoordinates2.w = org.telegram.ui.b.c(l1Var3.F * 2 * scaleX, w4Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = org.telegram.ui.b.c(l1Var3.G * 2 * scaleY, w4Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof dg.c4) {
                                                        dg.l1 l1Var4 = ((dg.c4) jVar).n0;
                                                        mediaAreaCoordinates2.w = org.telegram.ui.b.c(l1Var4.F * 2 * scaleX, w4Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = org.telegram.ui.b.c(l1Var4.G * 2 * scaleY, w4Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof dg.i1) {
                                                        dg.g1 g1Var = ((dg.i1) jVar).n0;
                                                        mediaAreaCoordinates2.w = org.telegram.ui.b.c(g1Var.f * 2 * scaleX, w4Var.getMeasuredWidth(), f15, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = org.telegram.ui.b.c(g1Var.h * 2 * scaleY, w4Var.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (jVar instanceof dg.a3) {
                                                        dg.a3 a3Var = (dg.a3) jVar;
                                                        float padding = ((a3Var.getPadding() * 2) * scaleX) / w4Var.getMeasuredWidth();
                                                        float padding2 = ((a3Var.getPadding() * 2) * scaleX) / w4Var.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                    if (z18) {
                                                        radius = ((dg.m1) jVar).n0.getRadius();
                                                    } else if (jVar instanceof dg.c4) {
                                                        radius = ((dg.c4) jVar).n0.getRadius();
                                                    } else if (jVar instanceof dg.i1) {
                                                        radius = ((dg.i1) jVar).n0.getRadius();
                                                    }
                                                    d = radius;
                                                }
                                            }
                                            d = -1.0d;
                                        } else {
                                            dg.a2 a2Var2 = (dg.a2) jVar;
                                            dg.t1 t1Var = a2Var2.o0;
                                            dg.s1 s1Var2 = a2Var2.n0;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            z17 = z15;
                                            double r10 = a2Var2.r(rectF);
                                            rectF.offset(s1Var2.getX(), s1Var2.getY());
                                            rectF.offset(t1Var.getX(), t1Var.getY());
                                            mediaEntity.mediaArea.coordinates.x = (((rectF.centerX() * scaleX) + org.telegram.messenger.y3.A(view.getWidth(), 2.0f, scaleX, (view.getWidth() / 2.0f) + x10)) / w4Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + org.telegram.messenger.y3.A(view.getHeight(), 2.0f, scaleY, (view.getHeight() / 2.0f) + y10)) / w4Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / w4Var.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / w4Var.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                            d = r10;
                                        }
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                        }
                                        z13 = z16;
                                        z14 = z17;
                                    } else {
                                        if (jVar instanceof dg.i1) {
                                            dg.i1 i1Var = (dg.i1) jVar;
                                            dg.g1 g1Var2 = i1Var.n0;
                                            mediaEntity.type = (byte) 7;
                                            if (g1Var2.e()) {
                                                mediaEntity.subType = (byte) g1Var2.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) i1Var.getType();
                                            }
                                            mediaEntity.width = g1Var2.getWidth();
                                            mediaEntity.height = g1Var2.getHeight();
                                            mediaEntity.color = i1Var.q0 ? i1Var.getColor() : 0;
                                            mediaEntity.density = g1Var2.e;
                                            mediaEntity.linkSettings = i1Var.r0;
                                            boolean z21 = g1Var2.O;
                                            if (z21) {
                                                ImageReceiver imageReceiver5 = g1Var2.Q;
                                                if (z21 && imageReceiver5.hasImageLoaded() && imageReceiver5.getBitmap() != null) {
                                                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(imageReceiver5.getBitmap()), imageReceiver5.getImageKey(), false);
                                                }
                                                dg.f1 f1Var = mediaEntity.linkSettings;
                                                f1Var.a |= 4;
                                                f1Var.i = g1Var2.getPhotoSide();
                                            }
                                            TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            dg.f1 f1Var2 = i1Var.r0;
                                            if (f1Var2 != null) {
                                                TLRPC.WebPage webPage = f1Var2.d;
                                                tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? i1Var.r0.c : i1Var.r0.d.url;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (jVar instanceof dg.a3) {
                                                dg.a3 a3Var2 = (dg.a3) jVar;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                mg.q0 currentReaction = a3Var2.getCurrentReaction();
                                                if (currentReaction.f != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.f;
                                                    tL_reactionCustomEmoji = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji2.document_id = currentReaction.g;
                                                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = tL_reactionCustomEmoji;
                                                TL_stories.MediaArea mediaArea4 = mediaEntity.mediaArea;
                                                mediaArea4.dark = a3Var2.o0.a == 1;
                                                mediaArea4.flipped = a3Var2.v0;
                                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else if (jVar instanceof dg.b3) {
                                                dg.b3 b3Var = (dg.b3) jVar;
                                                jv0 baseSize3 = b3Var.getBaseSize();
                                                mediaEntity.width = baseSize3.a;
                                                mediaEntity.height = baseSize3.b;
                                                mediaEntity.type = (byte) 5;
                                                if (t6Var != null) {
                                                    mediaEntity.text = t6Var.o0.getAbsolutePath();
                                                    mediaEntity.roundOffset = t6Var.r0;
                                                    long j10 = t6Var.q0;
                                                    mediaEntity.roundDuration = j10;
                                                    float f16 = j10;
                                                    mediaEntity.roundLeft = (long) (t6Var.s0 * f16);
                                                    mediaEntity.roundRight = (long) (t6Var.t0 * f16);
                                                }
                                                mediaEntity.subType = (byte) 4;
                                                if (b3Var.o0) {
                                                    mediaEntity.subType = (byte) (4 | 2);
                                                }
                                            } else if (jVar instanceof dg.a2) {
                                                dg.a2 a2Var3 = (dg.a2) jVar;
                                                dg.s1 s1Var3 = a2Var3.n0;
                                                ArrayList arrayList3 = a2Var3.p0;
                                                dg.t1 t1Var2 = a2Var3.o0;
                                                mediaEntity.type = (byte) 6;
                                                int width = a2Var3.getWidth();
                                                mediaEntity.viewWidth = width;
                                                mediaEntity.width = width;
                                                int height = a2Var3.getHeight();
                                                mediaEntity.viewHeight = height;
                                                mediaEntity.height = height;
                                                MessageObject messageObject = arrayList3.size() > 0 ? (MessageObject) arrayList3.get(0) : null;
                                                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                                    TLRPC.MessageAction messageAction = message.action;
                                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                        TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                        mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                        tL_mediaAreaStarGift.slug = starGift.slug;
                                                        tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        int i25 = 0;
                                                        while (true) {
                                                            if (i25 >= t1Var2.getChildCount()) {
                                                                v0Var = null;
                                                                break;
                                                            }
                                                            View childAt2 = t1Var2.getChildAt(i25);
                                                            if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                                                v0Var = (org.telegram.ui.Cells.v0) childAt2;
                                                                break;
                                                            }
                                                            i25++;
                                                        }
                                                        if (v0Var == null || (i5Var = v0Var.C0) == null || (imageReceiver3 = i5Var.d) == null) {
                                                            a2Var = a2Var3;
                                                            i12 = i14;
                                                            s1Var = s1Var3;
                                                            view = childAt;
                                                            imageReceiver = null;
                                                            if (z11) {
                                                                if (t6Var != null) {
                                                                    Matrix matrix = t6Var.n0;
                                                                    if (t6Var.K) {
                                                                        matrix.reset();
                                                                        if (t1Var2.getChildCount() == 1) {
                                                                            view3 = t1Var2.getChildAt(0);
                                                                            if (view3 instanceof org.telegram.ui.Cells.s1) {
                                                                                imageReceiver2 = ((org.telegram.ui.Cells.s1) view3).getPhotoImage();
                                                                                if (imageReceiver2 != null) {
                                                                                    float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, t6Var.k0), imageReceiver2.getImageHeight() / Math.max(1, t6Var.l0));
                                                                                    matrix.postScale(max, max);
                                                                                    matrix.postTranslate(imageReceiver2.getCenterX() - ((t6Var.k0 * max) / 2.0f), imageReceiver2.getCenterY() - ((t6Var.l0 * max) / 2.0f));
                                                                                    matrix.postTranslate(s1Var.getX(), s1Var.getY());
                                                                                    matrix.postTranslate(t1Var2.getX(), t1Var2.getY());
                                                                                    matrix.postTranslate(view3.getX(), view3.getY());
                                                                                    matrix.postScale(a2Var.getScaleX(), a2Var.getScaleY(), a2Var.getPivotX(), a2Var.getPivotY());
                                                                                    matrix.postRotate(a2Var.getRotation(), a2Var.getPivotX(), a2Var.getPivotY());
                                                                                    matrix.postTranslate(a2Var.getX(), a2Var.getY());
                                                                                    matrix.postScale(1.0f / w4Var.getWidth(), 1.0f / w4Var.getHeight());
                                                                                    matrix.postScale(t6Var.i0, t6Var.j0);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            view3 = null;
                                                                        }
                                                                        imageReceiver2 = null;
                                                                        if (imageReceiver2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                z15 = false;
                                                            } else {
                                                                z15 = true;
                                                            }
                                                            z16 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x102 = view.getX();
                                                            float y102 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY2) / w4Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102) / w4Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY2) * view.getHeight()) / 2.0f) + y102) / w4Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102) / w4Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y102) / w4Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof dg.a2) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                                mediaAreaCoordinates.flags |= 1;
                                                                mediaAreaCoordinates.radius = ((scaleX * d) / view.getWidth()) * 100.0d;
                                                            }
                                                            z13 = z16;
                                                            z14 = z17;
                                                        } else {
                                                            imageReceiver3.setVisible(false, false);
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) lh.t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                            if (stargiftattributemodel != null) {
                                                                float dp = AndroidUtilities.dp(110.0f);
                                                                a2Var = a2Var3;
                                                                float centerX = imageReceiver3.getCenterX() + v0Var.getX() + t1Var2.getX() + v0Var.A0;
                                                                float centerY = imageReceiver3.getCenterY() + v0Var.getY() + t1Var2.getY() + v0Var.B0;
                                                                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                imageReceiver4 = imageReceiver3;
                                                                mediaEntity2.type = (byte) 0;
                                                                mediaEntity2.width = dp;
                                                                mediaEntity2.height = dp;
                                                                TLRPC.Document document2 = stargiftattributemodel.document;
                                                                mediaEntity2.document = document2;
                                                                mediaEntity2.parentObject = starGift;
                                                                mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                                if (MessageObject.isAnimatedStickerDocument(document2, true) || x0(document2)) {
                                                                    boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                    mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                    gj0 lottieAnimation = imageReceiver4.getLottieAnimation();
                                                                    if (lottieAnimation != null && (isAnimatedStickerDocument5 || x0(document2))) {
                                                                        r20 = lottieAnimation.p();
                                                                    }
                                                                    if (r20 != 0) {
                                                                        BigInteger valueOf3 = BigInteger.valueOf(r20);
                                                                        c5Var.d1 = c5Var.d1.multiply(valueOf3).divide(c5Var.d1.gcd(valueOf3));
                                                                    }
                                                                }
                                                                float scaleX2 = childAt.getScaleX();
                                                                float scaleY3 = childAt.getScaleY();
                                                                float x11 = childAt.getX();
                                                                float y11 = childAt.getY();
                                                                int i26 = (int) dp;
                                                                mediaEntity2.viewWidth = i26;
                                                                mediaEntity2.viewHeight = i26;
                                                                mediaEntity2.width = (dp * scaleX2) / w4Var.getMeasuredWidth();
                                                                mediaEntity2.height = (dp * scaleY3) / w4Var.getMeasuredHeight();
                                                                mediaEntity2.x = (childAt.getWidth() / 2.0f) + x11;
                                                                mediaEntity2.y = (childAt.getHeight() / 2.0f) + y11;
                                                                i12 = i14;
                                                                float A = org.telegram.messenger.y3.A(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                float A2 = org.telegram.messenger.y3.A(childAt.getHeight(), 2.0f, scaleY3, centerY * scaleY3);
                                                                s1Var = s1Var3;
                                                                view = childAt;
                                                                double d10 = mediaEntity2.x;
                                                                double d11 = A;
                                                                double rotation = (float) ((childAt.getRotation() / 180.0f) * 3.141592653589793d);
                                                                double cos = Math.cos(rotation) * d11;
                                                                double d12 = A2;
                                                                mediaEntity2.x = (float) ((cos - (Math.sin(rotation) * d12)) + d10);
                                                                float cos2 = (float) ((Math.cos(rotation) * d12) + (Math.sin(rotation) * d11) + mediaEntity2.y);
                                                                float f17 = (-dp) / 2.0f;
                                                                float f18 = (f17 * scaleX2) + mediaEntity2.x;
                                                                mediaEntity2.x = f18;
                                                                mediaEntity2.y = (f17 * scaleY3) + cos2;
                                                                mediaEntity2.x = f18 / w4Var.getMeasuredWidth();
                                                                mediaEntity2.y /= w4Var.getMeasuredHeight();
                                                                mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                                mediaEntity2.scale = scaleX2;
                                                                arrayList.add(mediaEntity2);
                                                            } else {
                                                                a2Var = a2Var3;
                                                                imageReceiver4 = imageReceiver3;
                                                                i12 = i14;
                                                                s1Var = s1Var3;
                                                                view = childAt;
                                                            }
                                                            imageReceiver = imageReceiver4;
                                                            if (z11) {
                                                            }
                                                            z16 = true;
                                                            arrayList.add(mediaEntity);
                                                            scaleX = view.getScaleX();
                                                            float scaleY22 = view.getScaleY();
                                                            float x1022 = view.getX();
                                                            float y1022 = view.getY();
                                                            mediaEntity.viewWidth = view.getWidth();
                                                            mediaEntity.viewHeight = view.getHeight();
                                                            mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                                            mediaEntity.height = (view.getHeight() * scaleY22) / w4Var.getMeasuredHeight();
                                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022) / w4Var.getMeasuredWidth();
                                                            mediaEntity.y = ((((1.0f - scaleY22) * view.getHeight()) / 2.0f) + y1022) / w4Var.getMeasuredHeight();
                                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022) / w4Var.getMeasuredWidth();
                                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y1022) / w4Var.getMeasuredHeight();
                                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                                            mediaEntity.scale = scaleX;
                                                            if (jVar instanceof dg.a2) {
                                                            }
                                                            mediaArea = mediaEntity.mediaArea;
                                                            if (mediaArea != null) {
                                                            }
                                                            z13 = z16;
                                                            z14 = z17;
                                                        }
                                                    }
                                                }
                                                a2Var = a2Var3;
                                                i12 = i14;
                                                s1Var = s1Var3;
                                                view = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(i17).getInputChannel(-t6.p(messageObject));
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    Boolean D = t6.D(messageObject);
                                                    tL_inputMediaAreaChannelPost2.msg_id = D == null ? 0 : D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId();
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost3;
                                                    tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                                if (z11) {
                                                }
                                                z16 = true;
                                                arrayList.add(mediaEntity);
                                                scaleX = view.getScaleX();
                                                float scaleY222 = view.getScaleY();
                                                float x10222 = view.getX();
                                                float y10222 = view.getY();
                                                mediaEntity.viewWidth = view.getWidth();
                                                mediaEntity.viewHeight = view.getHeight();
                                                mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                                mediaEntity.height = (view.getHeight() * scaleY222) / w4Var.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x10222) / w4Var.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY222) * view.getHeight()) / 2.0f) + y10222) / w4Var.getMeasuredHeight();
                                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x10222) / w4Var.getMeasuredWidth();
                                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y10222) / w4Var.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (jVar instanceof dg.a2) {
                                                }
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea != null) {
                                                }
                                                z13 = z16;
                                                z14 = z17;
                                            }
                                            i12 = i14;
                                            view = childAt;
                                            z15 = true;
                                            z16 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = view.getScaleX();
                                            float scaleY2222 = view.getScaleY();
                                            float x102222 = view.getX();
                                            float y102222 = view.getY();
                                            mediaEntity.viewWidth = view.getWidth();
                                            mediaEntity.viewHeight = view.getHeight();
                                            mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY2222) / w4Var.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x102222) / w4Var.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY2222) * view.getHeight()) / 2.0f) + y102222) / w4Var.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x102222) / w4Var.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y102222) / w4Var.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (jVar instanceof dg.a2) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z13 = z16;
                                            z14 = z17;
                                        }
                                        i12 = i14;
                                    }
                                }
                                i12 = i14;
                                view = childAt;
                                z15 = false;
                                z16 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = view.getScaleX();
                                float scaleY22222 = view.getScaleY();
                                float x1022222 = view.getX();
                                float y1022222 = view.getY();
                                mediaEntity.viewWidth = view.getWidth();
                                mediaEntity.viewHeight = view.getHeight();
                                mediaEntity.width = (view.getWidth() * scaleX) / w4Var.getMeasuredWidth();
                                mediaEntity.height = (view.getHeight() * scaleY22222) / w4Var.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * view.getWidth()) / 2.0f) + x1022222) / w4Var.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY22222) * view.getHeight()) / 2.0f) + y1022222) / w4Var.getMeasuredHeight();
                                mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x1022222) / w4Var.getMeasuredWidth();
                                mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y1022222) / w4Var.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / w4Var.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / w4Var.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (jVar instanceof dg.a2) {
                                }
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea != null) {
                                }
                                z13 = z16;
                                z14 = z17;
                            } else {
                                w4Var = w4Var2;
                                i12 = childCount;
                                i13 = i16;
                                view = childAt;
                                z13 = true;
                                z14 = false;
                                imageReceiver = null;
                            }
                            if (z13 && ((z10 || (z11 && mediaEntity.type == 6)) && bitmap != null)) {
                                Canvas canvas2 = new Canvas(bitmap);
                                float width2 = bitmap.getWidth() / w4Var.getMeasuredWidth();
                                int i27 = 0;
                                while (i27 < 2) {
                                    Canvas canvas3 = i27 == 0 ? canvas2 : null;
                                    if (canvas3 == null || (i27 == 0 && z14)) {
                                        canvas = canvas2;
                                        view2 = view;
                                    } else {
                                        canvas3.save();
                                        canvas3.scale(width2, width2);
                                        canvas3.translate(mediaEntity.x * w4Var.getMeasuredWidth(), mediaEntity.y * w4Var.getMeasuredHeight());
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * w4Var.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * w4Var.getMeasuredHeight());
                                        view2 = view;
                                        if (!(view2 instanceof dg.b4) || view2.getHeight() <= 0 || view2.getWidth() <= 0) {
                                            canvas = canvas2;
                                            if (view2 instanceof dg.a2) {
                                                dg.a2 a2Var4 = (dg.a2) view2;
                                                dg.t1 t1Var3 = a2Var4.o0;
                                                boolean z22 = true;
                                                a2Var4.r0 = true;
                                                int i28 = 0;
                                                while (i28 < t1Var3.getChildCount()) {
                                                    View childAt3 = t1Var3.getChildAt(i28);
                                                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt3).le = z22;
                                                    }
                                                    i28++;
                                                    z22 = true;
                                                }
                                                view2.draw(canvas3);
                                                boolean z23 = false;
                                                a2Var4.r0 = false;
                                                int i29 = 0;
                                                while (i29 < t1Var3.getChildCount()) {
                                                    View childAt4 = t1Var3.getChildAt(i29);
                                                    if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                                        ((org.telegram.ui.Cells.s1) childAt4).le = z23;
                                                    }
                                                    i29++;
                                                    z23 = false;
                                                }
                                            } else {
                                                view2.draw(canvas3);
                                            }
                                        } else {
                                            int scaleX3 = (int) (view2.getScaleX() * view2.getWidth());
                                            int scaleY4 = (int) (view2.getScaleY() * view2.getHeight());
                                            Bitmap createBitmap2 = Bitmaps.createBitmap(scaleX3, scaleY4, Bitmap.Config.ARGB_8888);
                                            Canvas canvas4 = new Canvas(createBitmap2);
                                            canvas = canvas2;
                                            canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                            view2.draw(canvas4);
                                            canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                            canvas3.drawBitmap(createBitmap2, (Rect) null, new Rect(0, 0, scaleX3, scaleY4), new Paint(3));
                                            try {
                                                canvas4.setBitmap(null);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            createBitmap2.recycle();
                                        }
                                        canvas3.restore();
                                    }
                                    i27++;
                                    view = view2;
                                    canvas2 = canvas;
                                }
                                if (imageReceiver != null) {
                                    imageReceiver.setVisible(true, false);
                                    i16 = i13 + 1;
                                    c5Var = this;
                                    childCount = i12;
                                    w4Var2 = w4Var;
                                    i15 = 0;
                                    b10 = 1;
                                }
                            }
                        } else {
                            w4Var = w4Var2;
                            i12 = childCount;
                            i13 = i16;
                        }
                        i16 = i13 + 1;
                        c5Var = this;
                        childCount = i12;
                        w4Var2 = w4Var;
                        i15 = 0;
                        b10 = 1;
                    }
                }
                return bitmap;
            }
            Bitmap c3 = s4Var.c(false, false);
            createBitmap = c3 != null ? Bitmap.createBitmap(c3.getWidth(), c3.getHeight(), Bitmap.Config.ARGB_8888) : null;
        }
        bitmap = createBitmap;
        c5Var.d1 = BigInteger.ONE;
        i11 = 0;
        while (i10 < w4Var2.getChildCount()) {
        }
        if (i11 > 0) {
        }
        return bitmap;
    }

    @Override // dg.h
    public final void u(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.L0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y10 - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    public final boolean u0() {
        return this.A0.a() || this.i2;
    }

    @Override // dg.n2
    public final cg.f1 v() {
        return cg.f1.e(this.C1);
    }

    public final void v0(boolean z4) {
        int i10 = 0;
        if (this.n2) {
            J0(0);
        }
        if (z4) {
            kz kzVar = this.m2;
            if (kzVar == null || kzVar.getVisibility() != 0) {
                w0();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.m2.getMeasuredHeight());
            ofFloat.addUpdateListener(new w3(this, i10));
            this.p2 = true;
            ofFloat.addListener(new k4(this, 2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.start();
        }
    }

    @Override // dg.h
    public final boolean w(dg.j jVar) {
        return D0(jVar, true);
    }

    public final void w0() {
        kz kzVar;
        if (!this.n2 && (kzVar = this.m2) != null && kzVar.getVisibility() != 8) {
            this.m2.setVisibility(8);
        }
        int i10 = this.q2;
        this.q2 = 0;
        if (i10 != 0) {
            this.L1.a();
        }
    }

    @Override // dg.n2
    public final void x(cg.m mVar) {
        boolean z4 = mVar instanceof cg.b;
        dg.t2 t2Var = this.a1;
        if (z4 || (mVar instanceof cg.d)) {
            t2Var.b(0.4f, 1.75f);
        } else {
            t2Var.b(0.05f, 1.0f);
        }
        t2Var.setDrawCenter(!(mVar instanceof cg.l));
        s4 s4Var = this.L0;
        if (s4Var.getCurrentBrush() instanceof cg.l) {
            this.Z0 = true;
        }
        s4Var.setBrush(mVar);
        cg.f2 f2Var = this.x1;
        int i10 = f2Var.a;
        f2Var.a = cg.f1.e(this.C1).c();
        f2Var.c = this.b1.get();
        E0(f2Var, Integer.valueOf(i10), false);
        this.M0.invalidate();
    }

    public final boolean y0() {
        if (this.Z1) {
            if (this.W1.getReactionsWindow() == null || this.W1.getReactionsWindow().q) {
                O0(false);
                return true;
            }
            this.W1.e();
            return true;
        }
        if (this.y1) {
            I0(false);
            return true;
        }
        if (this.n2) {
            v0(true);
            return true;
        }
        if (!this.H0) {
            return false;
        }
        if (!this.J0) {
            D0(null, true);
            return true;
        }
        this.J0 = false;
        this.L1.b(true);
        return false;
    }

    public abstract void z0(boolean z4);

    public View getView() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f10) {
    }
}
