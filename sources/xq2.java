// default package

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xq2 implements qq2, reb, uw8 {
    public static final vq2 n = new vq2((byte) 0);
    public static final byte[] r = {0, 7, 8, 15};
    public static final byte[] s = {0, 119, -120, -1};
    public static final byte[] w = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public xq2(Executor executor, ArrayList arrayList, ArrayList arrayList2, uq2 uq2Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        w44 w44Var = new w44(executor);
        this.e = w44Var;
        this.h = uq2Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        Object[] objArr = 0;
        arrayList3.add(fq2.c(w44Var, w44.class, feb.class, cy8.class));
        arrayList3.add(fq2.c(this, xq2.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            fq2 fq2Var = (fq2) obj;
            if (fq2Var != null) {
                arrayList3.add(fq2Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((vw8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((uq2) this.h).f(componentRegistrar));
                        it.remove();
                    }
                } catch (cs5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((fq2) it2.next()).b.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                xfe.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                xfe.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                fq2 fq2Var2 = (fq2) obj4;
                ((HashMap) this.a).put(fq2Var2, new i26(new wq2(this, fq2Var2, objArr == true ? 1 : 0)));
            }
            arrayList5.addAll(v(arrayList3));
            arrayList5.addAll(w());
            u();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            e((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] b(int i, int i2, zd1 zd1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zd1Var.f(i2);
        }
        return bArr;
    }

    public static int[] i() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m(jn7.d4, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = jn7.K1;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = m(jn7.d4, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = jn7.d4;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m(63, i4, i5, i3);
            } else {
                int i6 = i2 & jn7.R1;
                int i7 = jn7.z2;
                if (i6 == 0) {
                    int i8 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i9 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(jn7.d4, i8, i9, i + i7);
                } else if (i6 == 8) {
                    int i10 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i11 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = m(jn7.K1, i10, i11, i + i7);
                } else if (i6 == 128) {
                    iArr[i2] = m(jn7.d4, ((i2 & 1) != 0 ? 43 : 0) + jn7.K1 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + jn7.K1 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + jn7.K1 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = m(jn7.d4, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static void p(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int i5;
        int f;
        int i6;
        byte[] bArr2;
        boolean z2;
        int i7;
        int f2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        int f3;
        int i12;
        Paint paint2 = paint;
        zd1 zd1Var = new zd1(bArr.length, bArr);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (zd1Var.b() != 0) {
            int i15 = 8;
            int f4 = zd1Var.f(8);
            if (f4 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (f4) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? s : bArr3 : i == 2 ? bArr5 == null ? r : bArr5 : null;
                        boolean z5 = false;
                        while (true) {
                            int f5 = zd1Var.f(2);
                            if (f5 != 0) {
                                z = z5;
                                i4 = f5;
                                i5 = 1;
                            } else {
                                if (zd1Var.e()) {
                                    f = zd1Var.f(3) + 3;
                                    z = z5;
                                    i4 = zd1Var.f(2);
                                } else {
                                    if (zd1Var.e()) {
                                        z = z5;
                                        i5 = 1;
                                    } else {
                                        int f6 = zd1Var.f(2);
                                        if (f6 == 0) {
                                            z = true;
                                        } else if (f6 == 1) {
                                            z = z5;
                                            i5 = 2;
                                        } else if (f6 == 2) {
                                            i5 = zd1Var.f(4) + 12;
                                            i4 = zd1Var.f(2);
                                            z = z5;
                                        } else if (f6 != 3) {
                                            z = z5;
                                        } else {
                                            f = zd1Var.f(8) + 29;
                                            i4 = zd1Var.f(2);
                                            z = z5;
                                        }
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    i4 = 0;
                                }
                                i5 = f;
                            }
                            if (i5 == 0 || paint2 == null) {
                                i6 = i13;
                            } else {
                                if (bArr6 != 0) {
                                    i4 = bArr6[i4];
                                }
                                paint2.setColor(iArr[i4]);
                                i6 = i13;
                                canvas.drawRect(i13, i14, i13 + i5, i14 + 1, paint2);
                            }
                            i13 = i6 + i5;
                            if (z) {
                                zd1Var.c();
                                break;
                            } else {
                                paint2 = paint;
                                z5 = z;
                            }
                        }
                    case 17:
                        if (i == 3) {
                            bArr2 = bArr4 == null ? w : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z6 = false;
                        while (true) {
                            int f7 = zd1Var.f(i18);
                            if (f7 != 0) {
                                z2 = z6;
                                i8 = f7;
                                i7 = 1;
                            } else if (zd1Var.e()) {
                                if (zd1Var.e()) {
                                    int f8 = zd1Var.f(i17);
                                    if (f8 == 0) {
                                        z2 = z6;
                                        i7 = 1;
                                    } else if (f8 != 1) {
                                        if (f8 == i17) {
                                            i7 = zd1Var.f(i18) + 9;
                                            f2 = zd1Var.f(i18);
                                        } else if (f8 != i16) {
                                            z2 = z6;
                                            i7 = 0;
                                        } else {
                                            i7 = zd1Var.f(i15) + 25;
                                            f2 = zd1Var.f(i18);
                                        }
                                        i8 = f2;
                                    } else {
                                        z2 = z6;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = zd1Var.f(i17) + 4;
                                    i8 = zd1Var.f(i18);
                                }
                                z2 = z6;
                            } else {
                                int f9 = zd1Var.f(i16);
                                if (f9 != 0) {
                                    i7 = f9 + 2;
                                    z2 = z6;
                                    i8 = 0;
                                } else {
                                    z2 = true;
                                    i7 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i16;
                                i11 = i17;
                            } else {
                                if (bArr2 != 0) {
                                    i8 = bArr2[i8];
                                }
                                paint2.setColor(iArr[i8]);
                                i10 = i16;
                                i11 = 2;
                                i9 = i13;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint2);
                            }
                            i13 = i9 + i7;
                            if (z2) {
                                zd1Var.c();
                                break;
                            } else {
                                z6 = z2;
                                i16 = i10;
                                i17 = i11;
                                i18 = 4;
                                i15 = 8;
                            }
                        }
                    case 18:
                        while (true) {
                            int f10 = zd1Var.f(8);
                            if (f10 != 0) {
                                z4 = z3;
                                f3 = 1;
                            } else if (zd1Var.e()) {
                                z4 = z3;
                                f3 = zd1Var.f(7);
                                f10 = zd1Var.f(8);
                            } else {
                                int f11 = zd1Var.f(7);
                                if (f11 != 0) {
                                    z4 = z3;
                                    f3 = f11;
                                    f10 = 0;
                                } else {
                                    z4 = true;
                                    f10 = 0;
                                    f3 = 0;
                                }
                            }
                            if (f3 == 0 || paint2 == null) {
                                i12 = i13;
                            } else {
                                paint2.setColor(iArr[f10]);
                                i12 = i13;
                                canvas.drawRect(i13, i14, i13 + f3, i14 + 1, paint2);
                            }
                            i13 = i12 + f3;
                            z3 = z4 ? false : z4;
                        }
                        break;
                    default:
                        switch (f4) {
                            case 32:
                                bArr5 = b(4, 4, zd1Var);
                                break;
                            case 33:
                                bArr3 = b(4, 8, zd1Var);
                                break;
                            case 34:
                                bArr4 = b(16, 8, zd1Var);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i2;
            }
            paint2 = paint;
        }
    }

    public static gs3 q(zd1 zd1Var, int i) {
        int f;
        int i2;
        int f2;
        int i3;
        int i4;
        int i5 = 8;
        int f3 = zd1Var.f(8);
        zd1Var.n(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] i9 = i();
        int[] k = k();
        while (i7 > 0) {
            int f4 = zd1Var.f(i5);
            int f5 = zd1Var.f(i5);
            int[] iArr2 = (f5 & 128) != 0 ? iArr : (f5 & 64) != 0 ? i9 : k;
            if ((f5 & 1) != 0) {
                i3 = zd1Var.f(i5);
                i4 = zd1Var.f(i5);
                f = zd1Var.f(i5);
                f2 = zd1Var.f(i5);
                i2 = i7 - 6;
            } else {
                int f6 = zd1Var.f(6) << i6;
                int f7 = zd1Var.f(4) << 4;
                f = zd1Var.f(4) << 4;
                i2 = i7 - 4;
                f2 = zd1Var.f(i6) << 6;
                i3 = f6;
                i4 = f7;
            }
            if (i3 == 0) {
                i4 = i8;
                f = i4;
                f2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = f - 128;
            iArr2[f4] = m((byte) (255 - (f2 & jn7.d4)), gcc.i((int) ((1.402d * d2) + d), 0, jn7.d4), gcc.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, jn7.d4), gcc.i((int) ((d3 * 1.772d) + d), 0, jn7.d4));
            i7 = i2;
            i8 = 0;
            f3 = f3;
            k = k;
            i5 = 8;
            i6 = 2;
        }
        return new gs3(f3, iArr, i9, k);
    }

    public static is3 r(zd1 zd1Var) {
        byte[] bArr;
        int f = zd1Var.f(16);
        zd1Var.n(4);
        int f2 = zd1Var.f(2);
        boolean e = zd1Var.e();
        zd1Var.n(1);
        byte[] bArr2 = gcc.b;
        if (f2 == 1) {
            zd1Var.n(zd1Var.f(8) << 4);
        } else if (f2 == 0) {
            int f3 = zd1Var.f(16);
            int f4 = zd1Var.f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                zd1Var.i(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                zd1Var.i(f4, bArr);
                return new is3(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new is3(f, e, bArr2, bArr);
    }

    public static void y(FrameLayout frameLayout) {
        i05 i05Var = i05.e;
        Context context = frameLayout.getContext();
        int c = i05Var.c(context, j05.a);
        String b = g7d.b(context, c);
        String c2 = g7d.c(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a = i05Var.a(c, context, null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new yc3(context, a));
        }
    }

    public final void A(u6d u6dVar) {
        if (((ko9) this.a) != null) {
            u6dVar.b();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(u6dVar);
        j09 j09Var = (j09) this.c;
        this.f = j09Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (j09Var == null || ((ko9) this.a) != null) {
            return;
        }
        try {
            synchronized (tk6.class) {
                tk6.a(context);
            }
            b1f a0 = m5f.a(context).a0(new br7(context));
            if (a0 != null) {
                ((j09) this.f).I(new ko9((tt) this.d, a0));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ko9) this.a).s((z05) obj);
                }
                arrayList.clear();
            }
        } catch (RemoteException e) {
            p3d.i(e);
        } catch (b15 unused) {
        }
    }

    @Override // qq2
    public final Object a(Class cls) {
        return h(i09.a(cls));
    }

    @Override // qq2
    public final Set c(i09 i09Var) {
        vw8 vw8Var;
        synchronized (this) {
            vw8Var = (k26) ((HashMap) this.c).get(i09Var);
            if (vw8Var == null) {
                vw8Var = n;
            }
        }
        return (Set) vw8Var.get();
    }

    @Override // qq2
    public final vw8 d(Class cls) {
        return g(i09.a(cls));
    }

    public final void e(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            fq2 fq2Var = (fq2) entry.getKey();
            vw8 vw8Var = (vw8) entry.getValue();
            byte b = fq2Var.d;
            if (b == 1 || (b == 2 && z)) {
                vw8Var.get();
            }
        }
        w44 w44Var = (w44) this.e;
        synchronized (w44Var) {
            arrayDeque = w44Var.b;
            if (arrayDeque != null) {
                w44Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw qu6.l(it);
            }
        }
    }

    @Override // qq2
    public final au7 f(i09 i09Var) {
        vw8 g = g(i09Var);
        return g == null ? new au7(au7.c, au7.d) : g instanceof au7 ? (au7) g : new au7(null, g);
    }

    @Override // qq2
    public final synchronized vw8 g(i09 i09Var) {
        bwe.a(i09Var, "Null interface requested.");
        return (vw8) ((HashMap) this.b).get(i09Var);
    }

    @Override // uw8
    public final Object get() {
        Context context = (Context) ((pq5) this.a).a;
        wf7 wf7Var = (wf7) ((uw8) this.b).get();
        ds9 ds9Var = (ds9) ((uw8) this.c).get();
        pm3 pm3Var = (pm3) ((ko9) this.d).get();
        Executor executor = (Executor) ((uw8) this.e).get();
        ds9 ds9Var2 = (ds9) ((uw8) this.f).get();
        sae saeVar = new sae();
        z6f z6fVar = new z6f((byte) 28);
        ds9 ds9Var3 = (ds9) ((uw8) this.h).get();
        ba0 ba0Var = new ba0();
        ba0Var.a = context;
        ba0Var.b = wf7Var;
        ba0Var.c = ds9Var;
        ba0Var.d = pm3Var;
        ba0Var.e = executor;
        ba0Var.f = ds9Var2;
        ba0Var.g = saeVar;
        ba0Var.h = z6fVar;
        ba0Var.i = ds9Var3;
        return ba0Var;
    }

    @Override // qq2
    public final Object h(i09 i09Var) {
        vw8 g = g(i09Var);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    @Override // reb
    public final /* synthetic */ heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // reb
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        p43 p43Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        SparseArray sparseArray2;
        int i6;
        ks3 ks3Var;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int[] iArr2;
        SparseArray sparseArray3;
        int i10;
        Paint paint2;
        int i11;
        ks3 ks3Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        xq2 xq2Var = this;
        zd1 zd1Var = new zd1(i + i2, bArr);
        zd1Var.l(i);
        Paint paint3 = (Paint) xq2Var.b;
        Canvas canvas = (Canvas) xq2Var.c;
        ms3 ms3Var = (ms3) xq2Var.f;
        SparseArray sparseArray4 = ms3Var.f;
        SparseArray sparseArray5 = ms3Var.g;
        int i16 = ms3Var.b;
        SparseArray sparseArray6 = ms3Var.c;
        SparseArray sparseArray7 = ms3Var.d;
        SparseArray sparseArray8 = ms3Var.e;
        int i17 = ms3Var.a;
        while (zd1Var.b() >= 48 && zd1Var.f(8) == 15) {
            int f = zd1Var.f(8);
            int f2 = zd1Var.f(16);
            int f3 = zd1Var.f(16);
            int d = zd1Var.d() + f3;
            if ((f3 << 3) > zd1Var.b()) {
                efd.f("DvbParser", "Data field length exceeds limit");
                zd1Var.n(zd1Var.b());
                sparseArray3 = sparseArray5;
                i10 = i16;
                paint2 = paint3;
                i11 = i17;
            } else {
                switch (f) {
                    case 16:
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        if (f2 == i17) {
                            sj0 sj0Var = ms3Var.i;
                            int i18 = 8;
                            zd1Var.f(8);
                            int f4 = zd1Var.f(4);
                            int f5 = zd1Var.f(2);
                            zd1Var.n(2);
                            int i19 = f3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i19 > 0) {
                                int f6 = zd1Var.f(i18);
                                zd1Var.n(i18);
                                sparseArray9.put(f6, new js3(zd1Var.f(16), zd1Var.f(16)));
                                i17 = i17;
                                i19 -= 6;
                                i18 = 8;
                            }
                            i11 = i17;
                            sj0 sj0Var2 = new sj0(f4, f5, sparseArray9);
                            if (f5 != 0) {
                                ms3Var.i = sj0Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (sj0Var != null && sj0Var.b != f4) {
                                ms3Var.i = sj0Var2;
                                break;
                            }
                        }
                        i11 = i17;
                        break;
                    case 17:
                        sj0 sj0Var3 = ms3Var.i;
                        if (f2 == i17 && sj0Var3 != null) {
                            int f7 = zd1Var.f(8);
                            zd1Var.n(4);
                            boolean e = zd1Var.e();
                            zd1Var.n(3);
                            int f8 = zd1Var.f(16);
                            int f9 = zd1Var.f(16);
                            zd1Var.f(3);
                            int f10 = zd1Var.f(3);
                            int i20 = 2;
                            zd1Var.n(2);
                            int f11 = zd1Var.f(8);
                            int f12 = zd1Var.f(8);
                            int f13 = zd1Var.f(4);
                            int f14 = zd1Var.f(2);
                            zd1Var.n(2);
                            int i21 = f3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i21 > 0) {
                                int i22 = i16;
                                int i23 = i21;
                                int f15 = zd1Var.f(16);
                                int f16 = zd1Var.f(i20);
                                zd1Var.f(i20);
                                Paint paint4 = paint3;
                                int f17 = zd1Var.f(12);
                                SparseArray sparseArray11 = sparseArray5;
                                zd1Var.n(4);
                                int f18 = zd1Var.f(12);
                                int i24 = i23 - 6;
                                if (f16 == 1 || f16 == 2) {
                                    zd1Var.f(8);
                                    zd1Var.f(8);
                                    i24 = i23 - 8;
                                }
                                sparseArray10.put(f15, new ls3(f17, f18));
                                i21 = i24;
                                i16 = i22;
                                paint3 = paint4;
                                sparseArray5 = sparseArray11;
                                i20 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i10 = i16;
                            paint2 = paint3;
                            ks3 ks3Var3 = new ks3(f7, e, f8, f9, f10, f11, f12, f13, f14, sparseArray10);
                            if (sj0Var3.c == 0 && (ks3Var2 = (ks3) sparseArray6.get(f7)) != null) {
                                SparseArray sparseArray12 = ks3Var2.j;
                                for (int i25 = 0; i25 < sparseArray12.size(); i25++) {
                                    ks3Var3.j.put(sparseArray12.keyAt(i25), (ls3) sparseArray12.valueAt(i25));
                                }
                            }
                            sparseArray6.put(ks3Var3.a, ks3Var3);
                            i11 = i17;
                            break;
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 18:
                        if (f2 == i17) {
                            gs3 q = q(zd1Var, f3);
                            sparseArray7.put(q.a, q);
                        } else if (f2 == i16) {
                            gs3 q2 = q(zd1Var, f3);
                            sparseArray4.put(q2.a, q2);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 19:
                        if (f2 == i17) {
                            is3 r2 = r(zd1Var);
                            sparseArray8.put(r2.a, r2);
                        } else if (f2 == i16) {
                            is3 r3 = r(zd1Var);
                            sparseArray5.put(r3.a, r3);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 20:
                        if (f2 == i17) {
                            zd1Var.n(4);
                            boolean e2 = zd1Var.e();
                            zd1Var.n(3);
                            int f19 = zd1Var.f(16);
                            int f20 = zd1Var.f(16);
                            if (e2) {
                                int f21 = zd1Var.f(16);
                                int f22 = zd1Var.f(16);
                                int f23 = zd1Var.f(16);
                                i12 = f22;
                                i13 = zd1Var.f(16);
                                i15 = f23;
                                i14 = f21;
                            } else {
                                i12 = f19;
                                i13 = f20;
                                i14 = 0;
                                i15 = 0;
                            }
                            ms3Var.h = new hs3(f19, f20, i14, i12, i15, i13);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    default:
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                }
                zd1Var.o(d - zd1Var.d());
            }
            i17 = i11;
            i16 = i10;
            paint3 = paint2;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint5 = paint3;
        sj0 sj0Var4 = ms3Var.i;
        if (sj0Var4 == null) {
            no5 no5Var = po5.b;
            p43Var = new p43(-9223372036854775807L, -9223372036854775807L, j99.e);
        } else {
            hs3 hs3Var = ms3Var.h;
            if (hs3Var == null) {
                hs3Var = (hs3) xq2Var.d;
            }
            int i26 = hs3Var.b;
            int i27 = hs3Var.a;
            Bitmap bitmap = (Bitmap) xq2Var.h;
            if (bitmap == null || i27 + 1 != bitmap.getWidth() || i26 + 1 != ((Bitmap) xq2Var.h).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i27 + 1, i26 + 1, Bitmap.Config.ARGB_8888);
                xq2Var.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) sj0Var4.d;
            int i28 = 0;
            while (i28 < sparseArray14.size()) {
                canvas.save();
                js3 js3Var = (js3) sparseArray14.valueAt(i28);
                ks3 ks3Var4 = (ks3) sparseArray6.get(sparseArray14.keyAt(i28));
                int i29 = js3Var.a + hs3Var.c;
                int i30 = js3Var.b + hs3Var.e;
                int i31 = ks3Var4.c;
                int i32 = ks3Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i33 = ks3Var4.d;
                int i34 = i26;
                int i35 = i29 + i31;
                int i36 = i27;
                SparseArray sparseArray16 = sparseArray6;
                int i37 = i30 + i33;
                int i38 = i28;
                canvas.clipRect(i29, i30, Math.min(i35, hs3Var.d), Math.min(i37, hs3Var.f));
                gs3 gs3Var = (gs3) sparseArray7.get(i32);
                if (gs3Var == null && (gs3Var = (gs3) sparseArray4.get(i32)) == null) {
                    gs3Var = (gs3) xq2Var.e;
                }
                int[] iArr3 = gs3Var.b;
                int[] iArr4 = gs3Var.c;
                int[] iArr5 = gs3Var.d;
                hs3 hs3Var2 = hs3Var;
                SparseArray sparseArray17 = ks3Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i39 = 0;
                while (i39 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i39);
                    SparseArray sparseArray19 = sparseArray17;
                    ls3 ls3Var = (ls3) sparseArray17.valueAt(i39);
                    is3 is3Var = (is3) sparseArray8.get(keyAt);
                    int i40 = i39;
                    SparseArray sparseArray20 = sparseArray13;
                    if (is3Var == null) {
                        is3Var = (is3) sparseArray20.get(keyAt);
                    }
                    is3 is3Var2 = is3Var;
                    if (is3Var2 != null) {
                        sparseArray13 = sparseArray20;
                        Paint paint6 = is3Var2.b ? null : (Paint) xq2Var.a;
                        ks3 ks3Var5 = ks3Var4;
                        int i41 = ks3Var5.e;
                        int i42 = ls3Var.a + i29;
                        int i43 = ls3Var.b + i30;
                        if (i41 == 3) {
                            sparseArray2 = sparseArray8;
                            i9 = i30;
                            iArr2 = iArr5;
                        } else {
                            sparseArray2 = sparseArray8;
                            i9 = i30;
                            iArr2 = i41 == 2 ? iArr4 : iArr3;
                        }
                        i7 = i29;
                        i8 = i31;
                        ks3Var = ks3Var5;
                        iArr = iArr4;
                        i5 = i33;
                        i6 = i9;
                        p(is3Var2.c, iArr2, i41, i42, i43, paint6, canvas);
                        p(is3Var2.d, iArr2, i41, i42, i43 + 1, paint6, canvas);
                    } else {
                        i5 = i33;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i6 = i30;
                        ks3Var = ks3Var4;
                        i7 = i29;
                        i8 = i31;
                        iArr = iArr4;
                    }
                    xq2Var = this;
                    i29 = i7;
                    i30 = i6;
                    ks3Var4 = ks3Var;
                    i39 = i40 + 1;
                    i33 = i5;
                    sparseArray17 = sparseArray19;
                    iArr4 = iArr;
                    sparseArray8 = sparseArray2;
                    i31 = i8;
                }
                int i44 = i33;
                SparseArray sparseArray21 = sparseArray8;
                int i45 = i30;
                ks3 ks3Var6 = ks3Var4;
                int i46 = i29;
                int i47 = i31;
                int[] iArr6 = iArr4;
                if (ks3Var6.b) {
                    int i48 = ks3Var6.e;
                    int i49 = i48 == 3 ? iArr5[ks3Var6.g] : i48 == 2 ? iArr6[ks3Var6.h] : iArr3[ks3Var6.i];
                    paint = paint5;
                    paint.setColor(i49);
                    sparseArray = sparseArray7;
                    i3 = i34;
                    i4 = i36;
                    arrayList = arrayList2;
                    canvas.drawRect(i46, i45, i35, i37, paint);
                } else {
                    sparseArray = sparseArray7;
                    i3 = i34;
                    i4 = i36;
                    arrayList = arrayList2;
                    paint = paint5;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i46, i45, i47, i44);
                float f24 = i4;
                float f25 = i46 / f24;
                float f26 = i45;
                float f27 = i3;
                arrayList.add(new m43(null, null, null, createBitmap2, f26 / f27, 0, 0, f25, 0, TLObject.FLAG_31, -3.4028235E38f, i47 / f24, i44 / f27, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                xq2Var = this;
                paint5 = paint;
                sparseArray7 = sparseArray;
                i26 = i3;
                i27 = i4;
                arrayList2 = arrayList;
                sparseArray14 = sparseArray15;
                sparseArray6 = sparseArray16;
                sparseArray4 = sparseArray18;
                sparseArray8 = sparseArray21;
                i28 = i38 + 1;
                hs3Var = hs3Var2;
            }
            p43Var = new p43(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        ot2Var.accept(p43Var);
    }

    public final void n() {
        x(null);
        fu5 fu5Var = (fu5) this.c;
        if (fu5Var != null) {
            fu5Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void o(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.a);
        }
        e(hashMap, z);
    }

    @Override // reb
    public final void reset() {
        ms3 ms3Var = (ms3) this.f;
        ms3Var.c.clear();
        ms3Var.d.clear();
        ms3Var.e.clear();
        ms3Var.f.clear();
        ms3Var.g.clear();
        ms3Var.h = null;
        ms3Var.i = null;
    }

    @Override // reb
    public final int s() {
        return 2;
    }

    public final void t(km9 km9Var, ArrayList arrayList) {
        vnb vnbVar = (vnb) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kf9 kf9Var = (kf9) obj;
                d19 d19Var = new d19(km9Var.getContext(), kf9Var, vnbVar);
                d19Var.setPadding(hl.L(8.0f), 0, hl.L(12.0f), 0);
                d19Var.setBackground(aob.Y(aob.v0(aob.i6, vnbVar), 0, 0));
                d19Var.setOnClickListener(new lw4(this, km9Var, kf9Var, (byte) 18));
                ((LinearLayout) this.d).addView(d19Var, tre.o(-1, 48));
            }
        }
    }

    public final void u() {
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (fq2 fq2Var : ((HashMap) this.a).keySet()) {
            for (qe3 qe3Var : fq2Var.c) {
                boolean z = qe3Var.b == 2;
                i09 i09Var = qe3Var.a;
                if (z && !hashMap2.containsKey(i09Var)) {
                    Set set = Collections.EMPTY_SET;
                    k26 k26Var = new k26();
                    k26Var.b = null;
                    k26Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    k26Var.a.addAll(set);
                    hashMap2.put(i09Var, k26Var);
                } else if (hashMap.containsKey(i09Var)) {
                    continue;
                } else {
                    byte b = qe3Var.b;
                    if (b == 1) {
                        throw new re3("Unsatisfied dependency for component " + fq2Var + ": " + i09Var);
                    }
                    if (b != 2) {
                        hashMap.put(i09Var, new au7(au7.c, au7.d));
                    }
                }
            }
        }
    }

    public final ArrayList v(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fq2 fq2Var = (fq2) obj;
            if (!fq2Var.e) {
                vw8 vw8Var = (vw8) ((HashMap) this.a).get(fq2Var);
                for (i09 i09Var : fq2Var.b) {
                    if (hashMap.containsKey(i09Var)) {
                        arrayList2.add(new ea2((au7) ((vw8) hashMap.get(i09Var)), vw8Var, (byte) 23));
                    } else {
                        hashMap.put(i09Var, vw8Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList w() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            fq2 fq2Var = (fq2) entry.getKey();
            if (fq2Var.e) {
                vw8 vw8Var = (vw8) entry.getValue();
                for (i09 i09Var : fq2Var.b) {
                    if (!hashMap2.containsKey(i09Var)) {
                        hashMap2.put(i09Var, new HashSet());
                    }
                    ((Set) hashMap2.get(i09Var)).add(vw8Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                k26 k26Var = (k26) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ea2(k26Var, (vw8) it.next(), (byte) 24));
                }
            } else {
                i09 i09Var2 = (i09) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                k26 k26Var2 = new k26();
                k26Var2.b = null;
                k26Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                k26Var2.a.addAll(set);
                hashMap.put(i09Var2, k26Var2);
            }
        }
        return arrayList;
    }

    public final void x(km9 km9Var) {
        km9 km9Var2 = (km9) this.h;
        if (km9Var2 != km9Var) {
            if (km9Var2 != null) {
                km9Var2.setShowCommandBackground(false);
            }
            this.h = km9Var;
            if (km9Var != null) {
                km9Var.setShowCommandBackground(true);
            }
        }
    }

    public final void z(km9 km9Var, String str) {
        fu5 fu5Var;
        fu5 fu5Var2;
        if (str == null) {
            n();
            return;
        }
        ArrayList a = kf9.a(str);
        if (a.isEmpty()) {
            n();
            return;
        }
        x(km9Var);
        if (((km9) this.f) == km9Var && a.equals((ArrayList) this.e) && (fu5Var2 = (fu5) this.c) != null && fu5Var2.E()) {
            return;
        }
        if (((km9) this.f) == km9Var && (fu5Var = (fu5) this.c) != null && fu5Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a;
            t(km9Var, a);
            ((fu5) this.c).P();
            return;
        }
        n();
        x(km9Var);
        this.f = km9Var;
        this.e = a;
        LinearLayout linearLayout = new LinearLayout(km9Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        t(km9Var, a);
        fu5 i = ((lf9) this.a).i(km9Var.getEditText());
        i.W = true;
        i.s = (short) 0;
        i.t = false;
        i.q((LinearLayout) this.d, tre.o(jn7.w3, -2));
        i.d0 = hl.L(240.0f);
        i.i = (byte) 3;
        i.b0(-hl.L(12.0f), 0.0f);
        i.p = new v59(this, (byte) 6);
        i.j0 = true;
        if (i.E()) {
            i.D();
        }
        i.a0();
        this.c = i;
    }

    public xq2(lf9 lf9Var, vnb vnbVar) {
        this.a = lf9Var;
        this.b = vnbVar;
    }
}
