package p7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import b8.zb;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import mi.z3;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.wy0;
import w2.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class d implements p5.b, t0.h, wi.w0, na.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ d(int i3, boolean z10) {
        this.a = i3;
    }

    public static void D(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public void A(yb.i iVar, Object obj) {
        if (((EnumMap) this.c) == null) {
            this.c = new EnumMap(yb.i.class);
        }
        ((EnumMap) this.c).put((EnumMap) iVar, (yb.i) obj);
    }

    public void B() {
        int i3;
        RecyclerView recyclerView = (RecyclerView) ((nh) this.b).b;
        ((ig) this.d).I();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            u4.d1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i10 = U.r;
                if (recyclerView.c0()) {
                    U.s = i10;
                    recyclerView.L0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void C(z3 z3Var) {
        if (((tf.d) this.b) == null) {
            return;
        }
        for (int i3 = 0; i3 < z3Var.a.size(); i3++) {
            tf.d dVar = (tf.d) this.b;
            dVar.h.remove(z3Var.c(i3).d);
            dVar.h();
        }
    }

    public void E(n5.i iVar, int i3, boolean z10) {
        char c2;
        t5.a aVar = (t5.a) this.c;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        k5.d dVar = iVar.c;
        adler32.update(allocate.putInt(x5.a.a(dVar)).array());
        byte[] bArr = iVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i3) {
                        x7.m.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((u5.g) ((u5.d) this.d)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(x5.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i3));
            Set set = ((t5.b) aVar.b.get(dVar)).c;
            if (set.contains(t5.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(t5.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(t5.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", x5.a.a(dVar));
            if (bArr != null) {
                c2 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c2 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i3));
            Integer valueOf4 = Integer.valueOf(i3);
            Object[] objArr = new Object[5];
            objArr[c2] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c10 = x7.m.c("JobInfoScheduler");
            if (Log.isLoggable(c10, 3)) {
                Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void F(tf.a aVar) {
        z3 z3Var;
        z3 z3Var2 = (z3) this.d;
        if (z3Var2 != null && ((tf.a) this.c) == null && aVar != null) {
            g(z3Var2);
        }
        if (((tf.a) this.c) != null && (z3Var = (z3) this.d) != null && aVar == null) {
            C(z3Var);
        }
        tf.a aVar2 = (tf.a) this.c;
        if (aVar2 != null) {
            g6.h hVar = aVar2.a;
            p6.m.d("Must be called from the main thread.");
            hVar.i.remove(aVar2);
        }
        if (aVar != null) {
            aVar.a.p(aVar);
            z3 z3Var3 = (z3) this.d;
            if (z3Var3 != null) {
                aVar.d = z3Var3;
                aVar.g = 0;
                aVar.h = 0;
                aVar.p();
            }
        }
        this.c = aVar;
    }

    public FileOutputStream G() {
        File file = (File) this.d;
        File file2 = (File) this.c;
        if (file2.exists()) {
            D(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }

    public void H(View view) {
        if (((ArrayList) this.c).remove(view)) {
            nh nhVar = (nh) this.b;
            u4.d1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) nhVar.b;
                int i3 = U.r;
                if (recyclerView.c0()) {
                    U.s = i3;
                    recyclerView.L0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view2.setImportantForAccessibility(i3);
                }
                U.r = 0;
            }
        }
    }

    public void I(Object obj, String str) {
        d dVar = new d(0, false);
        ((d) this.d).c = dVar;
        this.d = dVar;
        dVar.d = obj;
        dVar.b = str;
    }

    @Override // t0.h
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // na.a
    public /* bridge */ /* synthetic */ na.a c(Class cls, ma.d dVar) {
        switch (this.a) {
            case 20:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
            case 25:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.d).remove(cls);
                break;
        }
        return this;
    }

    @Override // t0.h
    public Uri d() {
        return (Uri) this.c;
    }

    @Override // t0.h
    public Object e() {
        return null;
    }

    public void g(z3 z3Var) {
        if (((tf.d) this.b) == null) {
            this.b = new tf.d();
        }
        for (int i3 = 0; i3 < z3Var.a.size(); i3++) {
            tf.d dVar = (tf.d) this.b;
            tf.f c2 = z3Var.c(i3);
            dVar.h.put(c2.d, c2);
            dVar.h();
        }
    }

    @Override // cd.a
    public Object get() {
        return new d((Context) ((cd.a) this.b).get(), (u5.d) ((cd.a) this.d).get(), (t5.a) ((mb.b) this.c).get(), 13);
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.d;
    }

    public void h(int i3, View view, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((nh) this.b).b;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : s(i3);
        ((ig) this.d).F(childCount, z10);
        if (z10) {
            w(view);
        }
        recyclerView.addView(view, childCount);
        u4.d1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        u4.h0 h0Var = recyclerView.x;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.Q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((u4.q0) recyclerView.Q.get(size)).c();
            }
        }
    }

    public void i(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((nh) this.b).b;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : s(i3);
        ((ig) this.d).F(childCount, z10);
        if (z10) {
            w(view);
        }
        u4.d1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void j() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.b;
        if (a0Var != null) {
            int i3 = ((r4.e) this.c).n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i3);
            uVar.a.setPlaybackToLocal(builder.build());
            this.d = null;
        }
    }

    public void k(int i3) {
        u4.d1 U;
        int s6 = s(i3);
        ((ig) this.d).G(s6);
        RecyclerView recyclerView = (RecyclerView) ((nh) this.b).b;
        View childAt = recyclerView.getChildAt(s6);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(s6);
    }

    public void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.b;
        pa.e eVar = new pa.e(byteArrayOutputStream, hashMap, (HashMap) this.d, (ma.d) this.c);
        if (obj == null) {
            return;
        }
        ma.d dVar = (ma.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, eVar);
        } else {
            throw new ma.b("No encoder for " + obj.getClass());
        }
    }

    public qf.e m(qf.f fVar) {
        InputStream inputStream;
        int i3 = fVar.c;
        InputStream inputStream2 = (rf.b) this.b;
        if (fVar.d) {
            nh nhVar = (nh) this.c;
            nhVar.getClass();
            byte[] bArr = new byte[i3];
            int i10 = 0;
            while (i10 < i3) {
                int read = ((rf.a) nhVar.b).read(bArr, i10, i3 - i10);
                if (read <= 0) {
                    throw new EOFException();
                }
                i10 += read;
            }
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < i3; i12++) {
                byte b10 = bArr[i12];
                if (!z10 || b10 != 0) {
                    bArr[i11] = b10;
                    i11++;
                }
                z10 = b10 == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i11);
            i3 = i11;
        }
        if (fVar.f) {
            throw new qf.c("Frame encryption is not supported");
        }
        if (fVar.e) {
            i3 = fVar.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new qf.e(inputStream, fVar.b, i3, (qf.h) this.d, fVar);
    }

    public View n(int i3) {
        return ((RecyclerView) ((nh) this.b).b).getChildAt(s(i3));
    }

    public int o() {
        return ((RecyclerView) ((nh) this.b).b).getChildCount() - ((ArrayList) this.c).size();
    }

    public long p() {
        e3.l lVar = (e3.l) this.c;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public ByteBuffer q() {
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap == null) {
            return (ByteBuffer) this.d;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.c).getHeight();
        int i3 = width * height;
        ((Bitmap) this.c).getPixels(new int[i3], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) ((Color.blue(r2[i10]) * 0.114f) + (Color.green(r2[i10]) * 0.587f) + (Color.red(r2[i10]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    @Override // wi.w0
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.d).add(bufferInfo2);
    }

    public int s(int i3) {
        ig igVar = (ig) this.d;
        if (i3 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((nh) this.b).b).getChildCount();
        int i10 = i3;
        while (i10 < childCount) {
            int y9 = i3 - (i10 - igVar.y(i10));
            if (y9 == 0) {
                while (igVar.E(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += y9;
        }
        return -1;
    }

    public View t(int i3) {
        return ((RecyclerView) ((nh) this.b).b).getChildAt(i3);
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                d dVar = (d) ((d) this.c).c;
                while (dVar != null) {
                    Object obj = dVar.d;
                    sb2.append(str);
                    String str2 = (String) dVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                    }
                    dVar = (d) dVar.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 5:
                StringBuilder sb3 = new StringBuilder("id3v2tag[pos=");
                rf.b bVar = (rf.b) this.b;
                sb3.append(bVar.b);
                sb3.append(", ");
                sb3.append(bVar.e());
                sb3.append(" left]");
                return sb3.toString();
            case 15:
                return ((ig) this.d).toString() + ", hidden list:" + ((ArrayList) this.c).size();
            case 22:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.b);
                sb4.append('{');
                d dVar2 = (d) ((d) this.d).c;
                while (dVar2 != null) {
                    Object obj2 = dVar2.d;
                    sb4.append(str);
                    String str3 = (String) dVar2.b;
                    if (str3 != null) {
                        sb4.append(str3);
                        sb4.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb4.append(obj2);
                    } else {
                        sb4.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                    }
                    dVar2 = (d) dVar2.c;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            case 27:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((nh) this.b).b).getChildCount();
    }

    public boolean v() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.b) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.b = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.d).readLine();
                this.b = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.b = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public void w(View view) {
        ((ArrayList) this.c).add(view);
        nh nhVar = (nh) this.b;
        u4.d1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) nhVar.b;
            int i3 = U.s;
            if (i3 != -1) {
                U.r = i3;
            } else {
                WeakHashMap weakHashMap = r0.i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.s = 4;
                recyclerView.L0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.i0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    @Override // wi.w0
    public void x(MediaFormat mediaFormat) {
        this.c = mediaFormat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(i2.h hVar, Uri uri, Map map, long j10, long j11, w2.w0 w0Var) {
        e3.l lVar = new e3.l(hVar, j10, j11);
        this.c = lVar;
        if (((e3.o) this.d) != null) {
            return;
        }
        e3.o[] b10 = ((e3.r) this.b).b(uri, map);
        int length = b10.length;
        g9.g0 g0Var = g9.i0.b;
        g9.o.g(length, "expectedSize");
        g9.f0 f0Var = new g9.f0(length);
        boolean z10 = true;
        if (b10.length == 1) {
            this.d = b10[0];
        } else {
            int length2 = b10.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                e3.o oVar = b10[i3];
                try {
                } catch (EOFException unused) {
                    if (((e3.o) this.d) == null) {
                    }
                } catch (Throwable th2) {
                    if (((e3.o) this.d) == null && lVar.d != j10) {
                        z10 = false;
                    }
                    zb.p(z10);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.b(lVar)) {
                    this.d = oVar;
                    lVar.f = 0;
                    break;
                }
                f0Var.d(oVar.e());
                if (((e3.o) this.d) == null) {
                }
                boolean z11 = true;
                zb.p(z11);
                lVar.f = 0;
                i3++;
            }
            if (((e3.o) this.d) == null) {
                String str = "None of the available extractors (" + new com.google.android.gms.internal.clearcut.e(", ").b(g9.o.y(g9.i0.r(b10), new u9.j(12))) + ") could read the stream.";
                uri.getClass();
                throw new s1(str, f0Var.f());
            }
        }
        ((e3.o) this.d).c(w0Var);
    }

    public String z() {
        if (!v()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.b;
        this.b = null;
        return str;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public d(String str, int i3) {
        this.a = i3;
        switch (i3) {
            case 22:
                d dVar = new d(21, false);
                this.d = dVar;
                this.c = dVar;
                this.b = str;
                break;
            default:
                d dVar2 = new d(0, false);
                this.c = dVar2;
                this.d = dVar2;
                this.b = str;
                break;
        }
    }

    public d(int i3) {
        this.a = i3;
        switch (i3) {
            case 19:
                this.b = new ArrayList();
                this.d = new ArrayList();
                break;
            case 20:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = x7.i.c;
                break;
            case 25:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = y7.e.c;
                break;
            case 28:
                this.b = new HashMap();
                this.d = new HashMap();
                this.c = z7.c0.c;
                break;
            default:
                this.b = new a7.d();
                this.d = null;
                this.c = null;
                break;
        }
    }

    @Override // t0.h
    public void b() {
    }

    @Override // t0.h
    public void f() {
    }

    public d(InputStream inputStream, long j10, int i3, qf.h hVar) {
        this.a = 5;
        rf.b bVar = new rf.b(inputStream, j10, i3);
        this.b = bVar;
        this.c = new nh(bVar, 13);
        this.d = hVar;
    }

    public d(String str, Boolean bool, rc.a aVar, String str2) {
        this.a = 9;
        this.b = str;
        this.d = str2;
        this.c = aVar;
    }

    public d(String str, yb.j[] jVarArr) {
        this.a = 27;
        System.currentTimeMillis();
        this.b = str;
        this.d = jVarArr;
        this.c = null;
    }

    public d(nh nhVar, char c2) {
        this.a = 15;
        this.b = nhVar;
        this.d = new ig(7);
        this.c = new ArrayList();
    }

    public d(File file) {
        this.a = 3;
        this.b = file;
        this.d = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public d(e3.r rVar) {
        this.a = 17;
        this.b = rVar;
    }

    public d(Runnable runnable) {
        this.a = 6;
        this.d = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.b = runnable;
    }

    public d(nh nhVar) {
        this.a = 4;
        this.a = 4;
        this.b = nhVar;
        this.d = Choreographer.getInstance();
        this.c = new wy0(this, 1);
    }

    public d(String str, String str2) {
        this.a = 16;
        this.b = str;
        this.d = str2;
        this.c = str2.isEmpty() ? str : a1.g.C(str, "/", str2);
    }

    public d(r4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.a = 8;
        this.c = eVar;
        this.b = a0Var;
    }

    public d(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 7;
        this.c = arrayDeque;
        this.d = bufferedReader;
    }
}
