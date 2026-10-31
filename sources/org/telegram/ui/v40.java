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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v40 extends org.telegram.ui.Components.sk0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ b50 M;
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

    public v40(b50 b50Var, LaunchActivity launchActivity) {
        this.M = b50Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        b50 b50Var = this.M;
        ArrayList arrayList = b50Var.h2;
        org.telegram.messenger.u3 u3Var = b50Var.R2;
        if (u3Var == null || u3Var.j() || b50Var.j2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = b50Var.R2.d.h(org.telegram.messenger.jj.C1(b50Var.r2)) >= 0;
        if (b50Var.q1()) {
            int i10 = this.F;
            this.F = i10 + 1;
            this.K = i10;
        }
        int i11 = this.F;
        this.G = i11;
        int size = arrayList.size() + i11;
        this.F = size;
        this.H = size;
        if (arrayList.size() > 0) {
            int i12 = this.F;
            this.F = i12 + 1;
            this.I = i12;
        }
        if (!arrayList.isEmpty() && b50Var.S0() && b50Var.R2.b.participants_count > org.telegram.messenger.vp.r1(b50Var.k1.a).b4) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.J = i13;
        }
        this.d = this.F;
        if (!b50Var.t1()) {
            this.F = b50Var.R2.g.size() + this.F;
        }
        this.e = this.F;
        if (b50Var.R2.j.isEmpty() || b50Var.t1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.F;
            this.f = i14;
            int size2 = b50Var.R2.j.size() + i14;
            this.F = size2;
            this.h = size2;
        }
        if (b50Var.R2.m.isEmpty() || b50Var.t1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.F;
            this.n = i15;
            int size3 = b50Var.R2.m.size() + i15;
            this.F = size3;
            this.r = size3;
        }
        if (b50Var.R2.l.isEmpty() || b50Var.t1()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i16 = this.F;
            this.s = i16;
            int size4 = b50Var.R2.l.size() + i16;
            this.F = size4;
            this.w = size4;
        }
        if (b50Var.q1()) {
            int i17 = this.F;
            this.y = i17;
            this.F = i17 + 2;
            this.D = i17 + 1;
        } else if (!b50Var.t1() && (((!org.telegram.messenger.w3.T(b50Var.Q2) || ((chat2 = b50Var.Q2) != null && chat2.megagroup)) && org.telegram.messenger.w3.B(b50Var.Q2)) || (org.telegram.messenger.w3.T(b50Var.Q2) && (chat = b50Var.Q2) != null && !chat.megagroup && org.telegram.messenger.w3.t0(chat)))) {
            int i18 = this.F;
            this.F = i18 + 1;
            this.x = i18;
        }
        int i19 = this.F;
        this.F = i19 + 1;
        this.E = i19;
    }

    @Override // s4.g0
    public final int b() {
        return this.F;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == this.E) {
            return 3;
        }
        if (i10 == this.x || i10 == this.y || i10 == this.D) {
            return 0;
        }
        if (i10 == this.I) {
            return 5;
        }
        if (i10 >= this.d && i10 < this.e) {
            return 1;
        }
        if (i10 >= this.G && i10 < this.H) {
            return 4;
        }
        if (i10 == this.J) {
            return 6;
        }
        return i10 == this.K ? 7 : 2;
    }

    @Override // s4.g0
    public final void f() {
        E();
        super.f();
    }

    @Override // s4.g0
    public final void g(int i10) {
        E();
        super.g(i10);
    }

    @Override // s4.g0
    public final void j(int i10, int i11) {
        E();
        super.j(i10, i11);
    }

    @Override // s4.g0
    public final void k(int i10, int i11) {
        E();
        super.k(i10, i11);
    }

    @Override // s4.g0
    public final void n(int i10, int i11, Object obj) {
        E();
        super.n(i10, i11, obj);
    }

    @Override // s4.g0
    public final void o(int i10, int i11) {
        E();
        super.o(i10, i11);
    }

    @Override // s4.g0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        j40 j40Var;
        Long l4;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.messenger.v3 v3Var;
        j40 j40Var2;
        b50 b50Var = this.M;
        ArrayList arrayList = b50Var.u2;
        ArrayList arrayList2 = b50Var.w2;
        ArrayList arrayList3 = b50Var.h2;
        ArrayList arrayList4 = b50Var.v2;
        int i11 = c1Var.f;
        View view = c1Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i11 == 0) {
            org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
            if (i10 == this.y) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, b50Var.I0);
                b4Var.a(w02, w02);
                b4Var.b(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131743451, null), true);
                return;
            } else {
                if (i10 == this.D) {
                    int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, b50Var.I0);
                    b4Var.a(w03, w03);
                    b4Var.b(R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131743446, null), false);
                    return;
                }
                int S0 = org.telegram.messenger.i0.S0(b50Var.F1.getTag() != null ? 1.0f : 0.0f, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ch, false));
                b4Var.a(S0, S0);
                if (!org.telegram.messenger.w3.T(b50Var.Q2) || (chat = b50Var.Q2) == null || chat.megagroup || !org.telegram.messenger.w3.t0(chat)) {
                    b4Var.b(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131743399, null), false);
                    return;
                } else {
                    b4Var.b(R.drawable.msg_link, org.telegram.messenger.cd.L0(2131743362, null), false);
                    return;
                }
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            int i12 = i10 - this.d;
            if (b50Var.j2) {
                if (i12 >= 0 && i12 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i12);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            } else {
                if (i12 >= 0 && i12 < b50Var.R2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) b50Var.R2.g.get(i12);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            }
            if (groupCallParticipant2 != null) {
                long C1 = org.telegram.messenger.jj.C1(groupCallParticipant2.peer);
                long C12 = org.telegram.messenger.jj.C1(b50Var.r2);
                if (C1 == C12 && (j40Var = b50Var.Z3) != null) {
                    fileLocation = j40Var.c;
                }
                TLRPC.FileLocation fileLocation2 = fileLocation;
                float f7 = fileLocation2 != null ? b50Var.Z3.a : 1.0f;
                boolean z13 = h4Var.getParticipant() != null && org.telegram.messenger.jj.C1(h4Var.getParticipant().peer) == C1;
                h4Var.e(b50Var.k1, groupCallParticipant2, b50Var.R2, C12, fileLocation2, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.d4 d4Var = h4Var.y;
                d4Var.setProgress(f7);
                if (f7 < 1.0f) {
                    org.telegram.messenger.i0.Y3(d4Var, true, 1.0f, true, z14);
                    return;
                } else {
                    org.telegram.messenger.i0.Y3(d4Var, false, 1.0f, true, z14);
                    return;
                }
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
            org.telegram.messenger.v3 participant = kVar.getParticipant();
            int i13 = i10 - this.G;
            kVar.a = b50Var.j1.i(i10);
            if (b50Var.j2) {
                if (i13 >= 0 && i13 < arrayList4.size()) {
                    v3Var = (org.telegram.messenger.v3) arrayList4.get(i13);
                }
                v3Var = null;
            } else {
                if (i13 >= 0 && i13 < arrayList3.size()) {
                    v3Var = (org.telegram.messenger.v3) arrayList3.get(i13);
                }
                v3Var = null;
            }
            if (v3Var != null) {
                if (org.telegram.messenger.jj.C1(v3Var.a.peer) == org.telegram.messenger.jj.C1(b50Var.r2) && (j40Var2 = b50Var.Z3) != null) {
                    fileLocation = j40Var2.c;
                }
                if (fileLocation != null) {
                    float f10 = b50Var.Z3.a;
                }
                if (kVar.getParticipant() != null) {
                    kVar.getParticipant().equals(v3Var);
                }
                kVar.d = v3Var;
            }
            if (participant == null || participant.equals(v3Var) || !kVar.e || kVar.getRenderer() == null) {
                return;
            }
            b50.J0(b50Var, kVar, false);
            b50.J0(b50Var, kVar, true);
            return;
        }
        org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
        int i14 = i10 - this.f;
        int i15 = i10 - this.n;
        if (i15 < 0 || i15 >= b50Var.R2.m.size()) {
            int i16 = i10 - this.s;
            if (i16 < 0 || i16 >= b50Var.R2.l.size()) {
                if (b50Var.j2) {
                    if (i14 >= 0 && i14 < arrayList2.size()) {
                        l4 = (Long) arrayList2.get(i14);
                        z11 = false;
                        z12 = false;
                    }
                } else if (i14 >= 0 && i14 < b50Var.R2.j.size()) {
                    l4 = (Long) b50Var.R2.j.get(i14);
                    org.telegram.messenger.t3 t3Var = (org.telegram.messenger.t3) b50Var.R2.k.get(l4);
                    z10 = t3Var != null && t3Var.a();
                    z11 = false;
                    z12 = false;
                }
                z11 = false;
                z12 = false;
                z10 = false;
                l4 = null;
            } else {
                l4 = (Long) b50Var.R2.l.get(i10 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l4 == null) {
                int i17 = b50Var.a;
                org.telegram.ui.ActionBar.u5 u5Var = a4Var.c;
                org.telegram.ui.ActionBar.u5 u5Var2 = a4Var.b;
                org.telegram.ui.Components.g9 g9Var = a4Var.a;
                org.telegram.ui.Components.r8 r8Var = a4Var.e;
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i17).Z1(l4);
                a4Var.f = Z1;
                if (Z1 == null) {
                    r8Var.g(21);
                } else {
                    r8Var.r(Z1);
                }
                u5Var2.l(org.telegram.messenger.h20.p(a4Var.f), false);
                g9Var.getImageReceiver().d = i17;
                g9Var.e(a4Var.f, r8Var);
                u5Var.l(org.telegram.messenger.cd.L0(z12 ? 2131745481 : z11 ? 2131745482 : z10 ? 2131751824 : 2131749115, null), false);
                float f11 = 0.5f;
                g9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                u5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f11 = 1.0f;
                }
                u5Var.setAlpha(f11);
                ImageView imageView = a4Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l4 = (Long) b50Var.R2.m.get(i10 - this.n);
        z11 = true;
        z12 = false;
        z10 = z12;
        if (l4 == null) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        b50 b50Var = this.M;
        org.telegram.messenger.c cVar = b50Var.k1;
        Context context = this.c;
        if (i10 == 0) {
            r40 r40Var = new r40(context);
            r40Var.h = 67;
            r40Var.n = 18;
            Paint paint = new Paint();
            r40Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            r40Var.e = 23;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            r40Var.a = u5Var;
            org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
            u5Var.setTextSize(16);
            u5Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            u5Var.setImportantForAccessibility(2);
            r40Var.addView(u5Var);
            org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
            r40Var.b = u5Var2;
            org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.I6, null);
            u5Var2.setTextSize(16);
            u5Var2.setGravity(org.telegram.messenger.cd.X ? 3 : 5);
            u5Var2.setImportantForAccessibility(2);
            r40Var.addView(u5Var2);
            ImageView imageView = new ImageView(context);
            r40Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, null, PorterDuff.Mode.MULTIPLY);
            r40Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            r40Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            r40Var.addView(imageView2);
            r40Var.setFocusable(true);
            view = r40Var;
        } else if (i10 == 1) {
            view = new s40(this, context);
        } else if (i10 == 2) {
            t40 t40Var = new t40(context);
            t40Var.n = org.telegram.ui.ActionBar.t6.fh;
            Paint paint2 = new Paint();
            t40Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            t40Var.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            t40Var.a = g9Var;
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
            boolean z10 = org.telegram.messenger.cd.X;
            t40Var.addView(g9Var, w7.b6.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
            t40Var.b = u5Var3;
            org.telegram.ui.ActionBar.a7.Y(u5Var3, org.telegram.ui.ActionBar.t6.bh, null);
            u5Var3.setTypeface(org.telegram.messenger.i0.o());
            u5Var3.setTextSize(16);
            u5Var3.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            boolean z11 = org.telegram.messenger.cd.X;
            t40Var.addView(u5Var3, w7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.u5 u5Var4 = new org.telegram.ui.ActionBar.u5(context);
            t40Var.c = u5Var4;
            u5Var4.setTextSize(15);
            u5Var4.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
            u5Var4.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, t40Var.n, false));
            u5Var4.l(org.telegram.messenger.cd.L0(2131749115, null), false);
            boolean z12 = org.telegram.messenger.cd.X;
            t40Var.addView(u5Var4, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            t40Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, org.telegram.messenger.i0.L(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, t40Var.n, false), PorterDuff.Mode.MULTIPLY));
            t40Var.addView(imageView3, w7.b6.d(48, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            t40Var.setWillNotDraw(false);
            t40Var.setFocusable(true);
            view = t40Var;
        } else if (i10 == 4) {
            view = new u40(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.bn(context, 11);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(10.0f));
            if (org.telegram.messenger.w3.W(b50Var.Q2)) {
                textView.setText(org.telegram.messenger.cd.a0(null, null, 2131743475, org.telegram.messenger.cd.G(org.telegram.messenger.vp.r1(cVar.a).b4, "Participants", new Object[0])));
                view = textView;
            } else {
                textView.setText(org.telegram.messenger.cd.a0(null, null, 2131743251, org.telegram.messenger.cd.G(org.telegram.messenger.vp.r1(cVar.a).b4, "Members", new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (b50Var.g2 == null) {
                b50Var.g2 = new g.b();
            }
            view = new bi.t0(context, b50Var.g2);
        }
        return sc.e.o(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        y30 y30Var = this.M.F1;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            int i11 = y30Var.getTag() != null ? org.telegram.ui.ActionBar.t6.fh : org.telegram.ui.ActionBar.t6.ah;
            h4Var.f(i11, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            h4Var.setDrawDivider(c1Var.b() != this.F - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
            int i12 = y30Var.getTag() != null ? org.telegram.ui.ActionBar.t6.fh : org.telegram.ui.ActionBar.t6.ah;
            a4Var.a(i12, org.telegram.ui.ActionBar.t6.x0(null, i12, false));
            a4Var.setDrawDivider(c1Var.b() != this.F - 2);
        }
    }
}
