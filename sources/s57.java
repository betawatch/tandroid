// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class s57 extends FrameLayout {
    public final zz3 E;
    public final ArrayList F;
    public final o57 G;
    public final ll0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final zu1 c;
    public final v47 d;
    public final q57 e;
    public final x47 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public s57(Context context, zu1 zu1Var, ll0 ll0Var, v47 v47Var, TLRPC.User user, TLRPC.Chat chat, int i, o57 o57Var, int i2, final boolean z) {
        super(context);
        this.E = new zz3(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = zu1Var;
        this.x = i;
        this.H = ll0Var;
        this.n = user;
        this.r = chat;
        this.d = v47Var;
        this.G = o57Var;
        this.f = new x47(this, context, o57Var);
        q57 q57Var = new q57(context, o57Var);
        this.e = q57Var;
        jl0 c = ll0Var.c(q57Var, null, false);
        c.p(dtd.k(o57Var));
        c.S.e = true;
        c.q(hl.L(8.0f));
        c.r(hl.L(16.0f));
        q57Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && v47Var.a != null) {
                this.e.a(0, ob6.M0(2131748301, null));
            } else if (i4 != 1 || v47Var.b == null || z) {
                if (i4 == 2 && v47Var.c != null && !z) {
                    this.e.a(2, ob6.M0(2131748304, null));
                }
            } else {
                this.e.a(1, ob6.M0(2131748305, null));
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new y47(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, tre.e(-1, 66, 87));
        addView(this.f, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new zj3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() { // from class: w47
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    s57.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(bb2.V).scaleY(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r3.k != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r3.l == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        int i;
        if (this.s) {
            byte b = 0;
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(bb2.V).setListener(new gf4((byte) 13, this, z));
            int i2 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i2 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i2];
                if (view instanceof m57) {
                    m57 m57Var = (m57) view;
                    if (m57Var.a == 0) {
                        m57Var.k();
                        break;
                    }
                }
                i2++;
            }
            ks1 ks1Var = (ks1) this;
            zu1 zu1Var = ks1Var.I;
            ou1 ou1Var = null;
            zu1Var.cb = null;
            zu1Var.p5();
            v47 v47Var = zu1Var.x5;
            if (v47Var != null) {
                ou1 ou1Var2 = zu1Var.D5;
                if (ou1Var2 == null) {
                    ou1Var2 = v47Var.d;
                    zu1Var.D5 = ou1Var2;
                }
                ou1 ou1Var3 = v47Var.d;
                if (ou1Var3 == null) {
                    zu1Var.D5 = null;
                } else {
                    ou1Var = ou1Var2;
                }
                if (ou1Var != null && ou1Var.m && ou1Var3 != null && ou1Var3.m) {
                    boolean z2 = true;
                    if (!ou1Var3.g) {
                        if (!ou1Var3.h) {
                            z2 = true ^ TextUtils.isEmpty(ou1Var3.i);
                        }
                        if (z2) {
                            ou1 ou1Var4 = zu1Var.x5.d;
                            zu1Var.D5 = ou1Var4;
                            ou1Var4.f = false;
                            if (zu1Var.dc == 2) {
                                zu1Var.ec(zu1Var.F5, ou1Var4);
                            }
                        }
                    }
                }
                ou1 ou1Var5 = zu1Var.D5;
                if (ou1Var5 != null) {
                    ou1Var5.f = false;
                    v47 v47Var2 = zu1Var.x5;
                    ou1Var5.b = v47Var2.e;
                    ou1Var5.c = v47Var2.f;
                    ou1Var5.f();
                    if (zu1Var.dc == 2) {
                        zu1Var.ec(zu1Var.F5, zu1Var.D5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    t47 t47Var = zu1Var.x5.b;
                    if (t47Var != null) {
                        t47Var.b(arrayList);
                    }
                    zu1Var.D6();
                }
            }
            if (zu1Var.Pb && z) {
                hl.d3(new js1(ks1Var, b), 50L);
                zu1Var.Pb = false;
            }
            Activity parentActivity = zu1Var.getParentActivity();
            i = ((e) zu1Var).classGuid;
            hl.V2(parentActivity, i);
        }
    }

    public abstract void b();

    public abstract void c(boolean z);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                m57 m57Var = (m57) view;
                if (m57Var.a == 1) {
                    m57Var.i();
                }
            }
            i++;
        }
    }
}
