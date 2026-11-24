// default package

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class r7b extends ka {
    public final Context d;
    public final ylb e;
    public final o7b f;
    public r59 h;
    public final /* synthetic */ v7b n;

    public r7b(v7b v7bVar, Context context, ylb ylbVar, o7b o7bVar, s48 s48Var) {
        this.n = v7bVar;
        this.d = context;
        this.e = ylbVar;
        this.f = o7bVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 3 && this.n.a0.z1) || i == 7 || i == 9 || i == 10;
    }

    @Override // y59
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // y59
    public final int d(int i) {
        ArrayList arrayList = this.n.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return -1;
        }
        return ((k7b) arrayList.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        v7b v7bVar = this.n;
        a8b a8bVar = v7bVar.a0;
        ArrayList arrayList = v7bVar.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        k7b k7bVar = (k7b) arrayList.get(i);
        int i4 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        int i5 = i + 1;
        k7b k7bVar2 = i5 < arrayList.size() ? (k7b) arrayList.get(i5) : null;
        boolean z2 = k7bVar2 != null && ((i3 = k7bVar2.a) == i4 || (i3 == 9 && k7bVar2.q == 1));
        if (i4 == 3) {
            z7b z7bVar = (z7b) view;
            boolean z3 = k7bVar.n;
            z7bVar.d(z3, !z3);
            byte b = k7bVar.i;
            float f = 1.0f;
            if (b > 0) {
                z7bVar.e(b, k7bVar.j, k7bVar.g);
                z7bVar.b(false, 1.0f);
            } else {
                TLRPC.User user = k7bVar.g;
                if (user != null) {
                    z7bVar.setUser(user);
                    if (k7bVar.l && !k7bVar.k) {
                        f = 0.5f;
                    }
                    z7bVar.b(false, f);
                } else {
                    TLRPC.Chat chat = k7bVar.h;
                    if (chat != null) {
                        int i6 = a8b.X1;
                        z7bVar.a(a8bVar.J0(chat), chat);
                    }
                }
            }
            if (!k7bVar.k && !k7bVar.l) {
                z = false;
            }
            z7bVar.c(z, false);
            z7bVar.setDivider(z2);
            z7bVar.setRedCheckbox(k7bVar.m);
            z7bVar.w = a8bVar.z1;
            return;
        }
        if (i4 != 2) {
            if (i4 == 0) {
                view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                return;
            }
            if (i4 == -1) {
                if (k7bVar.o > 0) {
                    r59 r59Var = this.h;
                    i2 = Math.max(((r59Var == null || r59Var.getMeasuredHeight() <= 0) ? gm.q.y : this.h.getMeasuredHeight() + v7bVar.U) - k7bVar.o, gm.L(120.0f));
                    view.setTag(33);
                } else {
                    i2 = k7bVar.p;
                    if (i2 >= 0) {
                        view.setTag(null);
                    } else {
                        i2 = (int) (gm.q.y * 0.3f);
                        view.setTag(33);
                    }
                }
                view.setLayoutParams(new g69(-1, i2));
                return;
            }
            if (i4 == 1) {
                view.setLayoutParams(new g69(-1, Math.min(gm.L(150.0f), this.f.L)));
                return;
            }
            if (i4 == 4) {
                j7b j7bVar = (j7b) view;
                CharSequence charSequence = k7bVar.e;
                CharSequence charSequence2 = k7bVar.f;
                j7bVar.a.setText(charSequence);
                j7bVar.b.setText(charSequence2);
                return;
            }
            if (i4 == 11) {
                j7b j7bVar2 = (j7b) view;
                j7bVar2.a.setText(k7bVar.e);
                j7bVar2.b.setText((CharSequence) null);
                return;
            }
            if (i4 == 5) {
                try {
                    ((a1b) view).b.getImageReceiver().w0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i4 == 6) {
                njb njbVar = (njb) view;
                if (k7bVar.e == null) {
                    njbVar.setFixedSize(12);
                    njbVar.setText(null);
                    return;
                } else {
                    njbVar.setFixedSize(0);
                    njbVar.setText(k7bVar.e);
                    return;
                }
            }
            if (i4 == 7) {
                byte b2 = k7bVar.c;
                if (b2 == 0) {
                    ((xib) view).l(k7bVar.e, a8bVar.w1, z2);
                    return;
                } else if (b2 == 1) {
                    ((xib) view).l(k7bVar.e, a8bVar.x1, z2);
                    return;
                } else {
                    if (b2 == 2) {
                        ((xib) view).l(k7bVar.e, a8bVar.v1, z2);
                        return;
                    }
                    return;
                }
            }
            if (i4 == 9) {
                BitmapDrawable bitmapDrawable = k7bVar.d;
                if (bitmapDrawable != null) {
                    ((xib) view).v(k7bVar.e, bitmapDrawable, z2);
                    return;
                } else {
                    ((xib) view).q(k7bVar.e, k7bVar.f, false, z2);
                    return;
                }
            }
            if (i4 == 8) {
                ((jf5) view).setText(k7bVar.e);
                return;
            }
            if (i4 == 10) {
                int i7 = a8b.X1;
                int f2 = (int) oc7.r1(a8bVar.a).l4.H1.f();
                int[] a = jla.a(new int[]{0, 1, 10, 50, 100, nm7.d3, nm7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                int j = Utilities.j(a8bVar.B1, f2, 0);
                c1b c1bVar = new c1b((byte) 2);
                ila ilaVar = new ila();
                ilaVar.c = a;
                ilaVar.d = (byte) 20;
                ilaVar.e = c1bVar;
                ((jla) view).d(j, ilaVar, new eg9(this, (byte) 17));
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View xibVar;
        View view;
        Context context = this.d;
        if (i == -1) {
            view = new u7b(context);
        } else if (i == 0) {
            View view2 = new View(context);
            view2.setTag(35);
            view = view2;
        } else if (i == 1) {
            View view3 = new View(context);
            view3.setTag(34);
            view = view3;
        } else {
            ylb ylbVar = this.e;
            if (i == 3) {
                view = new z7b(context, ylbVar);
            } else if (i == 4) {
                view = new j7b(ylbVar, context, true);
            } else if (i == 11) {
                view = new j7b(ylbVar, context, false);
            } else if (i == 8) {
                View jf5Var = new jf5(context, ylbVar);
                anb.h(cmb.g5, ylbVar, jf5Var);
                view = jf5Var;
            } else if (i == 5) {
                a1b a1bVar = new a1b(context, null, 1, ylbVar);
                a1bVar.d.setText(jb6.M0(2131747901, null));
                a1bVar.e.setText(jb6.M0(2131745541, null));
                a1bVar.a.setTranslationY(gm.L(24.0f));
                view = a1bVar;
            } else if (i == 6) {
                View njbVar = new njb(context, ylbVar);
                njbVar.setBackgroundColor(-15921907);
                view = njbVar;
            } else {
                if (i == 7) {
                    xibVar = new xib(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    xibVar = new xib(23, this.e, this.d, true, false);
                } else {
                    view = i == 10 ? new jla(context, ylbVar) : new o72(context, (byte) 26);
                }
                view = xibVar;
            }
        }
        return new b59(view);
    }
}
