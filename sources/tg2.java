// default package

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class tg2 implements k6a, zu9, wj0, sc7, we9, m63, d71, et3, lf5, kt8, hk4 {
    public static volatile tg2 d;
    public static final int[] e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final c6e f = new c6e();
    public static final Object h = new Object();
    public static int n;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public tg2(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case 11:
                this.b = new lj9((byte) 10);
                this.c = new SparseIntArray();
                break;
            case 14:
                break;
            case 26:
                this.b = new HashMap();
                this.c = uj2.b;
                break;
            default:
                ad1 c = ad1.c(a.b);
                k32 k32Var = new k32((byte) 5);
                c.getClass();
                fre.e("Must be called from the main thread.");
                j6a j6aVar = c.c;
                j6aVar.getClass();
                try {
                    nad nadVar = j6aVar.a;
                    r5d r5dVar = new r5d(k32Var);
                    Parcel R = nadVar.R();
                    jgd.d(R, r5dVar);
                    nadVar.V(R, 4);
                } catch (RemoteException e2) {
                    j6a.c.a(e2, "Unable to call %s on %s.", "addCastStateListener", nad.class.getSimpleName());
                }
                this.b = new mv6((byte) 23);
                j6a b2 = c.b();
                this.c = b2;
                b2.a(this);
                c0(b2.c());
                break;
        }
    }

    public static tg2 N() {
        tg2 tg2Var;
        tg2 tg2Var2 = d;
        if (tg2Var2 != null) {
            return tg2Var2;
        }
        synchronized (tg2.class) {
            tg2Var = d;
            if (tg2Var == null) {
                tg2Var = new tg2((byte) 0);
                d = tg2Var;
            }
        }
        return tg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tg2 l(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new tg2(fileChannel, fileLock, (byte) 19);
        } catch (IOException e4) {
            e = e4;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e5) {
            e = e5;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e6) {
            e = e6;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static uj2 t(uj2 uj2Var, List list) {
        uj2Var.getClass();
        Map map = uj2Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new uj2(hashMap);
    }

    public final lg7 A(int i, long j, boolean z) {
        lj9 lj9Var = (lj9) this.b;
        if (i > 0) {
            i = ((SparseIntArray) this.c).get(i, 0);
        }
        if (i == 0) {
            return null;
        }
        long j2 = i;
        LongSparseArray x = lj9Var.x(j, 0L);
        lg7 lg7Var = (lg7) (x != null ? x.get(j2) : null);
        if (lg7Var != null || !z) {
            return lg7Var;
        }
        lg7 lg7Var2 = new lg7();
        lj9Var.G(j, 0L, j2, lg7Var2);
        return lg7Var2;
    }

    @Override // we9
    public final void B(xe9 xe9Var, View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        cs5Var.T = true;
        d dVar = e72Var.b.Z1;
        e72Var.getContext();
        e72Var.I = lf9.b(cs5Var, dVar, xe9Var, true);
    }

    @Override // wj0
    public final t56 D(jr6 jr6Var) {
        Uri uri;
        byte[] bArr;
        mv6 mv6Var = (mv6) this.c;
        if (mv6Var != null && (((uri = (Uri) mv6Var.c) != null && uri.equals(jr6Var.n)) || ((bArr = (byte[]) mv6Var.b) != null && Arrays.equals(bArr, jr6Var.k)))) {
            t56 t56Var = (t56) ((mv6) this.c).d;
            t56Var.getClass();
            return t56Var;
        }
        t56 D = ((wj0) this.b).D(jr6Var);
        if (D == null) {
            return null;
        }
        this.c = new mv6(jr6Var, D);
        return D;
    }

    @Override // k6a
    public final void E(d5a d5aVar, boolean z) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((ed1) d5aVar).a() + " " + z);
    }

    @Override // k6a
    public final void F(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((ed1) d5aVar).a() + " " + i);
    }

    @Override // we9
    public final void G() {
        df9 df9Var = ((e72) this.c).s;
        if (df9Var != null) {
            df9Var.e(false, true);
            int i = df9Var.c0;
            df9Var.g(i != 2 ? i : 0, true);
        }
    }

    public final j74 I(Object... objArr) {
        Constructor b;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    try {
                        b = ((k93) this.b).b();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                }
            }
            b = null;
        }
        if (b == null) {
            return null;
        }
        try {
            return (j74) b.newInstance(objArr);
        } catch (Exception e3) {
            k93.h("Unexpected error creating extractor", e3);
            return null;
        }
    }

    @Override // we9
    public final cs5 J(View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        e72Var.I = cs5Var;
        return cs5Var;
    }

    @Override // k6a
    public final void K(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((ed1) d5aVar).a() + " " + i);
    }

    @Override // we9
    public final void L() {
        e72 e72Var = (e72) this.c;
        e72Var.c0();
        e72Var.d0();
    }

    @Override // wj0
    public final t56 M(byte[] bArr) {
        byte[] bArr2;
        mv6 mv6Var = (mv6) this.c;
        if (mv6Var == null || (bArr2 = (byte[]) mv6Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            t56 M = ((wj0) this.b).M(bArr);
            this.c = new mv6(bArr, M);
            return M;
        }
        t56 t56Var = (t56) ((mv6) this.c).d;
        t56Var.getClass();
        return t56Var;
    }

    public final boolean O() {
        return ((sg2) ((mv6) this.b).d) != null;
    }

    @Override // we9
    public final void P(ve9 ve9Var, View view) {
        e72 e72Var = (e72) this.c;
        cs5 cs5Var = new cs5(e72Var, (wjb) this.b, view, false, false, true);
        cs5Var.T = true;
        e72Var.I = lf9.c(cs5Var, e72Var.b.Z1, e72Var.getContext(), (wjb) this.b, ve9Var, true);
    }

    public void Q(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        vk9 v = vk9.v(absSeekBar.getContext(), attributeSet, e, i);
        Drawable p = v.p(0);
        if (p != null) {
            if (p instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) p;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable Z = Z(animationDrawable.getFrame(i2), true);
                    Z.setLevel(10000);
                    animationDrawable2.addFrame(Z, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                p = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(p);
        }
        Drawable p2 = v.p(1);
        if (p2 != null) {
            absSeekBar.setProgressDrawable(Z(p2, false));
        }
        v.y();
    }

    @Override // k6a
    public final void R(d5a d5aVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((ed1) d5aVar).a() + " " + str);
    }

    public final void S(f9 f9Var) {
        wtc wtcVar = (wtc) this.b;
        ((ActionMode.Callback) wtcVar.a).onDestroyActionMode(wtcVar.p(f9Var));
        bp bpVar = (bp) this.c;
        if (bpVar.F != null) {
            bpVar.f.getDecorView().removeCallbacks(bpVar.G);
        }
        if (bpVar.E != null) {
            afc afcVar = bpVar.H;
            if (afcVar != null) {
                afcVar.b();
            }
            afc a = jdc.a(bpVar.E);
            a.a(0.0f);
            bpVar.H = a;
            a.d(new ro(this, (byte) 2));
        }
        bpVar.y = null;
        ViewGroup viewGroup = bpVar.K;
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(viewGroup);
        bpVar.w();
    }

    @Override // k6a
    public final void T(d5a d5aVar, String str) {
        ed1 ed1Var = (ed1) d5aVar;
        Log.d("CAST_SESSION", "onSessionStarted " + ed1Var.a() + " " + str);
        c0(ed1Var);
    }

    public final void U(long j, File file) {
        synchronized (((u20) this.c).f) {
            ((HashMap) ((u20) this.c).g).put(Long.valueOf(j), file);
        }
    }

    public final void V(uj2 uj2Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() != null) {
                fyb.g();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!t(uj2Var, list).equals(t((uj2) this.c, list))) {
                    throw null;
                }
            }
        }
        this.c = uj2Var;
    }

    public final boolean W(f9 f9Var, yz6 yz6Var) {
        ViewGroup viewGroup = ((bp) this.c).K;
        WeakHashMap weakHashMap = jdc.a;
        zcc.c(viewGroup);
        wtc wtcVar = (wtc) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) wtcVar.a;
        tbb p = wtcVar.p(f9Var);
        aia aiaVar = (aia) wtcVar.d;
        Menu menu = (Menu) aiaVar.get(yz6Var);
        if (menu == null) {
            menu = new w07((Context) wtcVar.b, yz6Var);
            aiaVar.put(yz6Var, menu);
        }
        return callback.onPrepareActionMode(p, menu);
    }

    public final void X() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    public final void Y(yg2 yg2Var) {
        vg2 vg2Var;
        yg2 yg2Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        mv6 mv6Var = (mv6) this.b;
        yg2 yg2Var3 = (yg2) mv6Var.c;
        if (fo.w()) {
            if (yg2Var3 != null) {
                ArrayList arrayList = yg2Var3.b;
                if (yg2Var != null && arrayList.size() == yg2Var.b.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        xg2 h2 = yg2Var3.h(i);
                        xg2 h3 = yg2Var.h(i);
                        if (h2 == null) {
                            if (h3 == null) {
                            }
                        } else if (h3 != null && Objects.equals(h2.a, h3.a) && Objects.equals(h2.b, h3.b) && Objects.equals(h2.c, h3.c) && h2.d.equals(h3.d) && h2.e == h3.e && h2.f == h3.f) {
                        }
                    }
                    return;
                }
            } else if (yg2Var == null) {
                return;
            }
        }
        if (((sg2) mv6Var.d) != null && yg2Var != null) {
            mv6Var.i(yg2Var);
        }
        if (((sg2) mv6Var.d) != null && (yg2Var2 = (yg2) mv6Var.c) != null) {
            mv6Var.f0(yg2Var2);
        }
        if (yg2Var != null && yg2Var.b.size() > 0 && !yg2Var.h(0).a.startsWith("audio/") && (vg2Var = (vg2) mv6Var.b) != null) {
            vg2Var.k(null, null);
        }
        sg2 sg2Var = (sg2) mv6Var.d;
        if (sg2Var != null && yg2Var != null) {
            sg2Var.d = yg2Var;
            sg2Var.g = 0;
            sg2Var.h = 0;
            sg2Var.p();
        }
        mv6Var.c = yg2Var;
    }

    public final Drawable Z(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = Z(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[RETURN] */
    @Override // we9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(float f2) {
        boolean z;
        df9 df9Var = ((e72) this.c).s;
        if (df9Var != null) {
            FrameLayout frameLayout = df9Var.I;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f2 >= r3[1]) {
                    z = true;
                    df9Var.e(z, true);
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            df9Var.e(z, true);
            if (!z) {
            }
        }
        return false;
    }

    @Override // zu9
    public final int a0() {
        return 0;
    }

    @Override // we9
    public final void b(wi9 wi9Var, String str) {
        e72 e72Var = (e72) this.c;
        eq2 eq2Var = e72Var.w;
        if (eq2Var == null) {
            wjb wjbVar = (wjb) this.b;
            eq2Var = new eq2(new q31((Object) this, (Object) wjbVar, (byte) 28), wjbVar);
            e72Var.w = eq2Var;
        }
        eq2Var.z(wi9Var, str);
    }

    public final wxb b0(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                lad.c("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new yn3();
            }
            if (i == iArr[i2]) {
                return ((gp9[]) this.c)[i2];
            }
            i2++;
        }
    }

    @Override // we9
    public final void c(int i) {
        ((e72) this.c).T(74, i);
    }

    public final void c0(ed1 ed1Var) {
        mv6 mv6Var = (mv6) this.b;
        if (ed1Var != null) {
            fre.e("Must be called from the main thread.");
            i69 i69Var = ed1Var.j;
            String a = ed1Var.a();
            if (TextUtils.isEmpty(a) || i69Var == null) {
                return;
            }
            sg2 sg2Var = (sg2) mv6Var.d;
            if (sg2Var == null || !TextUtils.equals(sg2Var.c.a(), a)) {
                mv6Var.l0(new sg2(ed1Var, (j6a) this.c, i69Var));
                fre.e("Must be called from the main thread.");
                CastDevice castDevice = ed1Var.k;
                String str = castDevice != null ? castDevice.d : null;
                PhotoViewer r0 = PhotoViewer.r0();
                vg2.h();
                if (r0.F == null || r0.f0 == null || !r0.V0()) {
                    return;
                }
                new u21(r0.f0, new f53()).Q(org.telegram.messenger.beta.R.raw.forward, 36, !TextUtils.isEmpty(str) ? k96.a0(null, null, 2131752090, str) : k96.M0(2131752091, null)).j();
            }
        }
    }

    @Override // m63
    public final o63 createDataSource() {
        return new x93((Context) this.b, ((xf4) this.c).createDataSource());
    }

    @Override // lf5
    public final bv7 d(hf5 hf5Var, df5 df5Var) {
        ((ize) this.b).getClass();
        return new lv6(new kf5(hf5Var, df5Var), (List) this.c, false, (byte) 27);
    }

    public final int d0(int i) {
        synchronized (h) {
            int i2 = ((SparseIntArray) this.b).get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = n;
            n = i3 + 1;
            ((SparseIntArray) this.b).append(i, i3);
            ((SparseIntArray) this.c).append(i3, i);
            return i3;
        }
    }

    @Override // d71
    public final void dismiss() {
        ((je3) this.c).dismiss();
    }

    @Override // we9
    public final void e() {
        e72 e72Var = (e72) this.c;
        ye9 ye9Var = e72Var.r;
        df9 df9Var = e72Var.s;
        if (df9Var != null) {
            me9 me9Var = ye9Var.v3;
            int i = (me9Var != null && me9Var.w() && ye9Var.E4()) ? 1 : 0;
            if (df9Var.b0 == 2) {
                df9Var.c0 = i;
            } else {
                df9Var.g(i, true);
            }
            if (i != 0) {
                e72Var.b0();
            }
        }
        e72Var.e0();
    }

    @Override // we9
    public final void f() {
        df9 df9Var = ((e72) this.c).s;
        if (df9Var != null) {
            int i = df9Var.b0;
            if (i == 2) {
                i = 0;
            }
            df9Var.c0 = i;
            df9Var.e(false, false);
            df9Var.g(2, true);
        }
    }

    @Override // we9
    public final void g(mc9 mc9Var, boolean z) {
        ((e72) this.c).b.c1(mc9Var, z);
    }

    @Override // lt8
    public final Object get() {
        Context context = (Context) ((mo5) this.b).a;
        sw2 sw2Var = (sw2) ((mo5) this.c).a;
        context.getClass();
        sw2Var.getClass();
        return hh4.a(cff.d, new ln8((Object) new tw2((byte) 1), (byte) 5), h9e.a(sw2Var), new gh4(context, (byte) 0));
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r6.h(r7, r0) != r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // hk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        nk4 nk4Var;
        int i;
        Throwable th;
        oo9 oo9Var;
        tg2 tg2Var;
        if (fw2Var instanceof nk4) {
            nk4Var = (nk4) fw2Var;
            int i2 = nk4Var.b;
            if ((i2 & TLObject.FLAG_31) != 0) {
                nk4Var.b = i2 - TLObject.FLAG_31;
                Object obj = nk4Var.a;
                i = nk4Var.b;
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    oo9 oo9Var2 = new oo9(ik4Var, nk4Var.getContext());
                    try {
                        b73 b73Var = (b73) this.b;
                        try {
                            nk4Var.d = this;
                            nk4Var.e = ik4Var;
                            nk4Var.f = oo9Var2;
                            nk4Var.b = 1;
                            if (b73Var.invoke(oo9Var2, nk4Var) != bx2Var) {
                                tg2Var = this;
                                oo9Var = oo9Var2;
                            }
                            return bx2Var;
                        } catch (Throwable th2) {
                            th = th2;
                            oo9Var = oo9Var2;
                            oo9Var.releaseIntercepted();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qse.b(obj);
                            return g5c.a;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oo9Var = nk4Var.f;
                    ik4Var = nk4Var.e;
                    tg2Var = nk4Var.d;
                    try {
                        qse.b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        oo9Var.releaseIntercepted();
                        throw th;
                    }
                }
                oo9Var.releaseIntercepted();
                hk4 hk4Var = (hk4) tg2Var.c;
                nk4Var.d = null;
                nk4Var.e = null;
                nk4Var.f = null;
                nk4Var.b = 2;
            }
        }
        nk4Var = new nk4(this, fw2Var);
        Object obj2 = nk4Var.a;
        i = nk4Var.b;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
        oo9Var.releaseIntercepted();
        hk4 hk4Var2 = (hk4) tg2Var.c;
        nk4Var.d = null;
        nk4Var.e = null;
        nk4Var.f = null;
        nk4Var.b = 2;
    }

    @Override // d71
    public final void i(l61 l61Var, u61 u61Var, boolean z) {
        je3 je3Var = (je3) this.c;
        ie3 ie3Var = je3Var.S1;
        if (u61Var != null) {
            ((v61) this.b).i(u61Var);
            je3Var.Z1.e();
            v61 v61Var = je3Var.b2;
            f15[] f15VarArr = je3Var.W1;
            ag2[] ag2VarArr = je3Var.X1;
            ag2 ag2Var = ag2VarArr[0];
            if (ag2Var != null) {
                f15 f15Var = f15VarArr[0];
                boolean z2 = v61Var.m;
                f15Var.b = z2;
                ag2Var.c(z2, true);
            }
            ag2 ag2Var2 = ag2VarArr[1];
            if (ag2Var2 != null) {
                f15 f15Var2 = f15VarArr[1];
                boolean z3 = v61Var.n;
                f15Var2.b = z3;
                ag2Var2.c(z3, true);
            }
            ag2 ag2Var3 = ag2VarArr[2];
            if (ag2Var3 != null) {
                f15 f15Var3 = f15VarArr[2];
                boolean z4 = v61Var.o;
                f15Var3.b = z4;
                ag2Var3.c(z4, true);
            }
            ag2 ag2Var4 = ag2VarArr[3];
            if (ag2Var4 != null) {
                f15 f15Var4 = f15VarArr[3];
                boolean z5 = v61Var.p;
                f15Var4.b = z5;
                ag2Var4.c(z5, true);
            }
            ag2 ag2Var5 = ag2VarArr[4];
            if (ag2Var5 != null) {
                f15 f15Var5 = f15VarArr[4];
                boolean z6 = v61Var.q;
                f15Var5.b = z6;
                ag2Var5.c(z6, true);
            }
            je3Var.V1.a(ie3Var.d(), true);
            ie3Var.c(true);
        }
    }

    @Override // zu9
    public final void j(boolean z, float f2) {
        ((TextView) this.b).setText("Alpha " + xk0.o1);
        xk0.o1 = f2;
        ((xk0) this.c).l1.K();
    }

    @Override // sc7
    public final void k(boolean z) {
        y71 y71Var = ((w71) this.c).b;
        y71Var.y.finishFragment();
        mu1 mu1Var = (mu1) this.b;
        b81 b81Var = y71Var.y;
        mu1Var.d6(b81Var.Q, b81Var.R + 86400, z);
    }

    @Override // et3
    public final void m() {
        ((ws3) this.c).b(((gt3) this.b).getText());
    }

    @Override // k6a
    public final void n(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((ed1) d5aVar).a() + " " + i);
        ((mv6) this.b).l0(null);
    }

    @Override // lf5
    public final bv7 o() {
        return new lv6(((ize) this.b).o(), (List) this.c, false, (byte) 27);
    }

    @Override // we9
    public final void onContentChanged() {
        e72 e72Var = (e72) this.c;
        df9 df9Var = e72Var.s;
        if (df9Var != null) {
            df9Var.setSendLoading(e72Var.r.i3());
        }
        e72Var.Z(true);
        e72Var.d0();
        t62 t62Var = e72Var.Q;
        gl.r(t62Var);
        gl.d3(t62Var, 1000L);
    }

    @Override // k6a
    public final void p(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
        Log.d("CAST_SESSION", "onSessionStarting " + ed1Var.a());
        c0(ed1Var);
    }

    @Override // k6a
    public final void q(d5a d5aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((ed1) d5aVar).a() + " " + i);
    }

    public final void r() {
        String str = (String) this.b;
        try {
            new File((File) ((jb4) this.c).c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    @Override // we9
    public final void s() {
        e72 e72Var = (e72) this.c;
        if (e72Var.getCurrentItemTop() != e72Var.J) {
            e72Var.b.H1(e72Var, 0);
        }
        e72Var.f0();
        e72Var.a0();
    }

    public final String toString() {
        switch (this.a) {
            case 9:
                try {
                    qj0 qj0Var = (qj0) this.c;
                    if (qj0Var == null) {
                        qj0Var = ((mv6) this.b).H();
                        this.c = qj0Var;
                    }
                    return qj0Var.toString();
                } catch (uj7 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public final void u(w83 w83Var) {
        synchronized (w83Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k30(this, w83Var, (byte) 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public final ArrayList v() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        qx4 qx4Var = (qx4) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) qx4Var.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new zp2((String) it.next(), (byte) 0));
        }
        return arrayList2;
    }

    @Override // we9
    public final void w(lk0 lk0Var) {
        e72 e72Var = (e72) this.c;
        x02 x02Var = e72Var.b;
        d dVar = x02Var.Z1;
        if (dVar == null || lk0Var == null || !(lk0Var.b instanceof TL_iv.pageBlockMap) || !gl.H1(dVar)) {
            return;
        }
        x02 x02Var2 = new x02(e72Var.getContext(), x02Var.Z1, false, false, false, null);
        x02Var2.W3 = new c6e();
        x02Var2.J1 = true;
        x02Var2.u3.setVisibility(8);
        x02Var2.t4 = new ie((Object) e72Var, (Object) lk0Var, (Object) x02Var2, (byte) 26);
        x02Var2.Z0();
        x02Var2.show();
    }

    @Override // we9
    public final void x(int i) {
        e72 e72Var = (e72) this.c;
        e72Var.b.H1(e72Var, i);
        e72Var.f0();
        e72Var.a0();
    }

    @Override // k6a
    public final void z(d5a d5aVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((ed1) d5aVar).a());
    }

    @Override // d71
    public final void H() {
    }

    @Override // d71
    public final void clear() {
    }

    @Override // zu9
    public final void y() {
    }

    public /* synthetic */ tg2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ tg2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ tg2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public tg2(jb4 jb4Var) {
        this.a = (byte) 2;
        this.b = jb4Var;
        this.c = f;
    }

    public tg2(Context context) {
        this.a = (byte) 21;
        xf4 xf4Var = new xf4((byte) 5);
        this.b = context.getApplicationContext();
        this.c = xf4Var;
    }

    public tg2(Handler handler, o30 o30Var) {
        this.a = (byte) 7;
        if (o30Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = o30Var;
    }

    public tg2(EditText editText) {
        this.a = (byte) 25;
        this.b = editText;
        gy3 gy3Var = new gy3(editText);
        this.c = gy3Var;
        editText.addTextChangedListener(gy3Var);
        if (pw3.b == null) {
            synchronized (pw3.a) {
                if (pw3.b == null) {
                    pw3 pw3Var = new pw3();
                    try {
                        pw3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, pw3.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    pw3.b = pw3Var;
                }
            }
        }
        editText.setEditableFactory(pw3.b);
    }

    public tg2(k93 k93Var) {
        this.a = (byte) 22;
        this.b = k93Var;
        this.c = new AtomicBoolean(false);
    }
}
