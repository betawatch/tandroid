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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pr2 implements ir2, vcb, mv8 {
    public static final nr2 n = new nr2((byte) 0);
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
    public pr2(Executor executor, ArrayList arrayList, ArrayList arrayList2, mr2 mr2Var) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        l54 l54Var = new l54(executor);
        this.e = l54Var;
        this.h = mr2Var;
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        Object[] objArr = 0;
        arrayList3.add(xq2.c(l54Var, l54.class, jcb.class, uw8.class));
        arrayList3.add(xq2.c(this, pr2.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            xq2 xq2Var = (xq2) obj;
            if (xq2Var != null) {
                arrayList3.add(xq2Var);
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((nv8) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((mr2) this.h).g(componentRegistrar));
                        it.remove();
                    }
                } catch (zr5 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((xq2) it2.next()).b.toArray();
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
                ide.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                ide.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                xq2 xq2Var2 = (xq2) obj4;
                ((HashMap) this.a).put(xq2Var2, new e26(new or2(this, xq2Var2, objArr == true ? 1 : 0)));
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
            h((HashMap) this.a, bool.booleanValue());
        }
    }

    public static byte[] b(int i, int i2, ye1 ye1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ye1Var.f(i2);
        }
        return bArr;
    }

    public static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = l(nm7.d4, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = nm7.K1;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = l(nm7.d4, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = nm7.d4;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = l(63, i4, i5, i3);
            } else {
                int i6 = i2 & nm7.R1;
                int i7 = nm7.z2;
                if (i6 == 0) {
                    int i8 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i9 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = l(nm7.d4, i8, i9, i + i7);
                } else if (i6 == 8) {
                    int i10 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i11 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = l(nm7.K1, i10, i11, i + i7);
                } else if (i6 == 128) {
                    iArr[i2] = l(nm7.d4, ((i2 & 1) != 0 ? 43 : 0) + nm7.K1 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + nm7.K1 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + nm7.K1 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = l(nm7.d4, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int l(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static void o(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
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
        ye1 ye1Var = new ye1(bArr.length, bArr);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (ye1Var.b() != 0) {
            int i15 = 8;
            int f4 = ye1Var.f(8);
            if (f4 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (f4) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? s : bArr3 : i == 2 ? bArr5 == null ? r : bArr5 : null;
                        boolean z5 = false;
                        while (true) {
                            int f5 = ye1Var.f(2);
                            if (f5 != 0) {
                                z = z5;
                                i4 = f5;
                                i5 = 1;
                            } else {
                                if (ye1Var.e()) {
                                    f = ye1Var.f(3) + 3;
                                    z = z5;
                                    i4 = ye1Var.f(2);
                                } else {
                                    if (ye1Var.e()) {
                                        z = z5;
                                        i5 = 1;
                                    } else {
                                        int f6 = ye1Var.f(2);
                                        if (f6 == 0) {
                                            z = true;
                                        } else if (f6 == 1) {
                                            z = z5;
                                            i5 = 2;
                                        } else if (f6 == 2) {
                                            i5 = ye1Var.f(4) + 12;
                                            i4 = ye1Var.f(2);
                                            z = z5;
                                        } else if (f6 != 3) {
                                            z = z5;
                                        } else {
                                            f = ye1Var.f(8) + 29;
                                            i4 = ye1Var.f(2);
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
                                ye1Var.c();
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
                            int f7 = ye1Var.f(i18);
                            if (f7 != 0) {
                                z2 = z6;
                                i8 = f7;
                                i7 = 1;
                            } else if (ye1Var.e()) {
                                if (ye1Var.e()) {
                                    int f8 = ye1Var.f(i17);
                                    if (f8 == 0) {
                                        z2 = z6;
                                        i7 = 1;
                                    } else if (f8 != 1) {
                                        if (f8 == i17) {
                                            i7 = ye1Var.f(i18) + 9;
                                            f2 = ye1Var.f(i18);
                                        } else if (f8 != i16) {
                                            z2 = z6;
                                            i7 = 0;
                                        } else {
                                            i7 = ye1Var.f(i15) + 25;
                                            f2 = ye1Var.f(i18);
                                        }
                                        i8 = f2;
                                    } else {
                                        z2 = z6;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = ye1Var.f(i17) + 4;
                                    i8 = ye1Var.f(i18);
                                }
                                z2 = z6;
                            } else {
                                int f9 = ye1Var.f(i16);
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
                                ye1Var.c();
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
                            int f10 = ye1Var.f(8);
                            if (f10 != 0) {
                                z4 = z3;
                                f3 = 1;
                            } else if (ye1Var.e()) {
                                z4 = z3;
                                f3 = ye1Var.f(7);
                                f10 = ye1Var.f(8);
                            } else {
                                int f11 = ye1Var.f(7);
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
                                bArr5 = b(4, 4, ye1Var);
                                break;
                            case 33:
                                bArr3 = b(4, 8, ye1Var);
                                break;
                            case 34:
                                bArr4 = b(16, 8, ye1Var);
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

    public static ys3 q(ye1 ye1Var, int i) {
        int f;
        int i2;
        int f2;
        int i3;
        int i4;
        int i5 = 8;
        int f3 = ye1Var.f(8);
        ye1Var.n(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] j = j();
        int[] k = k();
        while (i7 > 0) {
            int f4 = ye1Var.f(i5);
            int f5 = ye1Var.f(i5);
            int[] iArr2 = (f5 & 128) != 0 ? iArr : (f5 & 64) != 0 ? j : k;
            if ((f5 & 1) != 0) {
                i3 = ye1Var.f(i5);
                i4 = ye1Var.f(i5);
                f = ye1Var.f(i5);
                f2 = ye1Var.f(i5);
                i2 = i7 - 6;
            } else {
                int f6 = ye1Var.f(6) << i6;
                int f7 = ye1Var.f(4) << 4;
                f = ye1Var.f(4) << 4;
                i2 = i7 - 4;
                f2 = ye1Var.f(i6) << 6;
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
            iArr2[f4] = l((byte) (255 - (f2 & nm7.d4)), hac.i((int) ((1.402d * d2) + d), 0, nm7.d4), hac.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, nm7.d4), hac.i((int) ((d3 * 1.772d) + d), 0, nm7.d4));
            i7 = i2;
            i8 = 0;
            f3 = f3;
            k = k;
            i5 = 8;
            i6 = 2;
        }
        return new ys3(f3, iArr, j, k);
    }

    public static at3 s(ye1 ye1Var) {
        byte[] bArr;
        int f = ye1Var.f(16);
        ye1Var.n(4);
        int f2 = ye1Var.f(2);
        boolean e = ye1Var.e();
        ye1Var.n(1);
        byte[] bArr2 = hac.b;
        if (f2 == 1) {
            ye1Var.n(ye1Var.f(8) << 4);
        } else if (f2 == 0) {
            int f3 = ye1Var.f(16);
            int f4 = ye1Var.f(16);
            if (f3 > 0) {
                bArr2 = new byte[f3];
                ye1Var.i(f3, bArr2);
            }
            if (f4 > 0) {
                bArr = new byte[f4];
                ye1Var.i(f4, bArr);
                return new at3(f, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new at3(f, e, bArr2, bArr);
    }

    public static void y(FrameLayout frameLayout) {
        d05 d05Var = d05.e;
        Context context = frameLayout.getContext();
        int c = d05Var.c(context, e05.a);
        String b = r4d.b(context, c);
        String c2 = r4d.c(context, c);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a = d05Var.a(c, context, null);
        if (a != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c2);
            linearLayout.addView(button);
            button.setOnClickListener(new sd3(context, a));
        }
    }

    public final void A(f4d f4dVar) {
        if (((wm9) this.a) != null) {
            f4dVar.b();
            return;
        }
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.b = linkedList;
        }
        linkedList.add(f4dVar);
        cf9 cf9Var = (cf9) this.c;
        this.f = cf9Var;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.e;
        if (cf9Var == null || ((wm9) this.a) != null) {
            return;
        }
        try {
            synchronized (rk6.class) {
                rk6.a(context);
            }
            mye a0 = w2f.a(context).a0(new eq7(context));
            if (a0 != null) {
                ((cf9) this.f).z(new wm9((su) this.d, a0));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((wm9) this.a).s((u05) obj);
                }
                arrayList.clear();
            }
        } catch (RemoteException e) {
            i2d.h(e);
        } catch (w05 unused) {
        }
    }

    @Override // ir2
    public final Object a(Class cls) {
        return i(yy8.a(cls));
    }

    @Override // ir2
    public final Set c(yy8 yy8Var) {
        nv8 nv8Var;
        synchronized (this) {
            nv8Var = (g26) ((HashMap) this.c).get(yy8Var);
            if (nv8Var == null) {
                nv8Var = n;
            }
        }
        return (Set) nv8Var.get();
    }

    @Override // ir2
    public final nv8 d(Class cls) {
        return f(yy8.a(cls));
    }

    @Override // ir2
    public final xs7 e(yy8 yy8Var) {
        nv8 f = f(yy8Var);
        return f == null ? new xs7(xs7.c, xs7.d) : f instanceof xs7 ? (xs7) f : new xs7(null, f);
    }

    @Override // ir2
    public final synchronized nv8 f(yy8 yy8Var) {
        kte.a(yy8Var, "Null interface requested.");
        return (nv8) ((HashMap) this.b).get(yy8Var);
    }

    @Override // vcb
    public final /* synthetic */ lcb g(int i, int i2, byte[] bArr) {
        return hg9.c(this, bArr, i2);
    }

    @Override // mv8
    public final Object get() {
        Context context = (Context) ((mq5) this.a).a;
        of7 of7Var = (of7) ((mv8) this.b).get();
        mq9 mq9Var = (mq9) ((mv8) this.c).get();
        in3 in3Var = (in3) ((wm9) this.d).get();
        Executor executor = (Executor) ((mv8) this.e).get();
        mq9 mq9Var2 = (mq9) ((mv8) this.f).get();
        kg7 kg7Var = new kg7((byte) 29);
        k4f k4fVar = new k4f((byte) 28);
        mq9 mq9Var3 = (mq9) ((mv8) this.h).get();
        za0 za0Var = new za0();
        za0Var.a = context;
        za0Var.b = of7Var;
        za0Var.c = mq9Var;
        za0Var.d = in3Var;
        za0Var.e = executor;
        za0Var.f = mq9Var2;
        za0Var.g = kg7Var;
        za0Var.h = k4fVar;
        za0Var.i = mq9Var3;
        return za0Var;
    }

    public final void h(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            xq2 xq2Var = (xq2) entry.getKey();
            nv8 nv8Var = (nv8) entry.getValue();
            byte b = xq2Var.d;
            if (b == 1 || (b == 2 && z)) {
                nv8Var.get();
            }
        }
        l54 l54Var = (l54) this.e;
        synchronized (l54Var) {
            arrayDeque = l54Var.b;
            if (arrayDeque != null) {
                l54Var.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw kt6.l(it);
            }
        }
    }

    @Override // ir2
    public final Object i(yy8 yy8Var) {
        nv8 f = f(yy8Var);
        if (f == null) {
            return null;
        }
        return f.get();
    }

    public final void m() {
        x(null);
        bu5 bu5Var = (bu5) this.c;
        if (bu5Var != null) {
            bu5Var.u();
            this.c = null;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void n(boolean z) {
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
        h(hashMap, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // vcb
    public final void p(byte[] bArr, int i, int i2, ucb ucbVar, fu2 fu2Var) {
        i53 i53Var;
        SparseArray sparseArray;
        int i3;
        int i4;
        ArrayList arrayList;
        Paint paint;
        int i5;
        SparseArray sparseArray2;
        int i6;
        ct3 ct3Var;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int[] iArr2;
        SparseArray sparseArray3;
        int i10;
        Paint paint2;
        int i11;
        ct3 ct3Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        pr2 pr2Var = this;
        ye1 ye1Var = new ye1(i + i2, bArr);
        ye1Var.l(i);
        Paint paint3 = (Paint) pr2Var.b;
        Canvas canvas = (Canvas) pr2Var.c;
        et3 et3Var = (et3) pr2Var.f;
        SparseArray sparseArray4 = et3Var.f;
        SparseArray sparseArray5 = et3Var.g;
        int i16 = et3Var.b;
        SparseArray sparseArray6 = et3Var.c;
        SparseArray sparseArray7 = et3Var.d;
        SparseArray sparseArray8 = et3Var.e;
        int i17 = et3Var.a;
        while (ye1Var.b() >= 48 && ye1Var.f(8) == 15) {
            int f = ye1Var.f(8);
            int f2 = ye1Var.f(16);
            int f3 = ye1Var.f(16);
            int d = ye1Var.d() + f3;
            if ((f3 << 3) > ye1Var.b()) {
                ncd.f("DvbParser", "Data field length exceeds limit");
                ye1Var.n(ye1Var.b());
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
                            rk0 rk0Var = et3Var.i;
                            int i18 = 8;
                            ye1Var.f(8);
                            int f4 = ye1Var.f(4);
                            int f5 = ye1Var.f(2);
                            ye1Var.n(2);
                            int i19 = f3 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i19 > 0) {
                                int f6 = ye1Var.f(i18);
                                ye1Var.n(i18);
                                sparseArray9.put(f6, new bt3(ye1Var.f(16), ye1Var.f(16)));
                                i17 = i17;
                                i19 -= 6;
                                i18 = 8;
                            }
                            i11 = i17;
                            rk0 rk0Var2 = new rk0(f4, f5, sparseArray9);
                            if (f5 != 0) {
                                et3Var.i = rk0Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (rk0Var != null && rk0Var.b != f4) {
                                et3Var.i = rk0Var2;
                                break;
                            }
                        }
                        i11 = i17;
                        break;
                    case 17:
                        rk0 rk0Var3 = et3Var.i;
                        if (f2 == i17 && rk0Var3 != null) {
                            int f7 = ye1Var.f(8);
                            ye1Var.n(4);
                            boolean e = ye1Var.e();
                            ye1Var.n(3);
                            int f8 = ye1Var.f(16);
                            int f9 = ye1Var.f(16);
                            ye1Var.f(3);
                            int f10 = ye1Var.f(3);
                            int i20 = 2;
                            ye1Var.n(2);
                            int f11 = ye1Var.f(8);
                            int f12 = ye1Var.f(8);
                            int f13 = ye1Var.f(4);
                            int f14 = ye1Var.f(2);
                            ye1Var.n(2);
                            int i21 = f3 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i21 > 0) {
                                int i22 = i16;
                                int i23 = i21;
                                int f15 = ye1Var.f(16);
                                int f16 = ye1Var.f(i20);
                                ye1Var.f(i20);
                                Paint paint4 = paint3;
                                int f17 = ye1Var.f(12);
                                SparseArray sparseArray11 = sparseArray5;
                                ye1Var.n(4);
                                int f18 = ye1Var.f(12);
                                int i24 = i23 - 6;
                                if (f16 == 1 || f16 == 2) {
                                    ye1Var.f(8);
                                    ye1Var.f(8);
                                    i24 = i23 - 8;
                                }
                                sparseArray10.put(f15, new dt3(f17, f18));
                                i21 = i24;
                                i16 = i22;
                                paint3 = paint4;
                                sparseArray5 = sparseArray11;
                                i20 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i10 = i16;
                            paint2 = paint3;
                            ct3 ct3Var3 = new ct3(f7, e, f8, f9, f10, f11, f12, f13, f14, sparseArray10);
                            if (rk0Var3.c == 0 && (ct3Var2 = (ct3) sparseArray6.get(f7)) != null) {
                                SparseArray sparseArray12 = ct3Var2.j;
                                for (int i25 = 0; i25 < sparseArray12.size(); i25++) {
                                    ct3Var3.j.put(sparseArray12.keyAt(i25), (dt3) sparseArray12.valueAt(i25));
                                }
                            }
                            sparseArray6.put(ct3Var3.a, ct3Var3);
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
                            ys3 q = q(ye1Var, f3);
                            sparseArray7.put(q.a, q);
                        } else if (f2 == i16) {
                            ys3 q2 = q(ye1Var, f3);
                            sparseArray4.put(q2.a, q2);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 19:
                        if (f2 == i17) {
                            at3 s2 = s(ye1Var);
                            sparseArray8.put(s2.a, s2);
                        } else if (f2 == i16) {
                            at3 s3 = s(ye1Var);
                            sparseArray5.put(s3.a, s3);
                        }
                        sparseArray3 = sparseArray5;
                        i10 = i16;
                        paint2 = paint3;
                        i11 = i17;
                        break;
                    case 20:
                        if (f2 == i17) {
                            ye1Var.n(4);
                            boolean e2 = ye1Var.e();
                            ye1Var.n(3);
                            int f19 = ye1Var.f(16);
                            int f20 = ye1Var.f(16);
                            if (e2) {
                                int f21 = ye1Var.f(16);
                                int f22 = ye1Var.f(16);
                                int f23 = ye1Var.f(16);
                                i12 = f22;
                                i13 = ye1Var.f(16);
                                i15 = f23;
                                i14 = f21;
                            } else {
                                i12 = f19;
                                i13 = f20;
                                i14 = 0;
                                i15 = 0;
                            }
                            et3Var.h = new zs3(f19, f20, i14, i12, i15, i13);
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
                ye1Var.o(d - ye1Var.d());
            }
            i17 = i11;
            i16 = i10;
            paint3 = paint2;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint5 = paint3;
        rk0 rk0Var4 = et3Var.i;
        if (rk0Var4 == null) {
            ko5 ko5Var = mo5.b;
            i53Var = new i53(-9223372036854775807L, -9223372036854775807L, y79.e);
        } else {
            zs3 zs3Var = et3Var.h;
            if (zs3Var == null) {
                zs3Var = (zs3) pr2Var.d;
            }
            int i26 = zs3Var.b;
            int i27 = zs3Var.a;
            Bitmap bitmap = (Bitmap) pr2Var.h;
            if (bitmap == null || i27 + 1 != bitmap.getWidth() || i26 + 1 != ((Bitmap) pr2Var.h).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i27 + 1, i26 + 1, Bitmap.Config.ARGB_8888);
                pr2Var.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = (SparseArray) rk0Var4.d;
            int i28 = 0;
            while (i28 < sparseArray14.size()) {
                canvas.save();
                bt3 bt3Var = (bt3) sparseArray14.valueAt(i28);
                ct3 ct3Var4 = (ct3) sparseArray6.get(sparseArray14.keyAt(i28));
                int i29 = bt3Var.a + zs3Var.c;
                int i30 = bt3Var.b + zs3Var.e;
                int i31 = ct3Var4.c;
                int i32 = ct3Var4.f;
                SparseArray sparseArray15 = sparseArray14;
                int i33 = ct3Var4.d;
                int i34 = i26;
                int i35 = i29 + i31;
                int i36 = i27;
                SparseArray sparseArray16 = sparseArray6;
                int i37 = i30 + i33;
                int i38 = i28;
                canvas.clipRect(i29, i30, Math.min(i35, zs3Var.d), Math.min(i37, zs3Var.f));
                ys3 ys3Var = (ys3) sparseArray7.get(i32);
                if (ys3Var == null && (ys3Var = (ys3) sparseArray4.get(i32)) == null) {
                    ys3Var = (ys3) pr2Var.e;
                }
                int[] iArr3 = ys3Var.b;
                int[] iArr4 = ys3Var.c;
                int[] iArr5 = ys3Var.d;
                zs3 zs3Var2 = zs3Var;
                SparseArray sparseArray17 = ct3Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i39 = 0;
                while (i39 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i39);
                    SparseArray sparseArray19 = sparseArray17;
                    dt3 dt3Var = (dt3) sparseArray17.valueAt(i39);
                    at3 at3Var = (at3) sparseArray8.get(keyAt);
                    int i40 = i39;
                    SparseArray sparseArray20 = sparseArray13;
                    if (at3Var == null) {
                        at3Var = (at3) sparseArray20.get(keyAt);
                    }
                    at3 at3Var2 = at3Var;
                    if (at3Var2 != null) {
                        sparseArray13 = sparseArray20;
                        Paint paint6 = at3Var2.b ? null : (Paint) pr2Var.a;
                        ct3 ct3Var5 = ct3Var4;
                        int i41 = ct3Var5.e;
                        int i42 = dt3Var.a + i29;
                        int i43 = dt3Var.b + i30;
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
                        ct3Var = ct3Var5;
                        iArr = iArr4;
                        i5 = i33;
                        i6 = i9;
                        o(at3Var2.c, iArr2, i41, i42, i43, paint6, canvas);
                        o(at3Var2.d, iArr2, i41, i42, i43 + 1, paint6, canvas);
                    } else {
                        i5 = i33;
                        sparseArray13 = sparseArray20;
                        sparseArray2 = sparseArray8;
                        i6 = i30;
                        ct3Var = ct3Var4;
                        i7 = i29;
                        i8 = i31;
                        iArr = iArr4;
                    }
                    pr2Var = this;
                    i29 = i7;
                    i30 = i6;
                    ct3Var4 = ct3Var;
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
                ct3 ct3Var6 = ct3Var4;
                int i46 = i29;
                int i47 = i31;
                int[] iArr6 = iArr4;
                if (ct3Var6.b) {
                    int i48 = ct3Var6.e;
                    int i49 = i48 == 3 ? iArr5[ct3Var6.g] : i48 == 2 ? iArr6[ct3Var6.h] : iArr3[ct3Var6.i];
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
                arrayList.add(new f53(null, null, null, createBitmap2, f26 / f27, 0, 0, f25, 0, TLObject.FLAG_31, -3.4028235E38f, i47 / f24, i44 / f27, false, -16777216, TLObject.FLAG_31, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                pr2Var = this;
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
                zs3Var = zs3Var2;
            }
            i53Var = new i53(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        fu2Var.accept(i53Var);
    }

    @Override // vcb
    public final int r() {
        return 2;
    }

    @Override // vcb
    public final void reset() {
        et3 et3Var = (et3) this.f;
        et3Var.c.clear();
        et3Var.d.clear();
        et3Var.e.clear();
        et3Var.f.clear();
        et3Var.g.clear();
        et3Var.h = null;
        et3Var.i = null;
    }

    public final void t(xk9 xk9Var, ArrayList arrayList) {
        ylb ylbVar = (ylb) this.b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ud9 ud9Var = (ud9) obj;
                rz8 rz8Var = new rz8(xk9Var.getContext(), ud9Var, ylbVar);
                rz8Var.setPadding(gm.L(8.0f), 0, gm.L(12.0f), 0);
                rz8Var.setBackground(cmb.Y(cmb.v0(cmb.h6, ylbVar), 0, 0));
                rz8Var.setOnClickListener(new jw4(this, xk9Var, ud9Var, (byte) 17));
                ((LinearLayout) this.d).addView(rz8Var, qoe.o(-1, 48));
            }
        }
    }

    public final void u() {
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (xq2 xq2Var : ((HashMap) this.a).keySet()) {
            for (if3 if3Var : xq2Var.c) {
                boolean z = if3Var.b == 2;
                yy8 yy8Var = if3Var.a;
                if (z && !hashMap2.containsKey(yy8Var)) {
                    Set set = Collections.EMPTY_SET;
                    g26 g26Var = new g26();
                    g26Var.b = null;
                    g26Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    g26Var.a.addAll(set);
                    hashMap2.put(yy8Var, g26Var);
                } else if (hashMap.containsKey(yy8Var)) {
                    continue;
                } else {
                    byte b = if3Var.b;
                    if (b == 1) {
                        throw new jf3("Unsatisfied dependency for component " + xq2Var + ": " + yy8Var);
                    }
                    if (b != 2) {
                        hashMap.put(yy8Var, new xs7(xs7.c, xs7.d));
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
            xq2 xq2Var = (xq2) obj;
            if (!xq2Var.e) {
                nv8 nv8Var = (nv8) ((HashMap) this.a).get(xq2Var);
                for (yy8 yy8Var : xq2Var.b) {
                    if (hashMap.containsKey(yy8Var)) {
                        arrayList2.add(new ra2((xs7) ((nv8) hashMap.get(yy8Var)), nv8Var, (byte) 25));
                    } else {
                        hashMap.put(yy8Var, nv8Var);
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
            xq2 xq2Var = (xq2) entry.getKey();
            if (xq2Var.e) {
                nv8 nv8Var = (nv8) entry.getValue();
                for (yy8 yy8Var : xq2Var.b) {
                    if (!hashMap2.containsKey(yy8Var)) {
                        hashMap2.put(yy8Var, new HashSet());
                    }
                    ((Set) hashMap2.get(yy8Var)).add(nv8Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                g26 g26Var = (g26) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ra2(g26Var, (nv8) it.next(), (byte) 26));
                }
            } else {
                yy8 yy8Var2 = (yy8) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                g26 g26Var2 = new g26();
                g26Var2.b = null;
                g26Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                g26Var2.a.addAll(set);
                hashMap.put(yy8Var2, g26Var2);
            }
        }
        return arrayList;
    }

    public final void x(xk9 xk9Var) {
        xk9 xk9Var2 = (xk9) this.h;
        if (xk9Var2 != xk9Var) {
            if (xk9Var2 != null) {
                xk9Var2.setShowCommandBackground(false);
            }
            this.h = xk9Var;
            if (xk9Var != null) {
                xk9Var.setShowCommandBackground(true);
            }
        }
    }

    public final void z(xk9 xk9Var, String str) {
        bu5 bu5Var;
        bu5 bu5Var2;
        if (str == null) {
            m();
            return;
        }
        ArrayList a = ud9.a(str);
        if (a.isEmpty()) {
            m();
            return;
        }
        x(xk9Var);
        if (((xk9) this.f) == xk9Var && a.equals((ArrayList) this.e) && (bu5Var2 = (bu5) this.c) != null && bu5Var2.E()) {
            return;
        }
        if (((xk9) this.f) == xk9Var && (bu5Var = (bu5) this.c) != null && bu5Var.E() && ((LinearLayout) this.d) != null) {
            this.e = a;
            t(xk9Var, a);
            ((bu5) this.c).P();
            return;
        }
        m();
        x(xk9Var);
        this.f = xk9Var;
        this.e = a;
        LinearLayout linearLayout = new LinearLayout(xk9Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        t(xk9Var, a);
        bu5 d = ((vd9) this.a).d(xk9Var.getEditText());
        d.T = true;
        d.s = (short) 0;
        d.t = false;
        d.q((LinearLayout) this.d, qoe.o(nm7.w3, -2));
        d.a0 = gm.L(240.0f);
        d.i = (byte) 3;
        d.b0(-gm.L(12.0f), 0.0f);
        d.p = new pp8(this, (byte) 28);
        d.g0 = true;
        if (d.E()) {
            d.D();
        }
        d.a0();
        this.c = d;
    }

    public pr2(vd9 vd9Var, ylb ylbVar) {
        this.a = vd9Var;
        this.b = ylbVar;
    }
}
