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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.Components.pj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final /* synthetic */ e40 M;
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

    public y30(e40 e40Var, LaunchActivity launchActivity) {
        this.M = e40Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        e40 e40Var = this.M;
        ArrayList arrayList = e40Var.h2;
        org.telegram.messenger.r3 r3Var = e40Var.R2;
        if (r3Var == null || r3Var.j() || e40Var.j2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.F = 0;
        this.L = e40Var.R2.d.h(org.telegram.messenger.ij.B1(e40Var.r2)) >= 0;
        if (e40Var.r1()) {
            int i7 = this.F;
            this.F = i7 + 1;
            this.K = i7;
        }
        int i10 = this.F;
        this.G = i10;
        int size = arrayList.size() + i10;
        this.F = size;
        this.H = size;
        if (arrayList.size() > 0) {
            int i11 = this.F;
            this.F = i11 + 1;
            this.I = i11;
        }
        if (!arrayList.isEmpty() && e40Var.S0() && e40Var.R2.b.participants_count > org.telegram.messenger.qp.s1(e40Var.k1.a).Z3) {
            int i12 = this.F;
            this.F = i12 + 1;
            this.J = i12;
        }
        this.d = this.F;
        if (!e40Var.u1()) {
            this.F = e40Var.R2.g.size() + this.F;
        }
        this.e = this.F;
        if (e40Var.R2.j.isEmpty() || e40Var.u1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i13 = this.F;
            this.f = i13;
            int size2 = e40Var.R2.j.size() + i13;
            this.F = size2;
            this.h = size2;
        }
        if (e40Var.R2.m.isEmpty() || e40Var.u1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.F;
            this.n = i14;
            int size3 = e40Var.R2.m.size() + i14;
            this.F = size3;
            this.r = size3;
        }
        if (e40Var.R2.l.isEmpty() || e40Var.u1()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i15 = this.F;
            this.s = i15;
            int size4 = e40Var.R2.l.size() + i15;
            this.F = size4;
            this.w = size4;
        }
        if (e40Var.r1()) {
            int i16 = this.F;
            this.y = i16;
            this.F = i16 + 2;
            this.D = i16 + 1;
        } else if (!e40Var.u1() && (((!org.telegram.messenger.t3.T(e40Var.Q2) || ((chat2 = e40Var.Q2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(e40Var.Q2)) || (org.telegram.messenger.t3.T(e40Var.Q2) && (chat = e40Var.Q2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
            int i17 = this.F;
            this.F = i17 + 1;
            this.x = i17;
        }
        int i18 = this.F;
        this.F = i18 + 1;
        this.E = i18;
    }

    @Override // v4.g0
    public final int b() {
        return this.F;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == this.E) {
            return 3;
        }
        if (i7 == this.x || i7 == this.y || i7 == this.D) {
            return 0;
        }
        if (i7 == this.I) {
            return 5;
        }
        if (i7 >= this.d && i7 < this.e) {
            return 1;
        }
        if (i7 >= this.G && i7 < this.H) {
            return 4;
        }
        if (i7 == this.J) {
            return 6;
        }
        return i7 == this.K ? 7 : 2;
    }

    @Override // v4.g0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.g0
    public final void g(int i7) {
        E();
        super.g(i7);
    }

    @Override // v4.g0
    public final void j(int i7, int i10) {
        E();
        super.j(i7, i10);
    }

    @Override // v4.g0
    public final void k(int i7, int i10) {
        E();
        super.k(i7, i10);
    }

    @Override // v4.g0
    public final void n(int i7, int i10, Object obj) {
        E();
        super.n(i7, i10, obj);
    }

    @Override // v4.g0
    public final void o(int i7, int i10) {
        E();
        super.o(i7, i10);
    }

    @Override // v4.g0
    public final void p(int i7, int i10) {
        E();
        super.p(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        n30 n30Var;
        Long l10;
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.messenger.s3 s3Var;
        n30 n30Var2;
        e40 e40Var = this.M;
        ArrayList arrayList = e40Var.u2;
        ArrayList arrayList2 = e40Var.w2;
        ArrayList arrayList3 = e40Var.h2;
        ArrayList arrayList4 = e40Var.v2;
        int i10 = d1Var.f;
        View view = d1Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i7 == this.y) {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.v6, e40Var.I0);
                z3Var.a(w02, w02);
                z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131743425, null), true);
                return;
            } else {
                if (i7 == this.D) {
                    int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.v6, e40Var.I0);
                    z3Var.a(w03, w03);
                    z3Var.b(R.drawable.msg_link2, org.telegram.messenger.id.M0(2131743420, null), false);
                    return;
                }
                int S0 = org.telegram.messenger.g0.S0(e40Var.F1.getTag() != null ? 1.0f : 0.0f, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.ch, false));
                z3Var.a(S0, S0);
                if (!org.telegram.messenger.t3.T(e40Var.Q2) || (chat = e40Var.Q2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)) {
                    z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131743373, null), false);
                    return;
                } else {
                    z3Var.b(R.drawable.msg_link, org.telegram.messenger.id.M0(2131743336, null), false);
                    return;
                }
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i11 = i7 - this.d;
            if (e40Var.j2) {
                if (i11 >= 0 && i11 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            } else {
                if (i11 >= 0 && i11 < e40Var.R2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.R2.g.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            }
            if (groupCallParticipant2 != null) {
                long B1 = org.telegram.messenger.ij.B1(groupCallParticipant2.peer);
                long B12 = org.telegram.messenger.ij.B1(e40Var.r2);
                if (B1 == B12 && (n30Var = e40Var.Z3) != null) {
                    fileLocation = n30Var.c;
                }
                TLRPC.FileLocation fileLocation2 = fileLocation;
                float f10 = fileLocation2 != null ? e40Var.Z3.a : 1.0f;
                boolean z12 = f4Var.getParticipant() != null && org.telegram.messenger.ij.B1(f4Var.getParticipant().peer) == B1;
                f4Var.e(e40Var.k1, groupCallParticipant2, e40Var.R2, B12, fileLocation2, z12);
                boolean z13 = z12;
                org.telegram.ui.Cells.b4 b4Var = f4Var.y;
                b4Var.setProgress(f10);
                if (f10 < 1.0f) {
                    org.telegram.messenger.g0.Z3(b4Var, true, 1.0f, true, z13);
                    return;
                } else {
                    org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, z13);
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
            org.telegram.messenger.s3 participant = rVar.getParticipant();
            int i12 = i7 - this.G;
            rVar.a = e40Var.j1.i(i7);
            if (e40Var.j2) {
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
                if (org.telegram.messenger.ij.B1(s3Var.a.peer) == org.telegram.messenger.ij.B1(e40Var.r2) && (n30Var2 = e40Var.Z3) != null) {
                    fileLocation = n30Var2.c;
                }
                if (fileLocation != null) {
                    float f11 = e40Var.Z3.a;
                }
                if (rVar.getParticipant() != null) {
                    rVar.getParticipant().equals(s3Var);
                }
                rVar.d = s3Var;
            }
            if (participant == null || participant.equals(s3Var) || !rVar.e || rVar.getRenderer() == null) {
                return;
            }
            e40.J0(e40Var, rVar, false);
            e40.J0(e40Var, rVar, true);
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        int i13 = i7 - this.f;
        int i14 = i7 - this.n;
        if (i14 < 0 || i14 >= e40Var.R2.m.size()) {
            int i15 = i7 - this.s;
            if (i15 < 0 || i15 >= e40Var.R2.l.size()) {
                if (e40Var.j2) {
                    if (i13 >= 0 && i13 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i13);
                        z10 = false;
                        z11 = false;
                    }
                } else if (i13 >= 0 && i13 < e40Var.R2.j.size()) {
                    l10 = (Long) e40Var.R2.j.get(i13);
                    org.telegram.messenger.q3 q3Var = (org.telegram.messenger.q3) e40Var.R2.k.get(l10);
                    z9 = q3Var != null && q3Var.a();
                    z10 = false;
                    z11 = false;
                }
                z10 = false;
                z11 = false;
                z9 = false;
                l10 = null;
            } else {
                l10 = (Long) e40Var.R2.l.get(i7 - this.s);
                z11 = true;
                z10 = false;
                z9 = false;
            }
            if (l10 == null) {
                int i16 = e40Var.a;
                org.telegram.ui.ActionBar.l5 l5Var = y3Var.c;
                org.telegram.ui.ActionBar.l5 l5Var2 = y3Var.b;
                org.telegram.ui.Components.l9 l9Var = y3Var.a;
                org.telegram.ui.Components.w8 w8Var = y3Var.e;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i16).a2(l10);
                y3Var.f = a22;
                if (a22 == null) {
                    w8Var.g(21);
                } else {
                    w8Var.r(a22);
                }
                l5Var2.l(org.telegram.messenger.t10.p(y3Var.f), false);
                l9Var.getImageReceiver().d = i16;
                l9Var.e(y3Var.f, w8Var);
                l5Var.l(org.telegram.messenger.id.M0(z11 ? 2131745463 : z10 ? 2131745464 : z9 ? 2131751824 : 2131749105, null), false);
                float f12 = 0.5f;
                l9Var.setAlpha((z10 || z11) ? 0.5f : 1.0f);
                l5Var2.setAlpha((z10 || z11) ? 0.5f : 1.0f);
                if (!z10 && !z11) {
                    f12 = 1.0f;
                }
                l5Var.setAlpha(f12);
                ImageView imageView = y3Var.d;
                if (!z10 && !z11) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l10 = (Long) e40Var.R2.m.get(i7 - this.n);
        z10 = true;
        z11 = false;
        z9 = z11;
        if (l10 == null) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        e40 e40Var = this.M;
        org.telegram.messenger.c cVar = e40Var.k1;
        Context context = this.c;
        if (i7 == 0) {
            u30 u30Var = new u30(context);
            u30Var.h = 67;
            u30Var.n = 18;
            Paint paint = new Paint();
            u30Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
            u30Var.e = 23;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
            u30Var.a = l5Var;
            org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
            l5Var.setTextSize(16);
            l5Var.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            l5Var.setImportantForAccessibility(2);
            u30Var.addView(l5Var);
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
            u30Var.b = l5Var2;
            org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.I6, null);
            l5Var2.setTextSize(16);
            l5Var2.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
            l5Var2.setImportantForAccessibility(2);
            u30Var.addView(l5Var2);
            ImageView imageView = new ImageView(context);
            u30Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, null, PorterDuff.Mode.MULTIPLY);
            u30Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            u30Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            u30Var.addView(imageView2);
            u30Var.setFocusable(true);
            view = u30Var;
        } else if (i7 == 1) {
            view = new v30(this, context);
        } else if (i7 == 2) {
            w30 w30Var = new w30(context);
            w30Var.n = org.telegram.ui.ActionBar.l6.fh;
            Paint paint2 = new Paint();
            w30Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
            w30Var.e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            w30Var.a = l9Var;
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            boolean z9 = org.telegram.messenger.id.a0;
            w30Var.addView(l9Var, c8.ha.d(46, 46.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 11.0f, 6.0f, z9 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
            w30Var.b = l5Var3;
            org.telegram.ui.ActionBar.s6.X(l5Var3, org.telegram.ui.ActionBar.l6.bh, null);
            l5Var3.setTypeface(org.telegram.messenger.g0.o());
            l5Var3.setTextSize(16);
            l5Var3.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            boolean z10 = org.telegram.messenger.id.a0;
            w30Var.addView(l5Var3, c8.ha.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 54.0f : 67.0f, 10.0f, z10 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.l5 l5Var4 = new org.telegram.ui.ActionBar.l5(context);
            w30Var.c = l5Var4;
            l5Var4.setTextSize(15);
            l5Var4.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            l5Var4.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, w30Var.n, false));
            l5Var4.l(org.telegram.messenger.id.M0(2131749105, null), false);
            boolean z11 = org.telegram.messenger.id.a0;
            w30Var.addView(l5Var4, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 32.0f, z11 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            w30Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, w30Var.n, false), PorterDuff.Mode.MULTIPLY));
            w30Var.addView(imageView3, c8.ha.d(48, -1.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            w30Var.setWillNotDraw(false);
            w30Var.setFocusable(true);
            view = w30Var;
        } else if (i7 == 4) {
            view = new x30(this, context);
        } else if (i7 == 5) {
            view = new org.telegram.ui.Components.tm(context, 14);
        } else if (i7 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
            if (org.telegram.messenger.t3.W(e40Var.Q2)) {
                textView.setText(org.telegram.messenger.id.a0(null, null, 2131743449, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.a).Z3, "Participants", new Object[0])));
                view = textView;
            } else {
                textView.setText(org.telegram.messenger.id.a0(null, null, 2131743225, org.telegram.messenger.id.G(org.telegram.messenger.qp.s1(cVar.a).Z3, "Members", new Object[0])));
                view = textView;
            }
        } else if (i7 != 7) {
            view = new View(context);
        } else {
            if (e40Var.g2 == null) {
                e40Var.g2 = new g.b();
            }
            view = new n00(context, e40Var.g2);
        }
        return jg.g.r(view, view, -1, -2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        b30 b30Var = this.M.F1;
        int i7 = d1Var.f;
        View view = d1Var.a;
        if (i7 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i10 = b30Var.getTag() != null ? org.telegram.ui.ActionBar.l6.fh : org.telegram.ui.ActionBar.l6.ah;
            f4Var.f(i10, org.telegram.ui.ActionBar.l6.x0(null, i10, false));
            f4Var.setDrawDivider(d1Var.b() != this.F - 2);
            return;
        }
        if (i7 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            int i11 = b30Var.getTag() != null ? org.telegram.ui.ActionBar.l6.fh : org.telegram.ui.ActionBar.l6.ah;
            y3Var.a(i11, org.telegram.ui.ActionBar.l6.x0(null, i11, false));
            y3Var.setDrawDivider(d1Var.b() != this.F - 2);
        }
    }
}
