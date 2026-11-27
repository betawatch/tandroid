// default package

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pm3 implements tw8, ILocationServiceProvider, iq5, ws4, jc7, ly9, ifc, v78, jb9 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public pm3(vh4 vh4Var, xdc xdcVar, fg7 fg7Var) {
        pg7 pg7Var;
        int i;
        int i2;
        this.a = (byte) 21;
        this.c = vh4Var;
        this.d = new ArrayList();
        fg7 fg7Var2 = fg7Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            pg7Var = pg7.n;
            if (fg7Var2 == null) {
                break;
            }
            int i5 = fg7Var2.c;
            int i6 = i3 + fg7Var2.d;
            fg7 fg7Var3 = fg7Var2.e;
            int i7 = i4;
            pg7 pg7Var2 = fg7Var2.a;
            boolean z = (pg7Var2 == pg7.h && fg7Var3 == null && i5 != 0) || !(fg7Var3 == null || i5 == fg7Var3.c);
            i = z ? 1 : i7;
            if (fg7Var3 == null || fg7Var3.a != pg7Var2 || z) {
                ((ArrayList) this.d).add(0, new gg7(this, pg7Var2, fg7Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.d).add(0, new gg7(this, pg7Var, fg7Var2.b, fg7Var2.c, 0));
            }
            i4 = i;
            fg7Var2 = fg7Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = vh4Var.a;
        r44 r44Var = (r44) vh4Var.d;
        if (z2) {
            gg7 gg7Var = (gg7) ((ArrayList) this.d).get(0);
            if (gg7Var != null && gg7Var.a != pg7Var && i8 != 0) {
                ((ArrayList) this.d).add(0, new gg7(this, pg7Var, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((gg7) ((ArrayList) this.d).get(0)).a == pg7Var ? 1 : 0, new gg7(this, pg7.s, 0, 0, 0));
        }
        int i9 = xdcVar.a;
        int i10 = 26;
        int F = ik8.F(i9 <= 9 ? 1 : i9 <= 26 ? 2 : 3);
        if (F == 0) {
            i10 = 9;
        } else if (F != 1) {
            i = 27;
            i10 = 40;
        } else {
            i = 10;
        }
        int x = x(xdcVar);
        while (i9 < i10 && !k34.d(x, xdc.c(i9), r44Var)) {
            i9++;
        }
        while (i9 > i && k34.d(x, xdc.c(i9 - 1), r44Var)) {
            i9--;
        }
        this.b = xdc.c(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public static StringBuilder C(String str) {
        StringBuilder sb;
        boolean z;
        byte[] H;
        char c;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z2 = false;
            boolean z3 = false;
            pm3 pm3Var = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.startsWith("PHOTO")) {
                    z3 = z3;
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            pm3Var = new pm3((byte) 19, z2);
                            pm3Var.d = new ArrayList();
                            pm3Var.b = new ArrayList();
                            z3 = z3;
                        } else {
                            z3 = z3;
                            z3 = z3;
                            if (readLine.startsWith("END:VCARD") && pm3Var != null) {
                                z3 = true;
                            }
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(z2 ? 1 : 0, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        String[] strArr = indexOf >= 0 ? new String[]{readLine.substring(z2 ? 1 : 0, indexOf), readLine.substring(indexOf + 1).trim()} : new String[]{readLine.trim()};
                        if (strArr.length < 2 || pm3Var == null) {
                            z = z2 ? 1 : 0;
                        } else if (strArr[z2 ? 1 : 0].startsWith("ORG")) {
                            String[] split = strArr[z2 ? 1 : 0].split(";");
                            int length = split.length;
                            int i = z2 ? 1 : 0;
                            String str3 = null;
                            String str4 = null;
                            ?? r2 = z2;
                            while (i < length) {
                                String[] split2 = split[i].split("=");
                                sb = null;
                                try {
                                    if (split2.length != 2) {
                                        c = r2;
                                    } else {
                                        c = r2;
                                        if (split2[r2].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[c].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i++;
                                    r2 = c;
                                } catch (Throwable unused) {
                                    return sb;
                                }
                            }
                            z = r2;
                            pm3Var.c = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = hl.H(hl.g1((String) pm3Var.c))) != null && H.length != 0) {
                                pm3Var.c = new String(H, str4);
                            }
                            pm3Var.c = ((String) pm3Var.c).replace(';', ' ');
                        } else {
                            ?? r17 = z2 ? 1 : 0;
                            if (strArr[r17].startsWith("TEL")) {
                                z = r17;
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) pm3Var.b).add(strArr[1]);
                                    z = r17;
                                }
                            } else {
                                boolean startsWith = strArr[r17].startsWith("EMAIL");
                                z = r17;
                                if (startsWith) {
                                    String str5 = strArr[1];
                                    z = r17;
                                    if (str5.length() > 0) {
                                        ((ArrayList) pm3Var.d).add(str5);
                                        z = r17;
                                    }
                                }
                            }
                        }
                        z2 = z;
                    }
                }
                return sb;
            }
            int i2 = z2 ? 1 : 0;
            sb = null;
            try {
                bufferedReader.close();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (!z3) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = i2; i3 < ((ArrayList) pm3Var.b).size(); i3++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                String str6 = (String) ((ArrayList) pm3Var.b).get(i3);
                if (str6.contains("#") || str6.contains("*")) {
                    sb2.append(str6);
                } else {
                    sb2.append(f78.f().e(str6));
                }
            }
            for (int i4 = i2; i4 < ((ArrayList) pm3Var.d).size(); i4++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(f78.f().e((String) ((ArrayList) pm3Var.d).get(i4)));
            }
            if (!TextUtils.isEmpty((String) pm3Var.c)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append((String) pm3Var.c);
            }
            return sb2;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String q(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return qd4.y(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public final void A(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public final String B() {
        if (!z()) {
            lq5.n();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public final void D(je9 je9Var, Serializable serializable) {
        EnumMap enumMap = (EnumMap) this.d;
        if (enumMap == null) {
            enumMap = new EnumMap(je9.class);
            this.d = enumMap;
        }
        enumMap.put((EnumMap) je9Var, (je9) serializable);
    }

    public final void E(ta0 ta0Var, int i, boolean z) {
        char c;
        la0 la0Var = (la0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ta0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        pm8 pm8Var = ta0Var.c;
        adler32.update(allocate.putInt(qm8.a(pm8Var)).array());
        byte[] bArr = ta0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        pse.a(ta0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((ds9) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(qm8.a(pm8Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(la0Var.a(pm8Var, longValue, i));
            Set set = ((ma0) la0Var.b.get(pm8Var)).c;
            Long l = valueOf;
            if (set.contains(eu9.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(eu9.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(eu9.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", qm8.a(pm8Var));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(la0Var.a(pm8Var, longValue, i));
            Integer valueOf4 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = ta0Var;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = l;
            objArr[4] = valueOf4;
            String c2 = pse.c("JobInfoScheduler");
            if (Log.isLoggable(c2, 3)) {
                Log.d(c2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // jc7
    public final void a() {
        ((dq1) this.b).c(false);
        ((e) this.c).presentFragment(new zu1((Bundle) this.d));
    }

    @Override // ly9
    public final void b(ey7 ey7Var) {
        long d;
        ((usb) this.c).getClass();
        String str = gcc.a;
        usb usbVar = (usb) this.c;
        synchronized (usbVar) {
            long j = usbVar.c;
            d = j != -9223372036854775807L ? j + usbVar.b : usbVar.d();
        }
        long e = ((usb) this.c).e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        ko4 ko4Var = (ko4) this.b;
        if (e != ko4Var.y) {
            jo4 a = ko4Var.a();
            a.x = e;
            ko4 ko4Var2 = new ko4(a);
            this.b = ko4Var2;
            ((x1c) this.d).g(ko4Var2);
        }
        int a2 = ey7Var.a();
        ((x1c) this.d).e(a2, ey7Var);
        ((x1c) this.d).a(d, 1, a2, 0, null);
    }

    @Override // ly9
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
        this.c = usbVar;
        l6cVar.a();
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 5);
        this.d = e0;
        e0.g((ko4) this.b);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void checkLocationSettings(qj5 qj5Var, pt2 pt2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((t05) qj5Var).a);
        qa4 qa4Var = (qa4) this.c;
        nd6 nd6Var = new nd6(arrayList, false, false);
        qa4Var.getClass();
        wjb b = xjb.b();
        b.a = new k09(nd6Var, (byte) 27);
        b.d = (char) 2426;
        qa4Var.e(0, b.a()).addOnCompleteListener(new q05(pt2Var, (byte) 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final boolean checkServices() {
        return b.b.hasServices();
    }

    @Override // jb9
    public final void d() {
        pcc pccVar;
        boolean[] zArr = (boolean[]) this.b;
        byte b = 1;
        if (!zArr[0] && (pccVar = (pcc) this.c) != null) {
            zArr[0] = true;
            pccVar.a(Boolean.TRUE);
        }
        hl.d3(new i((d31) this.d, b), 200L);
    }

    @Override // iq5
    public final Uri e() {
        return (Uri) this.b;
    }

    @Override // uw8
    public final Object get() {
        Context context = (Context) ((aj3) this.b).b;
        mx2 mx2Var = (mx2) ((aj3) this.c).b;
        p9a p9aVar = (p9a) ((tw8) this.d).get();
        context.getClass();
        mx2Var.getClass();
        p9aVar.getClass();
        return ij4.a(p9aVar, new i09((Object) new a2((Object) p9aVar, (byte) 4), (byte) 3), xde.a(mx2Var), new hj4(context, (byte) 1));
    }

    @Override // iq5
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void getLastLocation(pt2 pt2Var) {
        qa4 qa4Var = (qa4) this.b;
        qa4Var.getClass();
        wjb b = xjb.b();
        b.a = sae.d;
        b.d = (char) 2414;
        qa4Var.e(0, b.a()).addOnCompleteListener(new q05(pt2Var, (byte) 0));
    }

    @Override // iq5
    public final Uri h() {
        return (Uri) this.d;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void init(Context context) {
        zn znVar = md6.a;
        zn znVar2 = qa4.r;
        g05 g05Var = g05.c;
        vn vnVar = wn.g;
        this.b = new qa4(context, znVar2, vnVar, g05Var);
        this.c = new qa4(context, znVar2, vnVar, g05Var);
    }

    @Override // iq5
    public final Object j() {
        return null;
    }

    @Override // ws4
    public final void k(Throwable th) {
        qy6 qy6Var = (qy6) this.d;
        qs qsVar = qy6Var.h;
        ry6 ry6Var = (ry6) this.b;
        qy6Var.i.remove(ry6Var);
    }

    @Override // jc7
    public final void l(boolean z) {
        ((dq1) this.b).c(false);
        ((e) this.c).presentFragment(new zu1((Bundle) this.d));
    }

    @Override // v78
    public final void m(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((q7a) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new vp8((Object) str, this.b, this.c, this.d, (byte) 6));
    }

    public final void o() {
        rx6 rx6Var = (rx6) this.b;
        if (rx6Var != null) {
            int i = ((a05) this.d).n.d;
            ex6 ex6Var = (ex6) rx6Var.b;
            ex6Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            ex6Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final qj5 onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(jn7.m1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        t05 t05Var = new t05();
        t05Var.a = locationRequest;
        return t05Var;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final rj5 onCreateLocationServicesAPI(Context context, nj5 nj5Var, final oj5 oj5Var) {
        List list;
        Context context2 = a.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        qs qsVar = new qs(0);
        qs qsVar2 = new qs(0);
        Object obj = i05.d;
        rr5 rr5Var = e7d.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        zn znVar = md6.a;
        xve.i(znVar, "Api must not be null");
        rj5 rj5Var = null;
        qsVar2.put(znVar, null);
        switch (znVar.a.a) {
            case 9:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new s05(nj5Var));
        arrayList2.add(new l05() { // from class: p05
            @Override // l05
            public final void onConnectionFailed(ws2 ws2Var) {
                id6 id6Var = (id6) oj5.this;
                if (id6Var.M) {
                    return;
                }
                id6Var.L = Boolean.FALSE;
                if (id6Var.E) {
                    id6Var.E = false;
                    id6Var.p();
                }
            }
        });
        boolean z2 = true;
        xve.a("must call addApi() to add at least one API", !qsVar2.isEmpty());
        zka zkaVar = zka.a;
        zn znVar2 = e7d.b;
        if (qsVar2.containsKey(znVar2)) {
            zkaVar = (zka) qsVar2.get(znVar2);
        }
        oxb oxbVar = new oxb(hashSet, qsVar, packageName, name, zkaVar);
        Map map = (Map) oxbVar.c;
        qs qsVar3 = new qs(0);
        qs qsVar4 = new qs(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((os) qsVar2.keySet()).iterator();
        zn znVar3 = null;
        while (true) {
            ns nsVar = (ns) it;
            if (!nsVar.hasNext()) {
                oxb oxbVar2 = oxbVar;
                qs qsVar5 = qsVar3;
                qs qsVar6 = qsVar4;
                zn znVar4 = znVar3;
                rj5 rj5Var2 = rj5Var;
                Looper looper = mainLooper;
                if (znVar4 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = znVar4.c;
                    if (!equals) {
                        grb.i(qd4.y("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                        return rj5Var2;
                    }
                }
                d6d d6dVar = new d6d(context2, new ReentrantLock(), looper, oxbVar2, qsVar5, arrayList, arrayList2, qsVar6, d6d.f(qsVar6.values(), true), arrayList3);
                Set set = m05.a;
                synchronized (set) {
                    set.add(d6dVar);
                }
                aj3 aj3Var = new aj3((byte) 9, false);
                aj3Var.b = d6dVar;
                return aj3Var;
            }
            rj5 rj5Var3 = rj5Var;
            zn znVar5 = (zn) nsVar.next();
            Object obj2 = qsVar2.get(znVar5);
            boolean z3 = map.get(znVar5) != null ? z2 : z;
            qsVar3.put(znVar5, Boolean.valueOf(z3));
            qs qsVar7 = qsVar4;
            y7d y7dVar = new y7d(znVar5, z3);
            arrayList3.add(y7dVar);
            Map map2 = map;
            oxb oxbVar3 = oxbVar;
            Looper looper2 = mainLooper;
            zn znVar6 = znVar3;
            qs qsVar8 = qsVar3;
            qs qsVar9 = qsVar2;
            d05 a = znVar5.a.a(context2, looper2, oxbVar3, obj2, y7dVar, y7dVar);
            qsVar7.put(znVar5.b, a);
            d05 d05Var = a;
            d05Var.getClass();
            if (!(d05Var instanceof q8d)) {
                rj5Var = rj5Var3;
                mainLooper = looper2;
                oxbVar = oxbVar3;
                qsVar4 = qsVar7;
                znVar3 = znVar6;
                map = map2;
                qsVar3 = qsVar8;
                z = false;
                z2 = true;
            } else {
                if (znVar6 != null) {
                    String str2 = znVar5.c;
                    String str3 = znVar6.c;
                    grb.i(qu6.o(str2, " cannot be used with ", str3, new StringBuilder(str2.length() + 21 + str3.length())));
                    return rj5Var3;
                }
                mainLooper = looper2;
                oxbVar = oxbVar3;
                qsVar4 = qsVar7;
                znVar3 = znVar5;
                map = map2;
                qsVar3 = qsVar8;
                z = false;
                z2 = true;
                rj5Var = rj5Var3;
            }
            qsVar2 = qsVar9;
        }
    }

    @Override // ifc
    public final void onError(kfc kfcVar, Exception exc) {
        bab babVar = ((mm8) this.d).O;
        if (babVar != null) {
            babVar.run();
        }
    }

    @Override // ifc
    public final void onRenderedFirstFrame() {
        c8b c8bVar = (c8b) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        mm8 mm8Var = (mm8) this.d;
        o00 o00Var = mm8Var.I;
        if (o00Var != null && o00Var.g) {
            int i = mm8Var.f;
            int i2 = mm8Var.h;
            o00Var.d = true;
            o00Var.e = i;
            o00Var.f = i2;
            yt4 yt4Var = (yt4) o00Var.c;
            if (yt4Var != null) {
                yt4Var.a(Integer.valueOf(i), Integer.valueOf(o00Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            kec kecVar = mm8Var.n;
            if (kecVar != null) {
                if (o00Var == null || !o00Var.g) {
                    kecVar.animate().alpha(1.0f).setDuration(180L).withEndAction(new h68(this, c8bVar, (byte) 20)).start();
                    return;
                }
                return;
            }
            return;
        }
        mm8Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = mm8Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (c8bVar.M0 == mm8Var.a) {
                c8bVar.M0 = null;
            }
            mm8Var.a = null;
            mm8Var.invalidate();
        }
    }

    @Override // ifc
    public final void onStateChanged(boolean z, int i) {
        mm8 mm8Var = (mm8) this.d;
        kfc kfcVar = mm8Var.e;
        if (kfcVar == null) {
            return;
        }
        boolean c0 = kfcVar.c0();
        lm8 lm8Var = mm8Var.L;
        if (c0) {
            hl.c3(lm8Var);
        } else {
            hl.r(lm8Var);
        }
    }

    @Override // ws4
    public final void onSuccess(Object obj) {
        vw6 vw6Var = (vw6) obj;
        List list = (List) ((qy6) this.d).i.remove((ry6) this.b);
        if (((qy6) this.d).j.i() || vw6Var == null) {
            return;
        }
        rx6 rx6Var = ((qy6) this.d).g;
        xw6 xw6Var = (xw6) this.c;
        rx6Var.b(xw6Var.a, xw6Var, vw6Var.a, vw6Var.b);
        yx6 yx6Var = ((qy6) this.d).j;
        xw6 xw6Var2 = (xw6) this.c;
        if (!yx6Var.x || !yx6.j(xw6Var2)) {
            yx6Var.e.getClass();
        }
        qy6 qy6Var = (qy6) this.d;
        d1 d1Var = qy6Var.m;
        xw6 xw6Var3 = (xw6) this.c;
        long j = qy6Var.t;
        d1Var.removeMessages(1001, xw6Var3);
        d1Var.sendMessageDelayed(d1Var.obtainMessage(1001, xw6Var3), j);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((py6) it.next()).a((xw6) this.c);
                } catch (RemoteException e) {
                    efd.g("MediaSessionLegacyStub", "Exception in " + ((xw6) this.c), e);
                }
            }
        }
    }

    @Override // ifc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ifc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((mm8) this.d).h();
    }

    @Override // ifc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        mm8 mm8Var = (mm8) this.d;
        c8b c8bVar = (c8b) this.b;
        if (c8bVar != null) {
            b8b V = mm8Var.e.V(c8bVar.d1);
            c8bVar.d1 = V;
            kec kecVar = mm8Var.n;
            if (kecVar != null) {
                kecVar.setHDRInfo(V);
            }
        }
        int i4 = (int) (i * f);
        mm8Var.f = i4;
        int i5 = (int) (i2 * f);
        mm8Var.h = i5;
        if (c8bVar != null && (c8bVar.k0 != i4 || c8bVar.l0 != i5)) {
            c8bVar.k0 = i4;
            c8bVar.l0 = i5;
            c8bVar.z();
        }
        mm8Var.a();
        kec kecVar2 = mm8Var.n;
        if (kecVar2 != null) {
            int i6 = mm8Var.f;
            int i7 = mm8Var.h;
            kecVar2.d = i6;
            kecVar2.e = i7;
            rf4 rf4Var = kecVar2.b;
            if (rf4Var != null) {
                rf4Var.postRunnable(new of4(rf4Var, i6, i7, (byte) 0));
            }
        }
    }

    public final void p(Canvas canvas, RectF rectF, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void r(Canvas canvas, RectF rectF, int i, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i].setAlpha((int) (255.0f * f));
        canvas.drawRect(rectF, paintArr[i]);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void removeLocationUpdates(pj5 pj5Var) {
        r05 r05Var = (r05) ((HashMap) this.d).remove(pj5Var);
        if (r05Var != null) {
            qa4 qa4Var = (qa4) this.b;
            qa4Var.getClass();
            String simpleName = r05.class.getSimpleName();
            xve.g(simpleName, "Listener type must not be empty");
            qa4Var.c(new y76(r05Var, simpleName), 2418).continueWith(no3.c, rg7.e);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void requestLocationUpdates(qj5 qj5Var, pj5 pj5Var) {
        r05 r05Var = (r05) ((HashMap) this.d).remove(pj5Var);
        if (r05Var != null) {
            qa4 qa4Var = (qa4) this.b;
            qa4Var.getClass();
            String simpleName = r05.class.getSimpleName();
            xve.g(simpleName, "Listener type must not be empty");
            qa4Var.c(new y76(r05Var, simpleName), 2418).continueWith(no3.c, rg7.e);
        }
        r05 r05Var2 = new r05(pj5Var);
        ((HashMap) this.d).put(pj5Var, r05Var2);
        ((qa4) this.b).j(((t05) qj5Var).a, r05Var2, Looper.getMainLooper());
    }

    public final pi5 s() {
        HttpsURLConnection httpsURLConnection;
        rx6.w();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String q = q((String) this.c, (HashMap) this.b);
            String concat = "GET Request URL: ".concat(q);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(q).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[TLObject.FLAG_13];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new pi5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String t() {
        String str = (String) this.c;
        int indexOf = str.indexOf(44);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public final String toString() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((nm3) this.b).a + ":" + ((String) this.c);
            case 10:
                StringBuilder sb = new StringBuilder("id3v2tag[pos=");
                m29 m29Var = (m29) this.b;
                sb.append(m29Var.b);
                sb.append(", ");
                sb.append(m29Var.e());
                sb.append(" left]");
                return sb.toString();
            case 13:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='" + ((String) this.c) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((ji2) this.d) + ')';
            case 21:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                gg7 gg7Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    gg7 gg7Var2 = (gg7) obj;
                    if (gg7Var != null) {
                        sb2.append(",");
                    }
                    sb2.append(gg7Var2.toString());
                    gg7Var = gg7Var2;
                }
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                um4 um4Var = (um4) this.b;
                String str = "";
                while (true) {
                    um4Var = (um4) um4Var.c;
                    if (um4Var == null) {
                        sb3.append('}');
                        return sb3.toString();
                    }
                    Object obj2 = um4Var.b;
                    sb3.append(str);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
                break;
            case 27:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public final gj5 u(hj5 hj5Var) {
        InputStream inputStream;
        int i = hj5Var.c;
        InputStream inputStream2 = (m29) this.b;
        if (hj5Var.d) {
            xh4 xh4Var = (xh4) this.d;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = ((i51) xh4Var.b).read(bArr, i2, i - i2);
                if (read <= 0) {
                    throw new EOFException();
                }
                i2 += read;
            }
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (!z || b != 0) {
                    bArr[i3] = b;
                    i3++;
                }
                z = b == -1;
            }
            inputStream2 = new ByteArrayInputStream(bArr, 0, i3);
            i = i3;
        }
        if (hj5Var.f) {
            throw new ej5("Frame encryption is not supported");
        }
        if (hj5Var.e) {
            i = hj5Var.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new gj5(inputStream, hj5Var.b, i, (jj5) this.c, hj5Var);
    }

    public final ByteBuffer v() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            return (ByteBuffer) this.c;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = ((Bitmap) this.d).getHeight();
        int i = width * height;
        ((Bitmap) this.d).getPixels(new int[i], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((Color.blue(r1[i2]) * 0.114f) + (Color.green(r1[i2]) * 0.587f) + (Color.red(r1[i2]) * 0.299f));
        }
        return ByteBuffer.wrap(bArr);
    }

    public final Paint w(float f, int i) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader(null);
        paintArr[i].setColor(-65536);
        paintArr[i].setAlpha((int) (f * 255.0f));
        return paintArr[i];
    }

    public final int x(xdc xdcVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            gg7 gg7Var = (gg7) obj;
            int i3 = gg7Var.d;
            pg7 pg7Var = gg7Var.a;
            int a = pg7Var.a(xdcVar);
            int i4 = a + 4;
            int ordinal = pg7Var.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i4 = ((i3 / 2) * 11) + i4 + (i3 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i4 += gg7Var.a() << 3;
                } else if (ordinal == 5) {
                    i4 = a + 12;
                } else if (ordinal == 6) {
                    i4 += i3 * 13;
                }
            } else {
                int i5 = ((i3 / 3) * 10) + i4;
                int i6 = i3 % 3;
                i4 = i5 + (i6 != 1 ? i6 == 2 ? 7 : 0 : 4);
            }
            i += i4;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y() {
        gm5 gm5Var;
        if (((ot6) this.d).a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String e = ((ot6) this.d).e("gcm.n.image");
        if (!TextUtils.isEmpty(e)) {
            try {
                gm5Var = new gm5(new URL(e));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + e);
            }
            if (gm5Var != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                gm5Var.b = executorService.submit(new tg5(gm5Var, taskCompletionSource, (byte) 2));
                gm5Var.c = taskCompletionSource.getTask();
            }
            lh2 a = gn2.a((FirebaseMessagingService) this.c, (ot6) this.d);
            wn7 wn7Var = (wn7) a.b;
            if (gm5Var != null) {
                try {
                    Task task = gm5Var.c;
                    xve.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    wn7Var.g(bitmap);
                    qn7 qn7Var = new qn7();
                    qn7Var.e = bitmap == null ? null : IconCompat.c(bitmap);
                    qn7Var.f = null;
                    qn7Var.g = true;
                    wn7Var.i(qn7Var);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    gm5Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e2) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    gm5Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a.c, 0, ((wn7) a.b).b());
            return true;
        }
        gm5Var = null;
        if (gm5Var != null) {
        }
        lh2 a2 = gn2.a((FirebaseMessagingService) this.c, (ot6) this.d);
        wn7 wn7Var2 = (wn7) a2.b;
        if (gm5Var != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.c, 0, ((wn7) a2.b).b());
        return true;
    }

    public final boolean z() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    @Override // jb9
    public final void f() {
    }

    @Override // iq5
    public final void g() {
    }

    @Override // jb9
    public final void i() {
    }

    @Override // iq5
    public final void n() {
    }

    @Override // v78
    public final void y0() {
    }

    @Override // ifc
    public final void onSeekFinished(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekStarted(uj ujVar) {
    }

    @Override // ifc
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    public /* synthetic */ pm3(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ pm3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    public /* synthetic */ pm3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public pm3(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.d = new HashMap();
                break;
            case 7:
                this.b = new Paint[4];
                this.d = new Matrix();
                break;
            case 13:
                this.c = "    ";
                this.b = TeXSymbolParser.TYPE_ATTR;
                this.d = ji2.a;
                break;
            default:
                this.b = new rc0();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public pm3(InputStream inputStream, long j, int i, jj5 jj5Var) {
        this.a = (byte) 10;
        m29 m29Var = new m29(inputStream, j, i);
        this.b = m29Var;
        this.d = new xh4((Object) m29Var, (byte) 7);
        this.c = jj5Var;
    }

    public pm3(String str, HashMap hashMap) {
        this.a = (byte) 9;
        this.c = str;
        this.b = hashMap;
        this.d = new HashMap();
    }

    public pm3(String str, ke9[] ke9VarArr) {
        this.a = (byte) 27;
        System.currentTimeMillis();
        this.c = str;
        this.b = ke9VarArr;
        this.d = null;
    }

    public pm3(FirebaseMessagingService firebaseMessagingService, ot6 ot6Var, ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = ot6Var;
    }

    public pm3(Runnable runnable) {
        this.a = (byte) 18;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public pm3(String str, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                jo4 jo4Var = new jo4();
                jo4Var.r = dg7.n("video/mp2t");
                jo4Var.s = dg7.n(str);
                this.b = new ko4(jo4Var);
                break;
            default:
                um4 um4Var = new um4((byte) 13);
                this.b = um4Var;
                this.d = um4Var;
                this.c = str;
                break;
        }
    }

    public pm3(Signature signature) {
        this.a = (byte) 2;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public pm3(Cipher cipher) {
        this.a = (byte) 2;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public pm3(Mac mac) {
        this.a = (byte) 2;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public /* synthetic */ pm3(byte b, boolean z) {
        this.a = b;
    }

    public pm3(qy6 qy6Var, ry6 ry6Var, ny6 ny6Var, xw6 xw6Var) {
        this.a = (byte) 17;
        this.d = qy6Var;
        this.b = ry6Var;
        this.c = xw6Var;
    }
}
