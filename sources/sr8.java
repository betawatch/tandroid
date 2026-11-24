// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sr8 extends yi2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public bf0 g;
    public final /* synthetic */ tr8 h;

    public sr8(tr8 tr8Var, Context context, yo8 yo8Var) {
        this.h = tr8Var;
        this.e = context;
        this.g = yo8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        qr8 qr8Var = (qr8) obj;
        View view = qr8Var.b;
        if (view != null) {
            ggcVar.removeView(view);
        }
        if (qr8Var.a) {
            return;
        }
        or8 or8Var = qr8Var.c;
        if (or8Var.getImageReceiver().n0 != null) {
            Drawable t = or8Var.getImageReceiver().t();
            if (t instanceof kn) {
                ((kn) t).w(or8Var);
            }
        }
        or8Var.setRoundRadius(0);
        ggcVar.removeView(or8Var);
        or8Var.getImageReceiver().c();
    }

    @Override // qt7
    public final int b() {
        return this.c.size();
    }

    @Override // qt7
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((qr8) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // qt7
    public final CharSequence d(int i) {
        return (k(i) + 1) + "/" + this.h.getRealCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    @Override // qt7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ggc ggcVar, int i) {
        int i2;
        SparseArray sparseArray;
        boolean z;
        boolean z2;
        String str;
        Bitmap n;
        qr8 qr8Var = (qr8) this.c.get(i);
        int k = k(i);
        tr8 tr8Var = this.h;
        boolean z3 = tr8Var.j1;
        SparseArray sparseArray2 = tr8Var.e1;
        ArrayList arrayList = tr8Var.c1;
        ArrayList arrayList2 = tr8Var.b1;
        ArrayList arrayList3 = tr8Var.Y0;
        ArrayList arrayList4 = tr8Var.Z0;
        ArrayList arrayList5 = tr8Var.a1;
        ArrayList arrayList6 = tr8Var.X0;
        Context context = this.e;
        if (z3 && k == 0) {
            qr8Var.a = true;
            rr8 rr8Var = qr8Var.b;
            if (rr8Var == null) {
                rr8Var = new rr8(context);
                qr8Var.b = rr8Var;
            }
            if (rr8Var.getParent() == null) {
                ggcVar.addView(qr8Var.b);
            }
            return qr8Var;
        }
        qr8Var.a = false;
        rr8 rr8Var2 = qr8Var.b;
        if (rr8Var2 != null && rr8Var2.getParent() != null) {
            ggcVar.removeView(qr8Var.b);
        }
        if (qr8Var.c == null) {
            or8 or8Var = new or8(tr8Var, context, i, this.f);
            qr8Var.c = or8Var;
            this.d.set(i, or8Var);
        }
        if (qr8Var.c.getParent() == null) {
            ggcVar.addView(qr8Var.c);
        }
        qr8Var.c.getImageReceiver().x0 = true;
        int i3 = tr8Var.j1 ? k - 1 : k;
        if (i3 != 0) {
            i2 = k;
            sparseArray = sparseArray2;
            if (i3 >= 0 && i3 < arrayList6.size()) {
                gn5 gn5Var = (gn5) arrayList6.get(i3);
                qr8Var.c.M = gn5Var != null;
                z = arrayList5.get(i3) == null;
                gn5 gn5Var2 = (gn5) arrayList4.get(i3);
                String str2 = (gn5Var2 == null || !(gn5Var2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                String str3 = "avatar_" + tr8Var.F0;
                or8 or8Var2 = qr8Var.c;
                jbc jbcVar = (jbc) arrayList5.get(i3);
                gn5 gn5Var3 = (gn5) arrayList3.get(i3);
                gn5 gn5Var4 = (gn5) arrayList4.get(i3);
                int intValue = ((Integer) arrayList2.get(i3)).intValue();
                ImageReceiver imageReceiver = or8Var2.a;
                if (jbcVar != null) {
                    imageReceiver.g0(jbcVar);
                } else {
                    imageReceiver.Y(gn5Var, null, gn5Var3, null, gn5Var4, str2, null, intValue, null, str3, 1);
                }
                or8Var2.e();
                if (i3 >= 0) {
                }
                if (z) {
                }
                qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
                qr8Var.c.getImageReceiver().l1 = (byte) 2;
                or8 or8Var3 = qr8Var.c;
                int i4 = tr8Var.n1;
                int i5 = tr8Var.o1;
                or8Var3.s(i4, i4, i5, i5);
                qr8Var.c.setTag(Integer.valueOf(i2));
                return qr8Var;
            }
            z = false;
            if (i3 >= 0) {
            }
            if (z) {
            }
            qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
            qr8Var.c.getImageReceiver().l1 = (byte) 2;
            or8 or8Var32 = qr8Var.c;
            int i42 = tr8Var.n1;
            int i52 = tr8Var.o1;
            or8Var32.s(i42, i42, i52, i52);
            qr8Var.c.setTag(Integer.valueOf(i2));
            return qr8Var;
        }
        bf0 bf0Var = this.g;
        Drawable t = bf0Var == null ? null : bf0Var.getImageReceiver().t();
        if (t instanceof kn) {
            kn knVar = (kn) t;
            if (knVar.s()) {
                qr8Var.c.setImageDrawable(t);
                knVar.f(qr8Var.c);
                knVar.S = true;
                i2 = k;
                sparseArray = sparseArray2;
                z = false;
                if (i3 >= 0 && i3 < arrayList.size() && arrayList.get(i3) != null) {
                    z = true;
                }
                if (z) {
                    SparseArray sparseArray3 = sparseArray;
                    qr8Var.c.I = (RadialProgress2) sparseArray3.get(i3);
                    or8 or8Var4 = qr8Var.c;
                    if (or8Var4.I == null) {
                        or8Var4.I = new RadialProgress2(or8Var4, null);
                        RadialProgress2 radialProgress2 = qr8Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        qr8Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i3, qr8Var.c.I);
                    }
                    if (tr8Var.h1) {
                        tr8Var.invalidate();
                    } else {
                        tr8Var.postInvalidateOnAnimation();
                    }
                }
                qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
                qr8Var.c.getImageReceiver().l1 = (byte) 2;
                or8 or8Var322 = qr8Var.c;
                int i422 = tr8Var.n1;
                int i522 = tr8Var.o1;
                or8Var322.s(i422, i422, i522, i522);
                qr8Var.c.setTag(Integer.valueOf(i2));
                return qr8Var;
            }
        }
        if (i3 >= 0 && i3 < arrayList6.size()) {
            gn5 gn5Var5 = (gn5) arrayList6.get(i3);
            qr8Var.c.M = gn5Var5 != null;
            boolean z4 = arrayList5.get(i3) == null;
            if (!tr8Var.K0 || gn5Var5 == null) {
                z2 = z4;
            } else {
                z2 = z4;
                if (gn5Var5.p == 2) {
                    str = "avatar";
                    gn5 gn5Var6 = (gn5) arrayList4.get(i3);
                    bf0 bf0Var2 = this.g;
                    i2 = k;
                    n = (bf0Var2 == null && tr8Var.f1) ? bf0Var2.getImageReceiver().n() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(tr8Var.F0);
                    String sb2 = sb.toString();
                    if (n == null && arrayList5.get(i3) == null) {
                        or8 or8Var5 = qr8Var.c;
                        gn5 gn5Var7 = (gn5) arrayList6.get(i3);
                        gn5 gn5Var8 = (gn5) arrayList3.get(i3);
                        int intValue2 = ((Integer) arrayList2.get(i3)).intValue();
                        or8Var5.getClass();
                        or8Var5.a.Y(gn5Var7, str, gn5Var8, null, null, null, new BitmapDrawable((Resources) null, n), intValue2, null, sb2, 1);
                        or8Var5.e();
                    } else if (tr8Var.L0 == null) {
                        or8 or8Var6 = qr8Var.c;
                        jbc jbcVar2 = (jbc) arrayList5.get(i3);
                        gn5 gn5Var9 = (gn5) arrayList6.get(i3);
                        gn5 gn5Var10 = (gn5) arrayList3.get(i3);
                        gn5 gn5Var11 = tr8Var.L0;
                        int intValue3 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver2 = or8Var6.a;
                        if (jbcVar2 != null) {
                            imageReceiver2.g0(jbcVar2);
                        } else {
                            imageReceiver2.Y(gn5Var9, str, gn5Var10, null, gn5Var11, null, null, intValue3, null, sb2, 1);
                        }
                        or8Var6.e();
                    } else {
                        String str4 = (gn5Var6 == null || !(gn5Var6.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                        or8 or8Var7 = qr8Var.c;
                        jbc jbcVar3 = (jbc) arrayList5.get(i3);
                        gn5 gn5Var12 = (gn5) arrayList3.get(i3);
                        gn5 gn5Var13 = (gn5) arrayList4.get(i3);
                        int intValue4 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver3 = or8Var7.a;
                        if (jbcVar3 != null) {
                            imageReceiver3.g0(jbcVar3);
                        } else {
                            imageReceiver3.Y(gn5Var5, null, gn5Var12, null, gn5Var13, str4, null, intValue4, null, sb2, 1);
                        }
                        or8Var7.e();
                    }
                    z = z2;
                    if (i3 >= 0) {
                        z = true;
                    }
                    if (z) {
                    }
                    qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
                    qr8Var.c.getImageReceiver().l1 = (byte) 2;
                    or8 or8Var3222 = qr8Var.c;
                    int i4222 = tr8Var.n1;
                    int i5222 = tr8Var.o1;
                    or8Var3222.s(i4222, i4222, i5222, i5222);
                    qr8Var.c.setTag(Integer.valueOf(i2));
                    return qr8Var;
                }
            }
            str = null;
            gn5 gn5Var62 = (gn5) arrayList4.get(i3);
            bf0 bf0Var22 = this.g;
            i2 = k;
            if (bf0Var22 == null) {
            }
            StringBuilder sb3 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb3.append(tr8Var.F0);
            String sb22 = sb3.toString();
            if (n == null) {
            }
            if (tr8Var.L0 == null) {
            }
            z = z2;
            if (i3 >= 0) {
            }
            if (z) {
            }
            qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
            qr8Var.c.getImageReceiver().l1 = (byte) 2;
            or8 or8Var32222 = qr8Var.c;
            int i42222 = tr8Var.n1;
            int i52222 = tr8Var.o1;
            or8Var32222.s(i42222, i42222, i52222, i52222);
            qr8Var.c.setTag(Integer.valueOf(i2));
            return qr8Var;
        }
        i2 = k;
        sparseArray = sparseArray2;
        z = false;
        if (i3 >= 0) {
        }
        if (z) {
        }
        qr8Var.c.getImageReceiver().h1 = new oo8(this, (byte) 1);
        qr8Var.c.getImageReceiver().l1 = (byte) 2;
        or8 or8Var322222 = qr8Var.c;
        int i422222 = tr8Var.n1;
        int i522222 = tr8Var.o1;
        or8Var322222.s(i422222, i422222, i522222, i522222);
        qr8Var.c.setTag(Integer.valueOf(i2));
        return qr8Var;
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        qr8 qr8Var = (qr8) obj;
        return qr8Var.a ? view == qr8Var.b : view == qr8Var.c;
    }

    @Override // qt7
    public final void g() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((bf0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        tr8 tr8Var = this.h;
        int size = tr8Var.Y0.size();
        if (tr8Var.j1) {
            size++;
        }
        xb7 xb7Var = tr8Var.T0;
        int max = Math.max(xb7Var == null ? 0 : xb7Var.b.size(), size) + (j() << 1);
        for (int i2 = 0; i2 < max; i2++) {
            arrayList2.add(new qr8());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // yi2
    public final int j() {
        tr8 tr8Var = this.h;
        int size = tr8Var.Y0.size();
        if (tr8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return tr8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
