// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sm2 implements g94, mv8, uj5, u29, lv8, ir2, cx9, lcb {
    public static final ju6 h = new ju6(4);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public sm2(int[] iArr, int i, nw7[] nw7VarArr) {
        rm2 rm2Var;
        this.a = (byte) 0;
        this.f = new float[3];
        this.e = nw7VarArr;
        int[] iArr2 = new int[32768];
        this.c = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int C = (C(Color.red(i3), 8, 5) << 10) | (C(Color.green(i3), 8, 5) << 5) | C(Color.blue(i3), 8, 5);
            iArr[i2] = C;
            iArr2[C] = iArr2[C] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb(C((i5 >> 10) & 31, 5, 8), C((i5 >> 5) & 31, 5, 8), C(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.f;
                on2.j(rgb, fArr);
                if (O(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.d = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.d).add(new pw7(Color.rgb(C((i9 >> 10) & 31, 5, 8), C((i9 >> 5) & 31, 5, 8), C(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, h);
        priorityQueue.offer(new rm2(this, 0, ((int[]) this.b).length - 1));
        while (priorityQueue.size() < i && (rm2Var = (rm2) priorityQueue.poll()) != null) {
            int i10 = rm2Var.b;
            int i11 = rm2Var.a;
            if ((i10 + 1) - i11 <= 1) {
                break;
            }
            sm2 sm2Var = rm2Var.j;
            if ((i10 + 1) - i11 <= 1) {
                dq9.m("Can not split a box with only 1 color");
                throw null;
            }
            int i12 = rm2Var.e - rm2Var.d;
            int i13 = rm2Var.g - rm2Var.f;
            int i14 = rm2Var.i - rm2Var.h;
            int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) sm2Var.b;
            int[] iArr5 = (int[]) sm2Var.c;
            B(i15, i11, i10, iArr4);
            Arrays.sort(iArr4, i11, rm2Var.b + 1);
            B(i15, i11, rm2Var.b, iArr4);
            int i16 = rm2Var.c / 2;
            int i17 = 0;
            int i18 = i11;
            while (true) {
                int i19 = rm2Var.b;
                if (i18 > i19) {
                    break;
                }
                i17 += iArr5[iArr4[i18]];
                if (i17 >= i16) {
                    i11 = Math.min(i19 - 1, i18);
                    break;
                }
                i18++;
            }
            rm2 rm2Var2 = new rm2(sm2Var, i11 + 1, rm2Var.b);
            rm2Var.b = i11;
            rm2Var.a();
            priorityQueue.offer(rm2Var2);
            priorityQueue.offer(rm2Var);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            rm2 rm2Var3 = (rm2) it.next();
            sm2 sm2Var2 = rm2Var3.j;
            int[] iArr6 = (int[]) sm2Var2.b;
            int[] iArr7 = (int[]) sm2Var2.c;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = rm2Var3.a; i24 <= rm2Var3.b; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            pw7 pw7Var = new pw7(Color.rgb(C(Math.round(i20 / f), 5, 8), C(Math.round(i22 / f), 5, 8), C(Math.round(i23 / f), 5, 8)), i21);
            if (!O(pw7Var.b())) {
                arrayList.add(pw7Var);
            }
        }
        this.d = arrayList;
    }

    public static void B(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5) | (i4 & 31);
                i2++;
            }
            return;
        }
        if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5) | ((i5 >> 10) & 31);
                i2++;
            }
        }
    }

    public static int C(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static void R(sm2 sm2Var, yjf yjfVar) {
        njf S;
        byte b = yjfVar.e;
        if (b == 2 && ((njf) sm2Var.e) != null) {
            sm2Var.T();
        }
        if (b == 2) {
            S = new njf((i8e) sm2Var.b, (String) sm2Var.d);
            sm2Var.e = S;
        } else {
            S = sm2Var.S();
            sm2Var.e = S;
        }
        ite.h(S);
        yjfVar.d = S.h;
        S.b.add(yjfVar);
    }

    public static Exception y(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public final sdb A(int i) {
        sdb sdbVar;
        HashMap hashMap = (HashMap) this.c;
        sdb sdbVar2 = (sdb) hashMap.get(Integer.valueOf(i));
        if (sdbVar2 != null) {
            return sdbVar2;
        }
        final lx6 lx6Var = (lx6) this.e;
        lx6Var.getClass();
        final byte b = 0;
        if (i != 0) {
            final byte b2 = 1;
            if (i != 1) {
                final byte b3 = 2;
                if (i != 2) {
                    final byte b4 = 3;
                    if (i == 3) {
                        sdbVar = new ad3(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(qz6.class), b);
                    } else {
                        if (i != 4) {
                            u36.j(hg9.j(i, "Unrecognized contentType: "));
                            return null;
                        }
                        sdbVar = new sdb() { // from class: zc3
                            @Override // sdb
                            public final Object get() {
                                byte b5 = b4;
                                lx6 lx6Var2 = lx6Var;
                                Object obj = this;
                                switch (b5) {
                                    case 0:
                                        return cd3.e((Class) obj, lx6Var2);
                                    case 1:
                                        return cd3.e((Class) obj, lx6Var2);
                                    case 2:
                                        return cd3.e((Class) obj, lx6Var2);
                                    default:
                                        return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(qz6.class);
                    sdbVar = new sdb() { // from class: zc3
                        @Override // sdb
                        public final Object get() {
                            byte b5 = b3;
                            lx6 lx6Var2 = lx6Var;
                            Object obj = asSubclass;
                            switch (b5) {
                                case 0:
                                    return cd3.e((Class) obj, lx6Var2);
                                case 1:
                                    return cd3.e((Class) obj, lx6Var2);
                                case 2:
                                    return cd3.e((Class) obj, lx6Var2);
                                default:
                                    return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(qz6.class);
                sdbVar = new sdb() { // from class: zc3
                    @Override // sdb
                    public final Object get() {
                        byte b5 = b2;
                        lx6 lx6Var2 = lx6Var;
                        Object obj = asSubclass2;
                        switch (b5) {
                            case 0:
                                return cd3.e((Class) obj, lx6Var2);
                            case 1:
                                return cd3.e((Class) obj, lx6Var2);
                            case 2:
                                return cd3.e((Class) obj, lx6Var2);
                            default:
                                return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(qz6.class);
            sdbVar = new sdb() { // from class: zc3
                @Override // sdb
                public final Object get() {
                    byte b5 = b;
                    lx6 lx6Var2 = lx6Var;
                    Object obj = asSubclass3;
                    switch (b5) {
                        case 0:
                            return cd3.e((Class) obj, lx6Var2);
                        case 1:
                            return cd3.e((Class) obj, lx6Var2);
                        case 2:
                            return cd3.e((Class) obj, lx6Var2);
                        default:
                            return new vu8(lx6Var2, (wb3) ((sm2) obj).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i), sdbVar);
        return sdbVar;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        ((TextView) this.c).setAlpha(gm.R1(0.5f, 1.0f, ((fn0) this.e).e));
        ((zv1) this.f).b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i, int i2, Intent intent) {
        FileOutputStream fileOutputStream;
        etc etcVar = (etc) this.e;
        if (i2 == -1) {
            ?? r10 = 10;
            FileOutputStream fileOutputStream2 = null;
            if (i != 10) {
                if (i != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.f = new File(bc4.z(4), Utilities.b.nextInt() + ".jpg");
                    Point b1 = gm.b1();
                    Bitmap G = fn5.G(null, intent.getData(), (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) this.f));
                    etcVar.b((File) this.f, G, false);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            gm.e((String) this.b);
            try {
                try {
                    this.f = new File(bc4.z(4), Utilities.b.nextInt() + ".jpg");
                    Point b12 = gm.b1();
                    Bitmap G2 = fn5.G((String) this.b, null, (float) b12.x, (float) b12.y, true);
                    fileOutputStream = new FileOutputStream((File) this.f);
                    try {
                        G2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        etcVar.b((File) this.f, G2, false);
                        r10 = fileOutputStream;
                    } catch (Exception e2) {
                        e = e2;
                        fc4.g(e, true);
                        r10 = fileOutputStream;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = r10;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                            fc4.g(e3, true);
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                r10.close();
            } catch (Exception e5) {
                fc4.g(e5, true);
            }
            this.b = null;
        }
    }

    public final void F() {
        su suVar = (su) this.b;
        pr2 pr2Var = (pr2) suVar.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            pr2Var.getClass();
            pr2Var.A(new f4d(pr2Var, (byte) 0));
            if (((wm9) pr2Var.a) == null) {
                pr2.y(suVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void G() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var == null) {
            while (!((LinkedList) pr2Var.b).isEmpty() && ((f4d) ((LinkedList) pr2Var.b).getLast()).a() >= 1) {
                ((LinkedList) pr2Var.b).removeLast();
            }
        } else {
            try {
                mye myeVar = (mye) wm9Var.c;
                myeVar.V(myeVar.R(), 5);
            } catch (RemoteException e) {
                i2d.h(e);
            }
        }
    }

    public final void H() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var == null) {
            while (!((LinkedList) pr2Var.b).isEmpty() && ((f4d) ((LinkedList) pr2Var.b).getLast()).a() >= 5) {
                ((LinkedList) pr2Var.b).removeLast();
            }
        } else {
            try {
                mye myeVar = (mye) wm9Var.c;
                myeVar.V(myeVar.R(), 4);
            } catch (RemoteException e) {
                i2d.h(e);
            }
        }
    }

    public final void I() {
        pr2 pr2Var = (pr2) ((su) this.b).b;
        pr2Var.getClass();
        pr2Var.A(new f4d(pr2Var, (byte) 1));
    }

    public final void J() {
        WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.d;
        if (wallpapersListActivity == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) this.c).startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        if (parentActivity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                    return;
                }
            } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        j68 j68Var = new j68(2, false, false, null);
        j68Var.y = false;
        j68Var.W = new et8((Object) this, (byte) 22);
        wallpapersListActivity.presentFragment(j68Var);
    }

    public final void K(String str, String... strArr) {
        Bundle bundle = (Bundle) this.b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            v6f.a("String array is empty and is ignored by put method.");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
            String str2 = strArr2[i2];
            strArr2[i] = str2;
            if (strArr2[i2] == null) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("String at ");
                sb.append(i2);
                sb.append(" is null and is ignored by put method.");
                v6f.a(sb.toString());
            } else {
                int i3 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("String at ");
                    sb2.append(i2);
                    sb2.append(" is too long, truncating string.");
                    v6f.a(sb2.toString());
                    String str3 = strArr2[i];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i3 = 19999;
                        }
                        str3 = str3.substring(0, i3);
                    }
                    strArr2[i] = str3;
                }
                i++;
            }
        }
        if (i > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i);
            if (objArr.length >= 100) {
                v6f.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Task L() {
        Task forException;
        int i;
        boolean z = z();
        final byte b = 0;
        Object[] objArr = 0;
        final byte b2 = 1;
        if (z && ((mf7) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new op7("Firebase-Messaging-Network-Io"));
            return ((si4) ((ti4) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: a05
                public final /* synthetic */ sm2 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b2;
                    ExecutorService executorService = newSingleThreadExecutor;
                    sm2 sm2Var = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            li4 li4Var = (li4) sm2Var.c;
                            li4Var.a();
                            zi4 zi4Var = li4Var.c;
                            String str3 = zi4Var.a;
                            li4Var.a();
                            m79 m79Var = new m79(mf7.b(li4Var), zi4Var.b, str3, str, str2);
                            ua4 ua4Var = (ua4) sm2Var.b;
                            bib b4 = cib.b();
                            b4.c = new o94[]{pjd.a};
                            b4.a = new xab(ua4Var, m79Var, false, (byte) 18);
                            b4.d = (char) 39001;
                            return ua4Var.e(0, b4.a()).continueWith(executorService, new ca4(str, (byte) 1));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(sm2.y(task)) : ((si4) ((ti4) sm2Var.d)).e().continueWithTask(executorService, new ca4(sm2Var, ((xa0) task.getResult()).a));
                    }
                }
            }).continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: a05
                public final /* synthetic */ sm2 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    byte b3 = b;
                    ExecutorService executorService = newSingleThreadExecutor;
                    sm2 sm2Var = this.b;
                    switch (b3) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(sm2.y(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            li4 li4Var = (li4) sm2Var.c;
                            li4Var.a();
                            zi4 zi4Var = li4Var.c;
                            String str3 = zi4Var.a;
                            li4Var.a();
                            m79 m79Var = new m79(mf7.b(li4Var), zi4Var.b, str3, str, str2);
                            ua4 ua4Var = (ua4) sm2Var.b;
                            bib b4 = cib.b();
                            b4.c = new o94[]{pjd.a};
                            b4.a = new xab(ua4Var, m79Var, false, (byte) 18);
                            b4.d = (char) 39001;
                            return ua4Var.e(0, b4.a()).continueWith(executorService, new ca4(str, (byte) 1));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(sm2.y(task)) : ((si4) ((ti4) sm2Var.d)).e().continueWithTask(executorService, new ca4(sm2Var, ((xa0) task.getResult()).a));
                    }
                }
            });
        }
        eq eqVar = (eq) this.e;
        String b3 = mf7.b((li4) eqVar.a);
        Bundle bundle = new Bundle();
        try {
            eqVar.j(b3, bundle, z);
            fo9 fo9Var = (fo9) eqVar.c;
            gp3 gp3Var = gp3.d;
            ajf ajfVar = fo9Var.c;
            if (ajfVar.b() >= 12000000) {
                jif t = jif.t(fo9Var.b);
                synchronized (t) {
                    i = t.a;
                    t.a = i + 1;
                }
                forException = t.u(new fdf(i, 1, bundle, (byte) 1)).continueWith(gp3Var, h8d.b);
            } else if (ajfVar.a() != 0) {
                forException = fo9Var.d(bundle).continueWithTask(gp3Var, new rhb(fo9Var, bundle, objArr == true ? 1 : 0, (byte) 24));
            } else {
                forException = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
        } catch (InterruptedException | ExecutionException e) {
            forException = Tasks.forException(e);
        }
        return forException.continueWith(new kc(b2), new zo4(eqVar));
    }

    public final void M() {
        wb3 wb3Var = (wb3) this.b;
        synchronized (wb3Var) {
            wb3Var.d = true;
        }
    }

    public final Set N(Class cls) {
        return c(yy8.a(cls));
    }

    public final boolean O(float[] fArr) {
        nw7[] nw7VarArr = (nw7[]) this.e;
        if (nw7VarArr != null && nw7VarArr.length > 0) {
            for (nw7 nw7Var : nw7VarArr) {
                nw7Var.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void P(Uri uri) {
        b1e b1eVar;
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            Q();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        Q();
        this.d = uri;
        em5 em5Var = (em5) this.c;
        int i2 = em5Var.b;
        if (i2 == 0 || (i = em5Var.c) == 0) {
            b1eVar = new b1e(context, 0, 0, this);
            this.e = b1eVar;
        } else {
            b1eVar = new b1e(context, i2, i, this);
            this.e = b1eVar;
        }
        Uri uri2 = (Uri) this.d;
        ite.h(uri2);
        b1eVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public final void Q() {
        b1e b1eVar = (b1e) this.e;
        if (b1eVar != null) {
            b1eVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    public final njf S() {
        if (((njf) this.e) == null) {
            njf njfVar = new njf((i8e) this.b, (String) this.d);
            this.e = njfVar;
            njfVar.b(1);
        }
        return (njf) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void T() {
        int i;
        y5f y5fVar;
        int i2;
        long j;
        njf njfVar = (njf) this.e;
        if (njfVar != null) {
            Map map = njfVar.e;
            List<obf> list = njfVar.d;
            List<q7d> list2 = njfVar.c;
            List<yjf> list3 = njfVar.b;
            me1 me1Var = njfVar.j;
            if (me1Var != null) {
                me1Var.l = null;
                njfVar.j = null;
            }
            long j2 = njfVar.i;
            y5f m = a6f.m();
            m.c();
            a6f.t((a6f) m.b, j2);
            String str = njfVar.l;
            if (str != null) {
                m.c();
                a6f.y((a6f) m.b, str);
            }
            String str2 = njfVar.m;
            if (str2 != null) {
                m.c();
                a6f.u((a6f) m.b, str2);
            }
            h5f l = k5f.l();
            String str3 = njf.o;
            l.c();
            k5f.n((k5f) l.b, str3);
            String str4 = njfVar.g;
            l.c();
            k5f.m((k5f) l.b, str4);
            k5f k5fVar = (k5f) l.a();
            m.c();
            a6f.r((a6f) m.b, k5fVar);
            ix2 ix2Var = njfVar.a;
            l6f l2 = n6f.l();
            Object zza = ix2Var.zza();
            if (zza != null) {
                h8f l3 = j8f.l();
                l3.c();
                j8f.m((j8f) l3.b, (String) zza);
                j8f j8fVar = (j8f) l3.a();
                l2.c();
                n6f.m((n6f) l2.b, j8fVar);
            }
            String str5 = njfVar.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    ce6 ce6Var = njf.n;
                    Log.w(ce6Var.a, ce6Var.d("receiverSessionId %s is not valid for hash", str5), e);
                    j = 0;
                }
                l2.c();
                n6f.n((n6f) l2.b, j);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (yjf yjfVar : list3) {
                    yjfVar.getClass();
                    h6f l4 = j6f.l();
                    byte b = yjfVar.e;
                    l4.c();
                    j6f.p((j6f) l4.b, b);
                    int i3 = (int) (yjfVar.b - yjfVar.d);
                    l4.c();
                    j6f.m((j6f) l4.b, i3);
                    Integer num = yjfVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l4.c();
                        j6f.n((j6f) l4.b, intValue);
                    }
                    Boolean bool = yjfVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l4.c();
                        j6f.o((j6f) l4.b, booleanValue);
                    }
                    arrayList.add((j6f) l4.a());
                }
                l2.c();
                n6f.o((n6f) l2.b, arrayList);
            }
            int i4 = 2;
            if (list2.isEmpty()) {
                i = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (q7d q7dVar : list2) {
                    q7dVar.getClass();
                    u6f l5 = w6f.l();
                    int i5 = (int) (q7dVar.b - q7dVar.c);
                    l5.c();
                    w6f.m((w6f) l5.b, i5);
                    byte b2 = q7dVar.a;
                    int i6 = b2 != 1 ? b2 != 2 ? b2 != 3 ? 1 : 4 : 3 : 2;
                    l5.c();
                    w6f.n((w6f) l5.b, i6);
                    arrayList2.add((w6f) l5.a());
                }
                i = 1;
                l2.c();
                n6f.q((n6f) l2.b, arrayList2);
            }
            if (list.isEmpty()) {
                y5fVar = m;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (obf obfVar : list) {
                    String str6 = obfVar.a;
                    d6f l6 = f6f.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i2 = 13;
                                break;
                            }
                            i2 = i;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i2 = 22;
                                break;
                            }
                            i2 = i;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i2 = 15;
                                break;
                            }
                            i2 = i;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i2 = 19;
                                break;
                            }
                            i2 = i;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i2 = 23;
                                break;
                            }
                            i2 = i;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i2 = 9;
                                break;
                            }
                            i2 = i;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i2 = 21;
                                break;
                            }
                            i2 = i;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i2 = 10;
                                break;
                            }
                            i2 = i;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i2 = 14;
                                break;
                            }
                            i2 = i;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i2 = 7;
                                break;
                            }
                            i2 = i;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i2 = 20;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i2 = i4;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i2 = 8;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i2 = 3;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i2 = 6;
                                break;
                            }
                            i2 = i;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i2 = 5;
                                break;
                            }
                            i2 = i;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i2 = 4;
                                break;
                            }
                            i2 = i;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i2 = 18;
                                break;
                            }
                            i2 = i;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i2 = 16;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i2 = 12;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i2 = 11;
                                break;
                            }
                            i2 = i;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i2 = 17;
                                break;
                            }
                            i2 = i;
                            break;
                        default:
                            i2 = i;
                            break;
                    }
                    l6.c();
                    f6f.q((f6f) l6.b, i2);
                    int i7 = (int) obfVar.b;
                    l6.c();
                    f6f.m((f6f) l6.b, i7);
                    int i8 = obfVar.c;
                    l6.c();
                    f6f.n((f6f) l6.b, i8);
                    int i9 = (int) (obfVar.d - obfVar.f);
                    l6.c();
                    f6f.o((f6f) l6.b, i9);
                    int i10 = (int) (obfVar.e - obfVar.f);
                    l6.c();
                    f6f.p((f6f) l6.b, i10);
                    arrayList3.add((f6f) l6.a());
                    m = m;
                    i4 = 2;
                }
                y5fVar = m;
                l2.c();
                n6f.p((n6f) l2.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (c8d c8dVar : map.values()) {
                    c8dVar.getClass();
                    p6f l7 = r6f.l();
                    byte b3 = c8dVar.e;
                    l7.c();
                    r6f.p((r6f) l7.b, b3);
                    int i11 = c8dVar.d.get();
                    l7.c();
                    r6f.m((r6f) l7.b, i11);
                    int i12 = (int) (c8dVar.a - c8dVar.c);
                    l7.c();
                    r6f.n((r6f) l7.b, i12);
                    int i13 = (int) (c8dVar.b - c8dVar.c);
                    l7.c();
                    r6f.o((r6f) l7.b, i13);
                    arrayList4.add((r6f) l7.a());
                }
                l2.c();
                n6f.r((n6f) l2.b, arrayList4);
            }
            n6f n6fVar = (n6f) l2.a();
            y5fVar.c();
            a6f.q((a6f) y5fVar.b, n6fVar);
            njfVar.f.a((a6f) y5fVar.a(), nm7.I3);
            this.e = null;
        }
    }

    @Override // ir2
    public final Object a(Class cls) {
        if (!((Set) this.b).contains(yy8.a(cls))) {
            i98.h(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object a = ((ir2) this.f).a(cls);
        if (!cls.equals(uw8.class)) {
            return a;
        }
        return new oc9();
    }

    @Override // lcb
    public final int b(long j) {
        long[] jArr = (long[]) this.c;
        int b = hac.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // ir2
    public final Set c(yy8 yy8Var) {
        if (((Set) this.e).contains(yy8Var)) {
            return ((ir2) this.f).c(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // ir2
    public final nv8 d(Class cls) {
        return f(yy8.a(cls));
    }

    @Override // ir2
    public final xs7 e(yy8 yy8Var) {
        if (((Set) this.d).contains(yy8Var)) {
            return ((ir2) this.f).e(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // ir2
    public final nv8 f(yy8 yy8Var) {
        if (((Set) this.c).contains(yy8Var)) {
            return ((ir2) this.f).f(yy8Var);
        }
        i98.h(yy8Var, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // u29
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        xv7 xv7Var = (xv7) this.f;
        g29 g29Var = xv7Var.Q1;
        if (g29Var == null) {
            return;
        }
        g29Var.s(k39Var, true);
        xv7Var.O0(false);
    }

    @Override // mv8
    public final Object get() {
        switch (this.a) {
            case 6:
                return new kd3((Executor) ((mv8) this.b).get(), (of7) ((mv8) this.c).get(), (in3) ((wm9) this.d).get(), (mq9) ((mv8) this.e).get(), (mq9) ((mv8) this.f).get());
            case 12:
                return new p89((tpb) ((lv8) this.b).get(), (ti4) ((lq5) this.c).a, (ss) ((lv8) this.d).get(), (r89) ((lv8) this.e).get(), (haa) ((lv8) this.f).get());
            default:
                return new i8a((li4) ((lq5) this.b).a, (ti4) ((lq5) this.c).a, (l9a) ((lv8) this.d).get(), (m54) ((lv8) this.e).get(), (cy2) ((lq5) this.f).a);
        }
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // ir2
    public final Object i(yy8 yy8Var) {
        if (((Set) this.b).contains(yy8Var)) {
            return ((ir2) this.f).i(yy8Var);
        }
        i98.h(yy8Var, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public final byte[] j() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = auc.b;
        BigInteger bigInteger3 = auc.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            dq9.m("our pubkey invalid (extremely unlikely)");
            return null;
        }
        byte[] b = auc.b(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            u36.j("peer pubkey out of range");
            return null;
        }
        byte[] b2 = auc.b(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] d = auc.d(b2, bArr2, bArr3);
        byte[] d2 = auc.d(b2, bArr);
        this.f = d;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "🪏", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "🫆", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            int i2 = i << 3;
            arrayList.add(strArr[(int) ((((((((((d2[i2] & 127) << 56) | ((d2[i2 + 1] & 255) << 48)) | ((d2[i2 + 2] & 255) << 40)) | ((d2[i2 + 3] & 255) << 32)) | ((d2[i2 + 4] & 255) << 24)) | ((d2[i2 + 5] & 255) << 16)) | ((d2[i2 + 6] & 255) << 8)) | (d2[i2 + 7] & 255)) % 200)]);
        }
        this.d = arrayList;
        fc4.b("wear-auth: built answer; session " + auc.c(bArr2) + " emojis=" + ((ArrayList) this.d));
        byte[] bArr4 = new byte[nm7.K4];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(b, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    @Override // lcb
    public final long k(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        Paint paint;
        sm0 sm0Var;
        Path path = (Path) this.c;
        wm0 wm0Var = (wm0) this.d;
        Paint paint2 = (Paint) this.e;
        xv7 xv7Var = (xv7) this.f;
        if (!z && (sm0Var = xv7Var.U1) != null && sm0Var.c()) {
            if (z) {
                wm0Var = (wm0) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            wm0Var.b(canvas, true);
            paint2.setAlpha((int) (i * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z) {
            wm0 wm0Var2 = (wm0) this.b;
            if (wm0Var2 == null) {
                wm0Var2 = new wm0(xv7Var.U1, xv7Var.P1.getReactionsWindow().c, 0, false);
                this.b = wm0Var2;
            }
            float f4 = -f2;
            float f5 = -f3;
            wm0Var2.e(f4, f5, xv7Var.getMeasuredWidth() + f4, xv7Var.getMeasuredHeight() + f5);
            paint = ((wm0) this.b).h;
        } else {
            float f6 = -f2;
            float f7 = -f3;
            wm0Var.e(f6, f7, xv7Var.getMeasuredWidth() + f6, xv7Var.getMeasuredHeight() + f7);
            paint = wm0Var.h;
        }
        paint.setAlpha(i);
        paint2.setAlpha((int) (i * 0.4f));
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRoundRect(rectF, f, f, paint2);
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((or9) this.f).d;
        qr9 qr9Var = (qr9) this.e;
        qr9 qr9Var2 = (qr9) this.c;
        qr9 qr9Var3 = (qr9) this.d;
        boolean isAttachedToWindow = ((dx9) this.b).isAttachedToWindow();
        long A = (long) (f > 0.7f ? (((f - 0.7f) / 0.3f) * 4.0894464E9f) + 1.048576E8f : b10.A(f, 0.7f, 1.0433331E8f, 524288.0f));
        if (f >= 1.0f) {
            qr9Var2.e(false, isAttachedToWindow);
            qr9Var3.e(false, isAttachedToWindow);
            qr9Var.e(true, isAttachedToWindow);
            gm.T3(qr9Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f == 0.0f) {
            qr9Var2.e(true, isAttachedToWindow);
            qr9Var3.e(false, isAttachedToWindow);
            qr9Var.e(false, isAttachedToWindow);
            gm.T3(qr9Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            qr9Var3.c(jb6.a0("UpToFileSize", null, 2131743510, gm.i0(A, true, false)), false, true);
            qr9Var2.e(false, isAttachedToWindow);
            qr9Var3.e(true, isAttachedToWindow);
            qr9Var.e(false, isAttachedToWindow);
            gm.T3(qr9Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z) {
            saveToGallerySettingsActivity.c0().c = A;
            saveToGallerySettingsActivity.d0();
        }
    }

    @Override // lcb
    public final List p(long j) {
        n4c n4cVar = (n4c) this.b;
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        n4cVar.g(j, n4cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        n4cVar.i(j, false, n4cVar.h, treeMap);
        n4cVar.h(j, map, hashMap, n4cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                q4c q4cVar = (q4c) hashMap.get(pair.first);
                q4cVar.getClass();
                arrayList2.add(new f53(null, null, null, decodeByteArray, q4cVar.c, 0, q4cVar.e, q4cVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, q4cVar.f, q4cVar.g, false, -16777216, q4cVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            q4c q4cVar2 = (q4c) hashMap.get(entry.getKey());
            q4cVar2.getClass();
            e53 e53Var = (e53) entry.getValue();
            CharSequence charSequence = e53Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ff3 ff3Var : (ff3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ff3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ff3Var), spannableStringBuilder.getSpanEnd(ff3Var), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = q4cVar2.c;
            int i10 = q4cVar2.d;
            e53Var.e = f;
            e53Var.f = i10;
            e53Var.g = q4cVar2.e;
            e53Var.h = q4cVar2.b;
            e53Var.l = q4cVar2.f;
            float f2 = q4cVar2.i;
            int i11 = q4cVar2.h;
            e53Var.k = f2;
            e53Var.j = i11;
            e53Var.p = q4cVar2.j;
            arrayList2.add(e53Var.a());
        }
        return arrayList2;
    }

    @Override // lcb
    public final int q() {
        return ((long[]) this.c).length;
    }

    public final gjd r() {
        ite.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        K("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            K("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            this.d = concat;
            K("url", concat);
        }
        ite.i((String) this.c, "setObject is required before calling build().");
        ite.i((String) this.d, "setObject is required before calling build().");
        return new gjd("AssistAction", (String) this.c, (String) this.d, null, new mdd(), (String) this.e, (Bundle) this.b);
    }

    @Override // u29
    public final boolean s() {
        return true;
    }

    public final void t(Canvas canvas, boolean z, boolean z2, int i, float f) {
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.f;
        Paint paint = (Paint) this.e;
        xy0 xy0Var = (xy0) this.b;
        Path path = (Path) this.d;
        int i2 = (int) ((z2 ? 0 : (int) xy0Var.H) * f);
        int L = gm.L(10.0f) * Math.min(1, i2 / gm.L(60.0f));
        if (i2 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f2 = L;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        path.rewind();
        rectF.set(0.0f, 0.0f, i, (xy0Var.getY() + xy0Var.getHeight()) - i2);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z) {
            paint.setShadowLayer(gm.L(2.0f), 0.0f, gm.L(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public final void u(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                u(viewGroup.getChildAt(i));
            }
        }
    }

    public final xs7 v(Class cls) {
        return e(yy8.a(cls));
    }

    public final void w(gu2 gu2Var) {
        su suVar = (su) this.b;
        u05 u05Var = new u05(this, gu2Var);
        suVar.getClass();
        ite.e("getMapAsync() must be called on the main thread");
        pr2 pr2Var = (pr2) suVar.b;
        wm9 wm9Var = (wm9) pr2Var.a;
        if (wm9Var != null) {
            wm9Var.s(u05Var);
        } else {
            ((ArrayList) pr2Var.h).add(u05Var);
        }
    }

    public final boolean z() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        li4 li4Var = (li4) this.c;
        li4Var.a();
        Context context = li4Var.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // u29
    public final void o() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    public /* synthetic */ sm2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public sm2(i8e i8eVar, r8d r8dVar, String str) {
        this.a = (byte) 26;
        this.b = i8eVar;
        this.c = r8dVar;
        this.d = str;
        this.f = new fkd((Object) this, (byte) 7);
    }

    public sm2(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.d = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.e = fq3.p;
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sm2(Context context) {
        this(context, new em5(-1, 0, 0));
        this.a = (byte) 22;
    }

    public sm2(Context context, li4 li4Var, ti4 ti4Var, eq eqVar, mf7 mf7Var) {
        this.a = (byte) 7;
        this.b = new ua4(context, ua4.t, wo.g, b05.c);
        this.c = li4Var;
        this.d = ti4Var;
        this.e = eqVar;
        this.f = mf7Var;
    }

    public sm2(Context context, em5 em5Var) {
        this.a = (byte) 22;
        this.b = context;
        this.c = em5Var;
        Q();
    }

    public sm2(xq2 xq2Var, ir2 ir2Var) {
        this.a = (byte) 13;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<if3> set = xq2Var.c;
        Set set2 = xq2Var.g;
        for (if3 if3Var : set) {
            byte b = if3Var.c;
            byte b2 = if3Var.b;
            boolean z = b == 0;
            yy8 yy8Var = if3Var.a;
            if (z) {
                if (b2 == 2) {
                    hashSet4.add(yy8Var);
                } else {
                    hashSet.add(yy8Var);
                }
            } else if (b == 2) {
                hashSet3.add(yy8Var);
            } else if (b2 == 2) {
                hashSet5.add(yy8Var);
            } else {
                hashSet2.add(yy8Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(yy8.a(uw8.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = ir2Var;
    }

    public sm2(n4c n4cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = (byte) 18;
        this.b = n4cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        n4cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public sm2(Activity activity, WallpapersListActivity wallpapersListActivity, etc etcVar) {
        this.a = (byte) 19;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = etcVar;
    }

    public /* synthetic */ sm2(byte b, boolean z) {
        this.a = b;
    }

    public sm2(byte[] bArr, byte[] bArr2, String str) {
        this.a = (byte) 20;
        this.b = bArr;
        this.c = bArr2;
        this.e = str;
    }

    public sm2(zv1 zv1Var) {
        this.a = (byte) 4;
        this.f = zv1Var;
        d53 d53Var = d53.h;
        this.d = new fn0(0, this, d53Var, 320L, true);
        this.e = new fn0(1, this, d53Var, 320L, true);
    }

    public sm2(int i) {
        this.a = (byte) 21;
        this.b = new int[i];
        this.c = new int[i];
        this.f = new float[i];
        this.d = new float[i];
        this.e = new float[i];
    }

    public sm2(or9 or9Var, dx9 dx9Var, qr9 qr9Var, qr9 qr9Var2, qr9 qr9Var3) {
        this.a = (byte) 15;
        this.f = or9Var;
        this.b = dx9Var;
        this.c = qr9Var;
        this.d = qr9Var2;
        this.e = qr9Var3;
    }

    public sm2(wb3 wb3Var, fgf fgfVar) {
        this.a = (byte) 5;
        this.b = wb3Var;
        this.f = fgfVar;
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public sm2(xy0 xy0Var) {
        this.a = (byte) 3;
        this.c = new RectF();
        this.f = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.b = xy0Var;
    }

    public sm2(xv7 xv7Var, wm0 wm0Var, Paint paint) {
        this.a = (byte) 9;
        this.f = xv7Var;
        this.d = wm0Var;
        this.e = paint;
        this.c = new Path();
    }
}
