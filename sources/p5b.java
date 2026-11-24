// default package

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class p5b extends ka {
    public final Context d;
    public final wjb e;
    public final n5b f;
    public o39 h;
    public final /* synthetic */ t5b n;

    public p5b(t5b t5bVar, Context context, wjb wjbVar, n5b n5bVar, p28 p28Var) {
        this.n = t5bVar;
        this.d = context;
        this.e = wjbVar;
        this.f = n5bVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 3 && this.n.a0.z1) || i == 7 || i == 9 || i == 10;
    }

    @Override // w39
    public final int b() {
        ArrayList arrayList = this.n.M;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // w39
    public final int d(int i) {
        ArrayList arrayList = this.n.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return -1;
        }
        return ((j5b) arrayList.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        t5b t5bVar = this.n;
        y5b y5bVar = t5bVar.a0;
        ArrayList arrayList = t5bVar.M;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        j5b j5bVar = (j5b) arrayList.get(i);
        int i4 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        int i5 = i + 1;
        j5b j5bVar2 = i5 < arrayList.size() ? (j5b) arrayList.get(i5) : null;
        boolean z2 = j5bVar2 != null && ((i3 = j5bVar2.a) == i4 || (i3 == 9 && j5bVar2.q == 1));
        if (i4 == 3) {
            x5b x5bVar = (x5b) view;
            boolean z3 = j5bVar.n;
            x5bVar.d(z3, !z3);
            byte b = j5bVar.i;
            float f = 1.0f;
            if (b > 0) {
                x5bVar.e(b, j5bVar.j, j5bVar.g);
                x5bVar.b(false, 1.0f);
            } else {
                TLRPC.User user = j5bVar.g;
                if (user != null) {
                    x5bVar.setUser(user);
                    if (j5bVar.l && !j5bVar.k) {
                        f = 0.5f;
                    }
                    x5bVar.b(false, f);
                } else {
                    TLRPC.Chat chat = j5bVar.h;
                    if (chat != null) {
                        int i6 = y5b.X1;
                        x5bVar.a(y5bVar.J0(chat), chat);
                    }
                }
            }
            if (!j5bVar.k && !j5bVar.l) {
                z = false;
            }
            x5bVar.c(z, false);
            x5bVar.setDivider(z2);
            x5bVar.setRedCheckbox(j5bVar.m);
            x5bVar.w = y5bVar.z1;
            return;
        }
        if (i4 != 2) {
            if (i4 == 0) {
                view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                return;
            }
            if (i4 == -1) {
                if (j5bVar.o > 0) {
                    o39 o39Var = this.h;
                    i2 = Math.max(((o39Var == null || o39Var.getMeasuredHeight() <= 0) ? gl.q.y : this.h.getMeasuredHeight() + t5bVar.U) - j5bVar.o, gl.L(120.0f));
                    view.setTag(33);
                } else {
                    i2 = j5bVar.p;
                    if (i2 >= 0) {
                        view.setTag(null);
                    } else {
                        i2 = (int) (gl.q.y * 0.3f);
                        view.setTag(33);
                    }
                }
                view.setLayoutParams(new e49(-1, i2));
                return;
            }
            if (i4 == 1) {
                view.setLayoutParams(new e49(-1, Math.min(gl.L(150.0f), this.f.L)));
                return;
            }
            if (i4 == 4) {
                i5b i5bVar = (i5b) view;
                CharSequence charSequence = j5bVar.e;
                CharSequence charSequence2 = j5bVar.f;
                i5bVar.a.setText(charSequence);
                i5bVar.b.setText(charSequence2);
                return;
            }
            if (i4 == 11) {
                i5b i5bVar2 = (i5b) view;
                i5bVar2.a.setText(j5bVar.e);
                i5bVar2.b.setText((CharSequence) null);
                return;
            }
            if (i4 == 5) {
                try {
                    ((zya) view).b.getImageReceiver().w0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i4 == 6) {
                mhb mhbVar = (mhb) view;
                if (j5bVar.e == null) {
                    mhbVar.setFixedSize(12);
                    mhbVar.setText(null);
                    return;
                } else {
                    mhbVar.setFixedSize(0);
                    mhbVar.setText(j5bVar.e);
                    return;
                }
            }
            if (i4 == 7) {
                byte b2 = j5bVar.c;
                if (b2 == 0) {
                    ((wgb) view).l(j5bVar.e, y5bVar.w1, z2);
                    return;
                } else if (b2 == 1) {
                    ((wgb) view).l(j5bVar.e, y5bVar.x1, z2);
                    return;
                } else {
                    if (b2 == 2) {
                        ((wgb) view).l(j5bVar.e, y5bVar.v1, z2);
                        return;
                    }
                    return;
                }
            }
            if (i4 == 9) {
                BitmapDrawable bitmapDrawable = j5bVar.d;
                if (bitmapDrawable != null) {
                    ((wgb) view).v(j5bVar.e, bitmapDrawable, z2);
                    return;
                } else {
                    ((wgb) view).q(j5bVar.e, j5bVar.f, false, z2);
                    return;
                }
            }
            if (i4 == 8) {
                ((ld5) view).setText(j5bVar.e);
                return;
            }
            if (i4 == 10) {
                int i7 = y5b.X1;
                int f2 = (int) na7.q1(y5bVar.a).k4.H1.f();
                int[] a = ija.a(new int[]{0, 1, 10, 50, 100, kk7.d3, kk7.Y3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, f2);
                int j = Utilities.j(y5bVar.B1, f2, 0);
                v0b v0bVar = new v0b((byte) 1);
                hja hjaVar = new hja();
                hjaVar.c = a;
                hjaVar.d = (byte) 20;
                hjaVar.e = v0bVar;
                ((ija) view).d(j, hjaVar, new ae9(this, (byte) 17));
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View wgbVar;
        View view;
        Context context = this.d;
        if (i == -1) {
            view = new s5b(context);
        } else if (i == 0) {
            View view2 = new View(context);
            view2.setTag(35);
            view = view2;
        } else if (i == 1) {
            View view3 = new View(context);
            view3.setTag(34);
            view = view3;
        } else {
            wjb wjbVar = this.e;
            if (i == 3) {
                view = new x5b(context, wjbVar);
            } else if (i == 4) {
                view = new i5b(wjbVar, context, true);
            } else if (i == 11) {
                view = new i5b(wjbVar, context, false);
            } else if (i == 8) {
                View ld5Var = new ld5(context, wjbVar);
                zkb.h(bkb.g5, wjbVar, ld5Var);
                view = ld5Var;
            } else if (i == 5) {
                zya zyaVar = new zya(context, null, 1, wjbVar);
                zyaVar.d.setText(k96.M0(2131747975, null));
                zyaVar.e.setText(k96.M0(2131745615, null));
                zyaVar.a.setTranslationY(gl.L(24.0f));
                view = zyaVar;
            } else if (i == 6) {
                View mhbVar = new mhb(context, wjbVar);
                mhbVar.setBackgroundColor(-15921907);
                view = mhbVar;
            } else {
                if (i == 7) {
                    wgbVar = new wgb(23, this.e, this.d, true, true);
                } else if (i == 9) {
                    wgbVar = new wgb(23, this.e, this.d, true, false);
                } else {
                    view = i == 10 ? new ija(context, wjbVar) : new d62(context, (byte) 26);
                }
                view = wgbVar;
            }
        }
        return new y29(view);
    }
}
