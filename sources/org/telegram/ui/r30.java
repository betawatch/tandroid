package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.Components.sj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ x30 N;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public r30(x30 x30Var, LaunchActivity launchActivity) {
        this.N = x30Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        x30 x30Var = this.N;
        ArrayList arrayList = x30Var.i2;
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var == null || r3Var.j() || x30Var.k2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = x30Var.S2.d.h(org.telegram.messenger.zi.C1(x30Var.s2)) >= 0;
        if (x30Var.q1()) {
            int i3 = this.G;
            this.G = i3 + 1;
            this.L = i3;
        }
        int i10 = this.G;
        this.H = i10;
        int size = arrayList.size() + i10;
        this.G = size;
        this.I = size;
        if (arrayList.size() > 0) {
            int i11 = this.G;
            this.G = i11 + 1;
            this.J = i11;
        }
        if (!arrayList.isEmpty() && x30Var.S0() && x30Var.S2.b.participants_count > org.telegram.messenger.hp.s1(x30Var.l1.a).a4) {
            int i12 = this.G;
            this.G = i12 + 1;
            this.K = i12;
        }
        this.d = this.G;
        if (!x30Var.t1()) {
            this.G = x30Var.S2.g.size() + this.G;
        }
        this.e = this.G;
        if (x30Var.S2.j.isEmpty() || x30Var.t1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i13 = this.G;
            this.f = i13;
            int size2 = x30Var.S2.j.size() + i13;
            this.G = size2;
            this.h = size2;
        }
        if (x30Var.S2.m.isEmpty() || x30Var.t1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.G;
            this.n = i14;
            int size3 = x30Var.S2.m.size() + i14;
            this.G = size3;
            this.r = size3;
        }
        if (x30Var.S2.l.isEmpty() || x30Var.t1()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i15 = this.G;
            this.s = i15;
            int size4 = x30Var.S2.l.size() + i15;
            this.G = size4;
            this.w = size4;
        }
        if (x30Var.q1()) {
            int i16 = this.G;
            this.y = i16;
            this.G = i16 + 2;
            this.E = i16 + 1;
        } else if (!x30Var.t1() && (((!org.telegram.messenger.t3.T(x30Var.R2) || ((chat2 = x30Var.R2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(x30Var.R2)) || (org.telegram.messenger.t3.T(x30Var.R2) && (chat = x30Var.R2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
            int i17 = this.G;
            this.G = i17 + 1;
            this.x = i17;
        }
        int i18 = this.G;
        this.G = i18 + 1;
        this.F = i18;
    }

    @Override // u4.h0
    public final int b() {
        return this.G;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == this.F) {
            return 3;
        }
        if (i3 == this.x || i3 == this.y || i3 == this.E) {
            return 0;
        }
        if (i3 == this.J) {
            return 5;
        }
        if (i3 >= this.d && i3 < this.e) {
            return 1;
        }
        if (i3 >= this.H && i3 < this.I) {
            return 4;
        }
        if (i3 == this.K) {
            return 6;
        }
        return i3 == this.L ? 7 : 2;
    }

    @Override // u4.h0
    public final void f() {
        E();
        super.f();
    }

    @Override // u4.h0
    public final void g(int i3) {
        E();
        super.g(i3);
    }

    @Override // u4.h0
    public final void j(int i3, int i10) {
        E();
        super.j(i3, i10);
    }

    @Override // u4.h0
    public final void k(int i3, int i10) {
        E();
        super.k(i3, i10);
    }

    @Override // u4.h0
    public final void n(int i3, int i10, Object obj) {
        E();
        super.n(i3, i10, obj);
    }

    @Override // u4.h0
    public final void o(int i3, int i10) {
        E();
        super.o(i3, i10);
    }

    @Override // u4.h0
    public final void p(int i3, int i10) {
        E();
        super.p(i3, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        g30 g30Var;
        Long l10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.messenger.s3 s3Var;
        g30 g30Var2;
        x30 x30Var = this.N;
        ArrayList arrayList = x30Var.v2;
        ArrayList arrayList2 = x30Var.x2;
        ArrayList arrayList3 = x30Var.i2;
        ArrayList arrayList4 = x30Var.w2;
        int i10 = d1Var.f;
        View view = d1Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i3 == this.y) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, x30Var.J0);
                z3Var.a(w02, w02);
                z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131743435, null), true);
                return;
            } else {
                if (i3 == this.E) {
                    int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, x30Var.J0);
                    z3Var.a(w03, w03);
                    z3Var.b(R.drawable.msg_link2, org.telegram.messenger.bd.M0(2131743430, null), false);
                    return;
                }
                int S0 = org.telegram.messenger.g0.S0(x30Var.G1.getTag() != null ? 1.0f : 0.0f, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ch, false));
                z3Var.a(S0, S0);
                if (!org.telegram.messenger.t3.T(x30Var.R2) || (chat = x30Var.R2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)) {
                    z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131743383, null), false);
                    return;
                } else {
                    z3Var.b(R.drawable.msg_link, org.telegram.messenger.bd.M0(2131743346, null), false);
                    return;
                }
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i11 = i3 - this.d;
            if (x30Var.k2) {
                if (i11 >= 0 && i11 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            } else {
                if (i11 >= 0 && i11 < x30Var.S2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) x30Var.S2.g.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            }
            if (groupCallParticipant2 != null) {
                long C1 = org.telegram.messenger.zi.C1(groupCallParticipant2.peer);
                long C12 = org.telegram.messenger.zi.C1(x30Var.s2);
                if (C1 == C12 && (g30Var = x30Var.a4) != null) {
                    fileLocation = g30Var.c;
                }
                TLRPC.FileLocation fileLocation2 = fileLocation;
                float f10 = fileLocation2 != null ? x30Var.a4.a : 1.0f;
                boolean z13 = f4Var.getParticipant() != null && org.telegram.messenger.zi.C1(f4Var.getParticipant().peer) == C1;
                f4Var.e(x30Var.l1, groupCallParticipant2, x30Var.S2, C12, fileLocation2, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.b4 b4Var = f4Var.y;
                b4Var.setProgress(f10);
                if (f10 < 1.0f) {
                    org.telegram.messenger.g0.Z3(b4Var, true, 1.0f, true, z14);
                    return;
                } else {
                    org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, z14);
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
            org.telegram.messenger.s3 participant = kVar.getParticipant();
            int i12 = i3 - this.H;
            kVar.a = x30Var.k1.i(i3);
            if (x30Var.k2) {
                if (i12 >= 0 && i12 < arrayList4.size()) {
                    s3Var = (org.telegram.messenger.s3) arrayList4.get(i12);
                }
                s3Var = null;
            } else {
                if (i12 >= 0 && i12 < arrayList3.size()) {
                    s3Var = (org.telegram.messenger.s3) arrayList3.get(i12);
                }
                s3Var = null;
            }
            if (s3Var != null) {
                if (org.telegram.messenger.zi.C1(s3Var.a.peer) == org.telegram.messenger.zi.C1(x30Var.s2) && (g30Var2 = x30Var.a4) != null) {
                    fileLocation = g30Var2.c;
                }
                if (fileLocation != null) {
                    float f11 = x30Var.a4.a;
                }
                if (kVar.getParticipant() != null) {
                    kVar.getParticipant().equals(s3Var);
                }
                kVar.d = s3Var;
            }
            if (participant == null || participant.equals(s3Var) || !kVar.e || kVar.getRenderer() == null) {
                return;
            }
            x30.J0(x30Var, kVar, false);
            x30.J0(x30Var, kVar, true);
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        int i13 = i3 - this.f;
        int i14 = i3 - this.n;
        if (i14 < 0 || i14 >= x30Var.S2.m.size()) {
            int i15 = i3 - this.s;
            if (i15 < 0 || i15 >= x30Var.S2.l.size()) {
                if (x30Var.k2) {
                    if (i13 >= 0 && i13 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i13);
                        z11 = false;
                        z12 = false;
                    }
                } else if (i13 >= 0 && i13 < x30Var.S2.j.size()) {
                    l10 = (Long) x30Var.S2.j.get(i13);
                    org.telegram.messenger.q3 q3Var = (org.telegram.messenger.q3) x30Var.S2.k.get(l10);
                    z10 = q3Var != null && q3Var.a();
                    z11 = false;
                    z12 = false;
                }
                z11 = false;
                z12 = false;
                z10 = false;
                l10 = null;
            } else {
                l10 = (Long) x30Var.S2.l.get(i3 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l10 == null) {
                int i16 = x30Var.a;
                org.telegram.ui.ActionBar.k5 k5Var = y3Var.c;
                org.telegram.ui.ActionBar.k5 k5Var2 = y3Var.b;
                org.telegram.ui.Components.k9 k9Var = y3Var.a;
                org.telegram.ui.Components.u8 u8Var = y3Var.e;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i16).a2(l10);
                y3Var.f = a22;
                if (a22 == null) {
                    u8Var.g(21);
                } else {
                    u8Var.r(a22);
                }
                k5Var2.l(org.telegram.messenger.l10.p(y3Var.f), false);
                k9Var.getImageReceiver().d = i16;
                k9Var.e(y3Var.f, u8Var);
                k5Var.l(org.telegram.messenger.bd.M0(z12 ? 2131745473 : z11 ? 2131745474 : z10 ? 2131751824 : 2131749113, null), false);
                float f12 = 0.5f;
                k9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                k5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f12 = 1.0f;
                }
                k5Var.setAlpha(f12);
                ImageView imageView = y3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l10 = (Long) x30Var.S2.m.get(i3 - this.n);
        z11 = true;
        z12 = false;
        z10 = z12;
        if (l10 == null) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        x30 x30Var = this.N;
        org.telegram.messenger.c cVar = x30Var.l1;
        Context context = this.c;
        if (i3 == 0) {
            n30 n30Var = new n30(context);
            n30Var.h = 67;
            n30Var.n = 18;
            Paint paint = new Paint();
            n30Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            n30Var.e = 23;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            n30Var.a = k5Var;
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
            k5Var.setTextSize(16);
            k5Var.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
            k5Var.setImportantForAccessibility(2);
            n30Var.addView(k5Var);
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
            n30Var.b = k5Var2;
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.I6, null);
            k5Var2.setTextSize(16);
            k5Var2.setGravity(org.telegram.messenger.bd.a0 ? 3 : 5);
            k5Var2.setImportantForAccessibility(2);
            n30Var.addView(k5Var2);
            ImageView imageView = new ImageView(context);
            n30Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, null, PorterDuff.Mode.MULTIPLY);
            n30Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            n30Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            n30Var.addView(imageView2);
            n30Var.setFocusable(true);
            view = n30Var;
        } else if (i3 == 1) {
            view = new o30(this, context);
        } else if (i3 == 2) {
            p30 p30Var = new p30(context);
            p30Var.n = org.telegram.ui.ActionBar.k6.fh;
            Paint paint2 = new Paint();
            p30Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            p30Var.e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            p30Var.a = k9Var;
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            boolean z10 = org.telegram.messenger.bd.a0;
            p30Var.addView(k9Var, b8.mf.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            p30Var.b = k5Var3;
            org.telegram.ui.ActionBar.r6.Y(k5Var3, org.telegram.ui.ActionBar.k6.bh, null);
            k5Var3.setTypeface(org.telegram.messenger.g0.o());
            k5Var3.setTextSize(16);
            k5Var3.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            boolean z11 = org.telegram.messenger.bd.a0;
            p30Var.addView(k5Var3, b8.mf.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            p30Var.c = k5Var4;
            k5Var4.setTextSize(15);
            k5Var4.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
            k5Var4.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, p30Var.n, false));
            k5Var4.l(org.telegram.messenger.bd.M0(2131749113, null), false);
            boolean z12 = org.telegram.messenger.bd.a0;
            p30Var.addView(k5Var4, b8.mf.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            p30Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, p30Var.n, false), PorterDuff.Mode.MULTIPLY));
            p30Var.addView(imageView3, b8.mf.d(48, -1.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            p30Var.setWillNotDraw(false);
            p30Var.setFocusable(true);
            view = p30Var;
        } else if (i3 == 4) {
            view = new q30(this, context);
        } else if (i3 == 5) {
            view = new org.telegram.ui.Components.sm(context, 15);
        } else if (i3 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
            if (org.telegram.messenger.t3.W(x30Var.R2)) {
                textView.setText(org.telegram.messenger.bd.a0(null, null, 2131743459, org.telegram.messenger.bd.G(org.telegram.messenger.hp.s1(cVar.a).a4, "Participants", new Object[0])));
                view = textView;
            } else {
                textView.setText(org.telegram.messenger.bd.a0(null, null, 2131743235, org.telegram.messenger.bd.G(org.telegram.messenger.hp.s1(cVar.a).a4, "Members", new Object[0])));
                view = textView;
            }
        } else if (i3 != 7) {
            view = new View(context);
        } else {
            if (x30Var.h2 == null) {
                x30Var.h2 = new g.b();
            }
            view = new org.telegram.ui.Components.voip.r0(context, x30Var.h2);
        }
        return k2.p1.p(view, view, -1, -2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        u20 u20Var = this.N.G1;
        int i3 = d1Var.f;
        View view = d1Var.a;
        if (i3 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i10 = u20Var.getTag() != null ? org.telegram.ui.ActionBar.k6.fh : org.telegram.ui.ActionBar.k6.ah;
            f4Var.f(i10, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            f4Var.setDrawDivider(d1Var.b() != this.G - 2);
            return;
        }
        if (i3 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            int i11 = u20Var.getTag() != null ? org.telegram.ui.ActionBar.k6.fh : org.telegram.ui.ActionBar.k6.ah;
            y3Var.a(i11, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            y3Var.setDrawDivider(d1Var.b() != this.G - 2);
        }
    }
}
