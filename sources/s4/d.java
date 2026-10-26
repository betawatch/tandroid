package s4;

import a8.lg;
import a8.of;
import a8.yb;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Adler32;
import u2.s1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class d implements t0.h, la.a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ d(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // t0.h
    public Uri a() {
        return (Uri) this.b;
    }

    @Override // t0.h
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // la.a
    public /* bridge */ /* synthetic */ la.a d(Class cls, ka.d dVar) {
        switch (this.a) {
            case 6:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            case 11:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
            default:
                ((HashMap) this.b).put(cls, dVar);
                ((HashMap) this.c).remove(cls);
                break;
        }
        return this;
    }

    @Override // t0.h
    public Object e() {
        return null;
    }

    public void g(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m(i10);
        ((lg) this.c).A(childCount, z10);
        if (z10) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        e1 U = RecyclerView.U(view);
        recyclerView.g0(view);
        h0 h0Var = recyclerView.w;
        if (h0Var != null && U != null) {
            h0Var.y(U);
        }
        ArrayList arrayList = recyclerView.P;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r0) recyclerView.P.get(size)).c();
            }
        }
    }

    @Override // t0.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    public void h(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.b).b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : m(i10);
        ((lg) this.c).A(childCount, z10);
        if (z10) {
            p(view);
        }
        e1 U = RecyclerView.U(view);
        if (U != null) {
            if (!U.l() && !U.r()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + U + recyclerView.C());
            }
            U.l &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void i(int i10) {
        e1 U;
        int m10 = m(i10);
        ((lg) this.c).B(m10);
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.b).b;
        View childAt = recyclerView.getChildAt(m10);
        if (childAt != null && (U = RecyclerView.U(childAt)) != null) {
            if (U.l() && !U.r()) {
                throw new IllegalArgumentException("called detach on an already detached child " + U + recyclerView.C());
            }
            U.a(256);
        }
        recyclerView.detachViewFromParent(m10);
    }

    public View j(int i10) {
        return ((RecyclerView) ((jg.s0) this.b).b).getChildAt(m(i10));
    }

    public int k() {
        return ((RecyclerView) ((jg.s0) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public long l() {
        c3.l lVar = (c3.l) this.d;
        if (lVar != null) {
            return lVar.d;
        }
        return -1L;
    }

    public int m(int i10) {
        lg lgVar = (lg) this.c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((jg.s0) this.b).b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int w10 = i10 - (i11 - lgVar.w(i11));
            if (w10 == 0) {
                while (lgVar.z(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += w10;
        }
        return -1;
    }

    public View n(int i10) {
        return ((RecyclerView) ((jg.s0) this.b).b).getChildAt(i10);
    }

    public int o() {
        return ((RecyclerView) ((jg.s0) this.b).b).getChildCount();
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        jg.s0 s0Var = (jg.s0) this.b;
        e1 U = RecyclerView.U(view);
        if (U != null) {
            View view2 = U.a;
            RecyclerView recyclerView = (RecyclerView) s0Var.b;
            int i10 = U.s;
            if (i10 != -1) {
                U.r = i10;
            } else {
                WeakHashMap weakHashMap = r0.i0.a;
                U.r = view2.getImportantForAccessibility();
            }
            if (recyclerView.c0()) {
                U.s = 4;
                recyclerView.K0.add(U);
            } else {
                WeakHashMap weakHashMap2 = r0.i0.a;
                view2.setImportantForAccessibility(4);
            }
        }
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
    public void q(g2.h hVar, Uri uri, Map map, long j10, long j11, u2.w0 w0Var) {
        c3.l lVar = new c3.l(hVar, j10, j11);
        this.d = lVar;
        if (((c3.o) this.c) != null) {
            return;
        }
        c3.o[] d = ((c3.r) this.b).d(uri, map);
        int length = d.length;
        f9.g0 g0Var = f9.i0.b;
        f9.o.f(length, "expectedSize");
        f9.f0 f0Var = new f9.f0(length);
        boolean z10 = true;
        if (d.length == 1) {
            this.c = d[0];
        } else {
            int length2 = d.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                c3.o oVar = d[i10];
                try {
                } catch (EOFException unused) {
                    if (((c3.o) this.c) == null) {
                    }
                } catch (Throwable th2) {
                    if (((c3.o) this.c) == null && lVar.d != j10) {
                        z10 = false;
                    }
                    yb.p(z10);
                    lVar.f = 0;
                    throw th2;
                }
                if (oVar.a(lVar)) {
                    this.c = oVar;
                    lVar.f = 0;
                    break;
                }
                f0Var.d(oVar.e());
                if (((c3.o) this.c) == null) {
                }
                boolean z11 = true;
                yb.p(z11);
                lVar.f = 0;
                i10++;
            }
            if (((c3.o) this.c) == null) {
                String str = "None of the available extractors (" + new d5.j(", ").e(f9.o.x(f9.i0.v(d), new s0.b(17))) + ") could read the stream.";
                uri.getClass();
                throw new s1(str, f0Var.f());
            }
        }
        ((c3.o) this.c).c(w0Var);
    }

    public void r() {
        int i10;
        RecyclerView recyclerView = (RecyclerView) ((jg.s0) this.b).b;
        ((lg) this.c).C();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e1 U = RecyclerView.U((View) arrayList.get(size));
            if (U != null) {
                int i11 = U.r;
                if (recyclerView.c0()) {
                    U.s = i11;
                    recyclerView.K0.add(U);
                } else {
                    View view = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view.setImportantForAccessibility(i11);
                }
                U.r = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void s(m5.i iVar, int i10, boolean z10) {
        char c10;
        s5.a aVar = (s5.a) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.a;
        String str2 = iVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        j5.d dVar = iVar.c;
        adler32.update(allocate.putInt(w5.a.a(dVar)).array());
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
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        of.a(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((t5.g) ((t5.d) this.c)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(w5.a.a(dVar))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i10));
            Set set = ((s5.b) aVar.b.get(dVar)).c;
            if (set.contains(s5.c.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(s5.c.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(s5.c.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", w5.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(aVar.a(dVar, longValue, i10));
            Integer valueOf4 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = valueOf;
            objArr[4] = valueOf4;
            String c11 = of.c("JobInfoScheduler");
            if (Log.isLoggable(c11, 3)) {
                Log.d(c11, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    public void t(View view) {
        if (((ArrayList) this.d).remove(view)) {
            jg.s0 s0Var = (jg.s0) this.b;
            e1 U = RecyclerView.U(view);
            if (U != null) {
                RecyclerView recyclerView = (RecyclerView) s0Var.b;
                int i10 = U.r;
                if (recyclerView.c0()) {
                    U.s = i10;
                    recyclerView.K0.add(U);
                } else {
                    View view2 = U.a;
                    WeakHashMap weakHashMap = r0.i0.a;
                    view2.setImportantForAccessibility(i10);
                }
                U.r = 0;
            }
        }
    }

    public String toString() {
        String str = "";
        switch (this.a) {
            case 0:
                return ((lg) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 8:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                d dVar = (d) ((d) this.c).d;
                while (dVar != null) {
                    Object obj = dVar.c;
                    sb2.append(str);
                    String str2 = (String) dVar.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    dVar = (d) dVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 19:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.b);
                sb3.append('{');
                d dVar2 = (d) ((d) this.c).d;
                while (dVar2 != null) {
                    Object obj2 = dVar2.c;
                    sb3.append(str);
                    String str3 = (String) dVar2.b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    dVar2 = (d) dVar2.d;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 11:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = x7.e.c;
                break;
            case 14:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = y7.c0.c;
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = w7.i.c;
                break;
        }
    }

    public /* synthetic */ d(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                d dVar = new d(18, false);
                this.c = dVar;
                this.d = dVar;
                this.b = str;
                break;
            default:
                d dVar2 = new d(7, false);
                this.c = dVar2;
                this.d = dVar2;
                this.b = str;
                break;
        }
    }

    public d(String str, Boolean bool, xc.a aVar, String str2) {
        this.a = 13;
        this.b = str;
        this.c = str2;
        this.d = aVar;
    }

    public d(jg.s0 s0Var) {
        this.a = 0;
        this.b = s0Var;
        this.c = new lg(8);
        this.d = new ArrayList();
    }

    public d(c3.r rVar) {
        this.a = 4;
        this.b = rVar;
    }

    @Override // t0.h
    public void b() {
    }

    @Override // t0.h
    public void f() {
    }

    public d(String str, String str2) {
        this.a = 3;
        this.b = str;
        this.c = str2;
        this.d = str2.isEmpty() ? str : a1.g.D(str, "/", str2);
    }
}
