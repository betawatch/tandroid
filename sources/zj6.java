// default package

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zj6 extends d implements gfa, aj4, gk7 {
    public boolean E;
    public boolean F;
    public int G;
    public a8 H;
    public a8 I;
    public a8 J;
    public ch6 K;
    public final ox4[] L;
    public int M;
    public FrameLayout N;
    public u41 O;
    public fm0 P;
    public View Q;
    public vj6 R;
    public yj6 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public ffa b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public xha s;
    public SparseArray w;
    public a8 x;
    public a8 y;

    public zj6(Bundle bundle, ffa ffaVar) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new ox4[2];
        this.M = -1;
        this.b = ffaVar;
    }

    @Override // aj4
    public final List E() {
        Activity parentActivity = getParentActivity();
        do3 do3Var = h9a.m;
        return Arrays.asList(new zi4((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new uj6(this, (byte) 1)));
    }

    @Override // gfa
    public final void Q() {
        ffa ffaVar;
        yj6 yj6Var = this.S;
        if (yj6Var != null && (ffaVar = this.b) != null) {
            yj6Var.setNewMediaCounts(ffaVar.c);
        }
        e0();
    }

    public final void a0() {
        if (this.S == null) {
            return;
        }
        int i = 0;
        int L = this.K != null ? gl.L(72.0f) : 0;
        yj6 yj6Var = this.S;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = nfa.t2;
        yj6Var.i1(dg0.d(currentActionBarHeight - a.getCurrentActionBarHeight()) - gl.L(6.666f), dg0.c(this.mSystemInsets.b), dg0.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + gl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = this.mSystemInsets.d;
            layoutParams.height = i2 + L;
            View view2 = this.navigationBarFadeView;
            if (i2 < gl.L(40.0f) && L <= 0) {
                i = 8;
            }
            view2.setVisibility(i);
            this.navigationBarFadeView.requestLayout();
        }
        b0();
    }

    public final void b0() {
        if (this.K == null) {
            return;
        }
        float f = this.P.e;
        float L = gl.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f) + (-r2));
        float f2 = 1.0f - f;
        this.K.setAlpha(f2);
        this.K.setVisibility(f < 1.0f ? 0 : 4);
        this.N.setTranslationY((L * f2) + (-this.mSystemInsets.d));
        this.N.setAlpha(f);
        this.N.setVisibility(f > 0.0f ? 0 : 4);
    }

    public final boolean c0() {
        int i = this.a;
        return i == 1 || i == 2;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        if (this.S.u0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        dg0 dg0Var;
        int i;
        setHasOwnBackground(true);
        final byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 8));
        oc6 oc6Var = new oc6((byte) 3, context, this);
        this.fragmentView = oc6Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().D1().b && getMessagesController().D1().e()) {
            this.T = 11;
        }
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        yj6 yj6Var = new yj6(this, context, this.e, this.b, this.c, this.d, this.T, this, new xj6(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = yj6Var;
        yj6Var.setOnTopPanelShiftChanged(new uj6(this, b));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        oc6Var.addView(this.S, nme.c(-1.0f, -1));
        byte b2 = 10;
        if (c0()) {
            xha a = this.simpleActionBar.t().a(0, R.drawable.ic_ab_other);
            this.s = a;
            a.setContentDescription(k96.M0(2131754838, null));
            this.s.Y(false, false);
            a8 e = this.s.e(8, R.drawable.msg_zoomin, k96.M0(2131748458, null));
            this.I = e;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: wj6
                public final /* synthetic */ zj6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    int i2;
                    byte b3 = b;
                    pw0 pw0Var = pw0.E;
                    zj6 zj6Var = this.b;
                    byte b4 = 1;
                    switch (b3) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = zj6Var.E;
                            if (z && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i3 = -zj6Var.G;
                                zj6Var.G = i3;
                                gl.B3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = zj6Var.x;
                                boolean z2 = !z;
                                zj6Var.E = z2;
                                a8Var2.setChecked(z2);
                                yj6 yj6Var2 = zj6Var.S;
                                boolean z3 = zj6Var.E;
                                boolean z4 = zj6Var.F;
                                xda xdaVar = yj6Var2.f0;
                                if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                    y1bVar2.n = z3;
                                    y1bVar2.o = z4;
                                    y1bVar2.d(true);
                                }
                                jca jcaVar = yj6Var2.h0;
                                if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                    y1bVar.n = z3;
                                    y1bVar.o = z4;
                                    y1bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = zj6Var.F;
                            if (z5 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.B3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = zj6Var.y;
                                boolean z6 = !z5;
                                zj6Var.F = z6;
                                a8Var4.setChecked(z6);
                                yj6 yj6Var3 = zj6Var.S;
                                boolean z7 = zj6Var.E;
                                boolean z8 = zj6Var.F;
                                xda xdaVar2 = yj6Var3.f0;
                                if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                    y1bVar4.n = z7;
                                    y1bVar4.o = z8;
                                    y1bVar4.d(true);
                                }
                                jca jcaVar2 = yj6Var3.h0;
                                if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                    y1bVar3.n = z7;
                                    y1bVar3.o = z8;
                                    y1bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            byte b5 = 0;
                            boolean z9 = zj6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < zj6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z9) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z9, b5);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? u21.b0(zj6Var2).L(R.raw.contact_check, k96.G(i2, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j() : u21.b0(zj6Var2).J(R.raw.chats_archived, k96.G(i2, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j()).v = new oh6(zj6Var2, zArr2, b4);
                                break;
                            }
                            break;
                    }
                }
            });
            a8 e2 = this.s.e(9, R.drawable.msg_zoomout, k96.M0(2131748457, null));
            this.J = e2;
            e2.setOnClickListener(new View.OnClickListener(this) { // from class: wj6
                public final /* synthetic */ zj6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    int i2;
                    byte b3 = r2;
                    pw0 pw0Var = pw0.E;
                    zj6 zj6Var = this.b;
                    byte b4 = 1;
                    switch (b3) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = zj6Var.E;
                            if (z && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i3 = -zj6Var.G;
                                zj6Var.G = i3;
                                gl.B3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = zj6Var.x;
                                boolean z2 = !z;
                                zj6Var.E = z2;
                                a8Var2.setChecked(z2);
                                yj6 yj6Var2 = zj6Var.S;
                                boolean z3 = zj6Var.E;
                                boolean z4 = zj6Var.F;
                                xda xdaVar = yj6Var2.f0;
                                if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                    y1bVar2.n = z3;
                                    y1bVar2.o = z4;
                                    y1bVar2.d(true);
                                }
                                jca jcaVar = yj6Var2.h0;
                                if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                    y1bVar.n = z3;
                                    y1bVar.o = z4;
                                    y1bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = zj6Var.F;
                            if (z5 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.B3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = zj6Var.y;
                                boolean z6 = !z5;
                                zj6Var.F = z6;
                                a8Var4.setChecked(z6);
                                yj6 yj6Var3 = zj6Var.S;
                                boolean z7 = zj6Var.E;
                                boolean z8 = zj6Var.F;
                                xda xdaVar2 = yj6Var3.f0;
                                if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                    y1bVar4.n = z7;
                                    y1bVar4.o = z8;
                                    y1bVar4.d(true);
                                }
                                jca jcaVar2 = yj6Var3.h0;
                                if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                    y1bVar3.n = z7;
                                    y1bVar3.o = z8;
                                    y1bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            byte b5 = 0;
                            boolean z9 = zj6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < zj6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z9) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z9, b5);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? u21.b0(zj6Var2).L(R.raw.contact_check, k96.G(i2, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j() : u21.b0(zj6Var2).J(R.raw.chats_archived, k96.G(i2, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j()).v = new oh6(zj6Var2, zArr2, b4);
                                break;
                            }
                            break;
                    }
                }
            });
            a8 e3 = this.s.e(10, R.drawable.msg_calendar2, k96.M0(2131752630, null));
            this.H = e3;
            e3.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            xha xhaVar = this.s;
            a8 d = xhaVar.d(6, 0, null, k96.M0(2131748461, null), true, true, xhaVar.n0);
            this.x = d;
            d.setChecked(this.E);
            final byte b3 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: wj6
                public final /* synthetic */ zj6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    int i2;
                    byte b32 = b3;
                    pw0 pw0Var = pw0.E;
                    zj6 zj6Var = this.b;
                    byte b4 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = zj6Var.E;
                            if (z && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i3 = -zj6Var.G;
                                zj6Var.G = i3;
                                gl.B3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = zj6Var.x;
                                boolean z2 = !z;
                                zj6Var.E = z2;
                                a8Var2.setChecked(z2);
                                yj6 yj6Var2 = zj6Var.S;
                                boolean z3 = zj6Var.E;
                                boolean z4 = zj6Var.F;
                                xda xdaVar = yj6Var2.f0;
                                if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                    y1bVar2.n = z3;
                                    y1bVar2.o = z4;
                                    y1bVar2.d(true);
                                }
                                jca jcaVar = yj6Var2.h0;
                                if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                    y1bVar.n = z3;
                                    y1bVar.o = z4;
                                    y1bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = zj6Var.F;
                            if (z5 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.B3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = zj6Var.y;
                                boolean z6 = !z5;
                                zj6Var.F = z6;
                                a8Var4.setChecked(z6);
                                yj6 yj6Var3 = zj6Var.S;
                                boolean z7 = zj6Var.E;
                                boolean z8 = zj6Var.F;
                                xda xdaVar2 = yj6Var3.f0;
                                if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                    y1bVar4.n = z7;
                                    y1bVar4.o = z8;
                                    y1bVar4.d(true);
                                }
                                jca jcaVar2 = yj6Var3.h0;
                                if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                    y1bVar3.n = z7;
                                    y1bVar3.o = z8;
                                    y1bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            byte b5 = 0;
                            boolean z9 = zj6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < zj6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z9) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z9, b5);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? u21.b0(zj6Var2).L(R.raw.contact_check, k96.G(i2, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j() : u21.b0(zj6Var2).J(R.raw.chats_archived, k96.G(i2, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j()).v = new oh6(zj6Var2, zArr2, b4);
                                break;
                            }
                            break;
                    }
                }
            });
            xha xhaVar2 = this.s;
            a8 d2 = xhaVar2.d(7, 0, null, k96.M0(2131748460, null), true, true, xhaVar2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            final byte b4 = 3;
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: wj6
                public final /* synthetic */ zj6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    int i2;
                    byte b32 = b4;
                    pw0 pw0Var = pw0.E;
                    zj6 zj6Var = this.b;
                    byte b42 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = zj6Var.E;
                            if (z && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i3 = -zj6Var.G;
                                zj6Var.G = i3;
                                gl.B3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = zj6Var.x;
                                boolean z2 = !z;
                                zj6Var.E = z2;
                                a8Var2.setChecked(z2);
                                yj6 yj6Var2 = zj6Var.S;
                                boolean z3 = zj6Var.E;
                                boolean z4 = zj6Var.F;
                                xda xdaVar = yj6Var2.f0;
                                if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                    y1bVar2.n = z3;
                                    y1bVar2.o = z4;
                                    y1bVar2.d(true);
                                }
                                jca jcaVar = yj6Var2.h0;
                                if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                    y1bVar.n = z3;
                                    y1bVar.o = z4;
                                    y1bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = zj6Var.F;
                            if (z5 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.B3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = zj6Var.y;
                                boolean z6 = !z5;
                                zj6Var.F = z6;
                                a8Var4.setChecked(z6);
                                yj6 yj6Var3 = zj6Var.S;
                                boolean z7 = zj6Var.E;
                                boolean z8 = zj6Var.F;
                                xda xdaVar2 = yj6Var3.f0;
                                if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                    y1bVar4.n = z7;
                                    y1bVar4.o = z8;
                                    y1bVar4.d(true);
                                }
                                jca jcaVar2 = yj6Var3.h0;
                                if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                    y1bVar3.n = z7;
                                    y1bVar3.o = z8;
                                    y1bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            byte b5 = 0;
                            boolean z9 = zj6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < zj6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z9) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z9, b5);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? u21.b0(zj6Var2).L(R.raw.contact_check, k96.G(i2, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j() : u21.b0(zj6Var2).J(R.raw.chats_archived, k96.G(i2, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j()).v = new oh6(zj6Var2, zArr2, b42);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i2 = this.a;
        ox4[] ox4VarArr = this.L;
        if (i2 == 1) {
            ch6 ch6Var = new ch6(context, getResourceProvider());
            this.K = ch6Var;
            ch6Var.setClipChildren(false);
            this.K.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
            ox4VarArr[0] = ox4.c(context, getResourceProvider(), nx4.R, 2131746458);
            ox4VarArr[1] = ox4.c(context, getResourceProvider(), nx4.S, 2131746434);
            for (int i3 = 0; i3 < ox4VarArr.length; i3++) {
                ox4VarArr[i3].setOnClickListener(new v0(this, i3, b2));
                this.K.addView(ox4VarArr[i3]);
                this.K.j(ox4VarArr[i3], true, false);
            }
            dg0Var = baseSimpleGlass;
            il0 c = dg0Var.c.c(this.K, nod.g(getResourceProvider()), false);
            ug8.r(c, gl.L(28.0f), 7.666f);
            this.K.setBackground(c);
            oc6Var.addView(this.K, nme.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(gl.L(16.0f), gl.L(8.0f), gl.L(16.0f), gl.L(8.0f));
            u41 u41Var = new u41(getResourceProvider(), context, true);
            this.O = u41Var;
            u41Var.i(k96.M0(2131745717, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final byte b5 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: wj6
                public final /* synthetic */ zj6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    int i22;
                    byte b32 = b5;
                    pw0 pw0Var = pw0.E;
                    zj6 zj6Var = this.b;
                    byte b42 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = zj6Var.E;
                            if (z && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i32 = -zj6Var.G;
                                zj6Var.G = i32;
                                gl.B3(i32, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = zj6Var.x;
                                boolean z2 = !z;
                                zj6Var.E = z2;
                                a8Var2.setChecked(z2);
                                yj6 yj6Var2 = zj6Var.S;
                                boolean z3 = zj6Var.E;
                                boolean z4 = zj6Var.F;
                                xda xdaVar = yj6Var2.f0;
                                if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                    y1bVar2.n = z3;
                                    y1bVar2.o = z4;
                                    y1bVar2.d(true);
                                }
                                jca jcaVar = yj6Var2.h0;
                                if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                    y1bVar.n = z3;
                                    y1bVar.o = z4;
                                    y1bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = zj6Var.F;
                            if (z5 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.B3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = zj6Var.y;
                                boolean z6 = !z5;
                                zj6Var.F = z6;
                                a8Var4.setChecked(z6);
                                yj6 yj6Var3 = zj6Var.S;
                                boolean z7 = zj6Var.E;
                                boolean z8 = zj6Var.F;
                                xda xdaVar2 = yj6Var3.f0;
                                if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                    y1bVar4.n = z7;
                                    y1bVar4.o = z8;
                                    y1bVar4.d(true);
                                }
                                jca jcaVar2 = yj6Var3.h0;
                                if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                    y1bVar3.n = z7;
                                    y1bVar3.o = z8;
                                    y1bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            byte b52 = 0;
                            boolean z9 = zj6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i22 = 0;
                                for (int i5 = 0; i5 < zj6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i22++;
                                    }
                                }
                            } else {
                                i22 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z9) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z9, b52);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? u21.b0(zj6Var2).L(R.raw.contact_check, k96.G(i22, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j() : u21.b0(zj6Var2).J(R.raw.chats_archived, k96.G(i22, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j()).v = new oh6(zj6Var2, zArr2, b42);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, nme.c(56.0f, -1));
            this.N.setVisibility(4);
            oc6Var.addView(this.N, nme.e(-1, 72, 80));
            this.P = new fm0(0, new ry4((Object) this, (byte) 28), s33.h, 320L, false);
            setBulletinDelegate(new s10(this, (byte) 12));
        } else {
            dg0Var = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.e(view);
        View view2 = this.Q;
        view2.setBackground(dg0Var.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(dg0Var.b(view3));
        View view4 = this.navigationBarFadeView;
        ch6 ch6Var2 = this.K;
        oc6Var.addView(view4, ch6Var2 != null ? oc6Var.indexOfChild(ch6Var2) : oc6Var.getChildCount(), nme.e(-1, 0, 80));
        pha phaVar = this.simpleActionBar;
        wjb resourceProvider = getResourceProvider();
        dg0Var.m = oc6Var;
        dg0Var.n = null;
        dg0Var.g(oc6Var, phaVar, resourceProvider);
        dg0Var.o = new cg0(this, oc6Var, (byte) 6);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        f0(false);
        if (this.a == 3 && (i = this.r) != -1) {
            this.simpleActionBar.setSubtitle(k96.H(' ', "FoundStories", i));
        }
        a0();
        e0();
        if (this.a == 1) {
            r13 = this.T != 9 ? (byte) 0 : (byte) 1;
            ch6 ch6Var3 = this.K;
            if (ch6Var3 != null && this.M != r13) {
                this.M = r13;
                ch6Var3.r(ox4VarArr[r13], false);
            }
        }
        return oc6Var;
    }

    public final void d0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.D0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            yj6 yj6Var = this.S;
            if (yj6Var != null) {
                yj6Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0() {
        int i;
        yj6 yj6Var = this.S;
        if (yj6Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = yj6Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z = k96.a0;
            if (closestTab == 8 || closestTab == 9) {
                a8 a8Var = this.J;
                if (a8Var != null) {
                    a8Var.setEnabled(this.S.t());
                    a8 a8Var2 = this.J;
                    a8Var2.setAlpha(a8Var2.isEnabled() ? 1.0f : 0.5f);
                }
                a8 a8Var3 = this.I;
                if (a8Var3 != null) {
                    a8Var3.setEnabled(this.S.r());
                    a8 a8Var4 = this.I;
                    a8Var4.setAlpha(a8Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int W = this.S.W(closestTab);
                if (this.a == 3) {
                    if (W > 0) {
                        d0(k96.H(' ', "FoundStories", W));
                    }
                } else if (closestTab == 8) {
                    d0(W > 0 ? k96.G(W, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    d0(W > 0 ? k96.G(W, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                f0(true);
                xha xhaVar = this.s;
                if (xhaVar != null) {
                    xhaVar.Y(W > 0, true);
                }
                u41 u41Var = this.O;
                if (u41Var != null) {
                    boolean z2 = !z && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        u41Var.i(k96.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z2, true);
                    } else {
                        u41Var.i(k96.M0(2131745717, null), z2, true);
                    }
                    this.V = closestTab;
                }
                a8 a8Var5 = this.H;
                if (a8Var5 != null) {
                    boolean z3 = W > 0;
                    a8Var5.setEnabled(z3);
                    this.H.setAlpha(z3 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                d0(k96.G(getMessagesController().D1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            d0(k96.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            d0(k96.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            d0(k96.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        d0(k96.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        d0(k96.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        d0(k96.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        d0(k96.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        d0(k96.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i = iArr[8]) >= 0) {
                        d0(k96.G(i, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        p97 J0 = na7.q1(this.currentAccount).J0(this.e);
                        d0(k96.G(J0 == null ? 0 : J0.b.size() + J0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    public final void f0(boolean z) {
        String str;
        int i = this.a;
        boolean z2 = true;
        if (i == 3) {
            str = this.h;
        } else {
            if (i == 2) {
                str = k96.M0(2131746441, null);
            } else if (i == 1) {
                yj6 yj6Var = this.S;
                if (yj6Var != null && yj6Var.getClosestTab() != 9) {
                    z2 = false;
                }
                str = k96.M0(z2 ? 2131746441 : 2131746462, null);
            } else {
                long j = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j == 2666000) {
                    str = k96.M0(2131754249, null);
                } else if (this.f != 0 && j == getUserConfig().e()) {
                    str = k96.M0(2131748111, null);
                } else if (cf3.B(j)) {
                    TLRPC.EncryptedChat Y0 = getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L)));
                    TLRPC.User V1 = Y0 != null ? getMessagesController().V1(Long.valueOf(Y0.user_id)) : null;
                    if (V1 != null) {
                        str = qu2.m(0, V1.first_name, V1.last_name);
                    }
                    str = null;
                } else if (cf3.D(j)) {
                    TLRPC.User V12 = getMessagesController().V1(Long.valueOf(j));
                    if (V12 != null) {
                        str = V12.self ? k96.M0(2131745709, null) : qu2.m(0, V12.first_name, V12.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                    if (K0 != null) {
                        str = K0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = k96.M0(2131745223, null);
                }
            }
        }
        String str2 = str;
        boolean z3 = z2;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        pha phaVar = this.simpleActionBar;
        if (!z) {
            phaVar.setTitle(str2);
        } else {
            phaVar.getClass();
            phaVar.I(str2, z3, 320L, s33.h);
        }
    }

    public final void g0(boolean z, boolean z2) {
        this.J.setEnabled(z);
        this.J.animate().alpha(z ? 1.0f : 0.5f).start();
        this.I.setEnabled(z2);
        this.I.animate().alpha(z2 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().z()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.u0()) {
            return false;
        }
        yj6 yj6Var = this.S;
        return yj6Var.getSelectedTab() == yj6Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            yj6 yj6Var = this.S;
            if (!yj6Var.F1) {
                return super.onBackPressed(z);
            }
            if (z) {
                yj6Var.E(false);
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i = this.a;
        this.T = getArguments().getInt("start_from", i == 2 ? 9 : i == 1 ? 8 : 0);
        getNotificationCenter().b(this, kk7.D0);
        getNotificationCenter().b(this, kk7.h5);
        getNotificationCenter().b(this, kk7.a3);
        if (cf3.D(this.e) && this.f == 0) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e));
            if (l7c.C(V1)) {
                getMessagesController().h3(this.classGuid, V1, false);
                this.d = getMessagesController().W1(this.e);
            }
        }
        ffa ffaVar = this.b;
        if (ffaVar == null) {
            ffaVar = new ffa(this);
            this.b = ffaVar;
        }
        ffaVar.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.D0);
        getNotificationCenter().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.a3);
        vj6 vj6Var = this.R;
        if (vj6Var != null) {
            this.R = null;
            gl.d3(vj6Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        a0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
