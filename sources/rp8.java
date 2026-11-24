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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rp8 extends kh2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public be0 g;
    public final /* synthetic */ sp8 h;

    public rp8(sp8 sp8Var, Context context, xm8 xm8Var) {
        this.h = sp8Var;
        this.e = context;
        this.g = xm8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // pr7
    public final void a(gec gecVar, Object obj) {
        pp8 pp8Var = (pp8) obj;
        View view = pp8Var.b;
        if (view != null) {
            gecVar.removeView(view);
        }
        if (pp8Var.a) {
            return;
        }
        np8 np8Var = pp8Var.c;
        if (np8Var.getImageReceiver().n0 != null) {
            Drawable t = np8Var.getImageReceiver().t();
            if (t instanceof km) {
                ((km) t).w(np8Var);
            }
        }
        np8Var.setRoundRadius(0);
        gecVar.removeView(np8Var);
        np8Var.getImageReceiver().c();
    }

    @Override // pr7
    public final int b() {
        return this.c.size();
    }

    @Override // pr7
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((pp8) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // pr7
    public final CharSequence d(int i) {
        return (k(i) + 1) + "/" + this.h.getRealCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    @Override // pr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(gec gecVar, int i) {
        int i2;
        SparseArray sparseArray;
        boolean z;
        boolean z2;
        String str;
        Bitmap n;
        pp8 pp8Var = (pp8) this.c.get(i);
        int k = k(i);
        sp8 sp8Var = this.h;
        boolean z3 = sp8Var.j1;
        SparseArray sparseArray2 = sp8Var.e1;
        ArrayList arrayList = sp8Var.c1;
        ArrayList arrayList2 = sp8Var.b1;
        ArrayList arrayList3 = sp8Var.Y0;
        ArrayList arrayList4 = sp8Var.Z0;
        ArrayList arrayList5 = sp8Var.a1;
        ArrayList arrayList6 = sp8Var.X0;
        Context context = this.e;
        if (z3 && k == 0) {
            pp8Var.a = true;
            qp8 qp8Var = pp8Var.b;
            if (qp8Var == null) {
                qp8Var = new qp8(context);
                pp8Var.b = qp8Var;
            }
            if (qp8Var.getParent() == null) {
                gecVar.addView(pp8Var.b);
            }
            return pp8Var;
        }
        pp8Var.a = false;
        qp8 qp8Var2 = pp8Var.b;
        if (qp8Var2 != null && qp8Var2.getParent() != null) {
            gecVar.removeView(pp8Var.b);
        }
        if (pp8Var.c == null) {
            np8 np8Var = new np8(sp8Var, context, i, this.f);
            pp8Var.c = np8Var;
            this.d.set(i, np8Var);
        }
        if (pp8Var.c.getParent() == null) {
            gecVar.addView(pp8Var.c);
        }
        pp8Var.c.getImageReceiver().x0 = true;
        int i3 = sp8Var.j1 ? k - 1 : k;
        if (i3 != 0) {
            i2 = k;
            sparseArray = sparseArray2;
            if (i3 >= 0 && i3 < arrayList6.size()) {
                gl5 gl5Var = (gl5) arrayList6.get(i3);
                pp8Var.c.M = gl5Var != null;
                z = arrayList5.get(i3) == null;
                gl5 gl5Var2 = (gl5) arrayList4.get(i3);
                String str2 = (gl5Var2 == null || !(gl5Var2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                String str3 = "avatar_" + sp8Var.F0;
                np8 np8Var2 = pp8Var.c;
                i9c i9cVar = (i9c) arrayList5.get(i3);
                gl5 gl5Var3 = (gl5) arrayList3.get(i3);
                gl5 gl5Var4 = (gl5) arrayList4.get(i3);
                int intValue = ((Integer) arrayList2.get(i3)).intValue();
                ImageReceiver imageReceiver = np8Var2.a;
                if (i9cVar != null) {
                    imageReceiver.g0(i9cVar);
                } else {
                    imageReceiver.Y(gl5Var, null, gl5Var3, null, gl5Var4, str2, null, intValue, null, str3, 1);
                }
                np8Var2.e();
                if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                }
                pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
                pp8Var.c.getImageReceiver().l1 = (byte) 2;
                np8 np8Var3 = pp8Var.c;
                int i4 = sp8Var.n1;
                int i5 = sp8Var.o1;
                np8Var3.s(i4, i4, i5, i5);
                pp8Var.c.setTag(Integer.valueOf(i2));
                return pp8Var;
            }
            z = false;
            if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
            }
            pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
            pp8Var.c.getImageReceiver().l1 = (byte) 2;
            np8 np8Var32 = pp8Var.c;
            int i42 = sp8Var.n1;
            int i52 = sp8Var.o1;
            np8Var32.s(i42, i42, i52, i52);
            pp8Var.c.setTag(Integer.valueOf(i2));
            return pp8Var;
        }
        be0 be0Var = this.g;
        Drawable t = be0Var == null ? null : be0Var.getImageReceiver().t();
        if (t instanceof km) {
            km kmVar = (km) t;
            if (kmVar.s()) {
                pp8Var.c.setImageDrawable(t);
                kmVar.f(pp8Var.c);
                kmVar.S = true;
                i2 = k;
                sparseArray = sparseArray2;
                z = false;
                if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                    SparseArray sparseArray3 = sparseArray;
                    pp8Var.c.I = (RadialProgress2) sparseArray3.get(i3);
                    np8 np8Var4 = pp8Var.c;
                    if (np8Var4.I == null) {
                        np8Var4.I = new RadialProgress2(np8Var4, null);
                        RadialProgress2 radialProgress2 = pp8Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        pp8Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i3, pp8Var.c.I);
                    }
                    if (sp8Var.h1) {
                        sp8Var.invalidate();
                    } else {
                        sp8Var.postInvalidateOnAnimation();
                    }
                }
                pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
                pp8Var.c.getImageReceiver().l1 = (byte) 2;
                np8 np8Var322 = pp8Var.c;
                int i422 = sp8Var.n1;
                int i522 = sp8Var.o1;
                np8Var322.s(i422, i422, i522, i522);
                pp8Var.c.setTag(Integer.valueOf(i2));
                return pp8Var;
            }
        }
        if (i3 >= 0 && i3 < arrayList6.size()) {
            gl5 gl5Var5 = (gl5) arrayList6.get(i3);
            pp8Var.c.M = gl5Var5 != null;
            boolean z4 = arrayList5.get(i3) == null;
            if (!sp8Var.K0 || gl5Var5 == null) {
                z2 = z4;
            } else {
                z2 = z4;
                if (gl5Var5.p == 2) {
                    str = "avatar";
                    gl5 gl5Var6 = (gl5) arrayList4.get(i3);
                    be0 be0Var2 = this.g;
                    i2 = k;
                    n = (be0Var2 == null && sp8Var.f1) ? be0Var2.getImageReceiver().n() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(sp8Var.F0);
                    String sb2 = sb.toString();
                    if (n == null && arrayList5.get(i3) == null) {
                        np8 np8Var5 = pp8Var.c;
                        gl5 gl5Var7 = (gl5) arrayList6.get(i3);
                        gl5 gl5Var8 = (gl5) arrayList3.get(i3);
                        int intValue2 = ((Integer) arrayList2.get(i3)).intValue();
                        np8Var5.getClass();
                        np8Var5.a.Y(gl5Var7, str, gl5Var8, null, null, null, new BitmapDrawable((Resources) null, n), intValue2, null, sb2, 1);
                        np8Var5.e();
                    } else if (sp8Var.L0 == null) {
                        np8 np8Var6 = pp8Var.c;
                        i9c i9cVar2 = (i9c) arrayList5.get(i3);
                        gl5 gl5Var9 = (gl5) arrayList6.get(i3);
                        gl5 gl5Var10 = (gl5) arrayList3.get(i3);
                        gl5 gl5Var11 = sp8Var.L0;
                        int intValue3 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver2 = np8Var6.a;
                        if (i9cVar2 != null) {
                            imageReceiver2.g0(i9cVar2);
                        } else {
                            imageReceiver2.Y(gl5Var9, str, gl5Var10, null, gl5Var11, null, null, intValue3, null, sb2, 1);
                        }
                        np8Var6.e();
                    } else {
                        String str4 = (gl5Var6 == null || !(gl5Var6.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                        np8 np8Var7 = pp8Var.c;
                        i9c i9cVar3 = (i9c) arrayList5.get(i3);
                        gl5 gl5Var12 = (gl5) arrayList3.get(i3);
                        gl5 gl5Var13 = (gl5) arrayList4.get(i3);
                        int intValue4 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver3 = np8Var7.a;
                        if (i9cVar3 != null) {
                            imageReceiver3.g0(i9cVar3);
                        } else {
                            imageReceiver3.Y(gl5Var5, null, gl5Var12, null, gl5Var13, str4, null, intValue4, null, sb2, 1);
                        }
                        np8Var7.e();
                    }
                    z = z2;
                    if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                    }
                    pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
                    pp8Var.c.getImageReceiver().l1 = (byte) 2;
                    np8 np8Var3222 = pp8Var.c;
                    int i4222 = sp8Var.n1;
                    int i5222 = sp8Var.o1;
                    np8Var3222.s(i4222, i4222, i5222, i5222);
                    pp8Var.c.setTag(Integer.valueOf(i2));
                    return pp8Var;
                }
            }
            str = null;
            gl5 gl5Var62 = (gl5) arrayList4.get(i3);
            be0 be0Var22 = this.g;
            i2 = k;
            if (be0Var22 == null) {
            }
            StringBuilder sb3 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb3.append(sp8Var.F0);
            String sb22 = sb3.toString();
            if (n == null) {
            }
            if (sp8Var.L0 == null) {
            }
            z = z2;
            if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
            }
            pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
            pp8Var.c.getImageReceiver().l1 = (byte) 2;
            np8 np8Var32222 = pp8Var.c;
            int i42222 = sp8Var.n1;
            int i52222 = sp8Var.o1;
            np8Var32222.s(i42222, i42222, i52222, i52222);
            pp8Var.c.setTag(Integer.valueOf(i2));
            return pp8Var;
        }
        i2 = k;
        sparseArray = sparseArray2;
        z = false;
        if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
        }
        pp8Var.c.getImageReceiver().h1 = new z24((Object) this, (byte) 27);
        pp8Var.c.getImageReceiver().l1 = (byte) 2;
        np8 np8Var322222 = pp8Var.c;
        int i422222 = sp8Var.n1;
        int i522222 = sp8Var.o1;
        np8Var322222.s(i422222, i422222, i522222, i522222);
        pp8Var.c.setTag(Integer.valueOf(i2));
        return pp8Var;
    }

    @Override // pr7
    public final boolean f(View view, Object obj) {
        pp8 pp8Var = (pp8) obj;
        return pp8Var.a ? view == pp8Var.b : view == pp8Var.c;
    }

    @Override // pr7
    public final void g() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((be0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        sp8 sp8Var = this.h;
        int size = sp8Var.Y0.size();
        if (sp8Var.j1) {
            size++;
        }
        w97 w97Var = sp8Var.T0;
        int max = Math.max(w97Var == null ? 0 : w97Var.b.size(), size) + (j() << 1);
        for (int i2 = 0; i2 < max; i2++) {
            arrayList2.add(new pp8());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // kh2
    public final int j() {
        sp8 sp8Var = this.h;
        int size = sp8Var.Y0.size();
        if (sp8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return sp8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
