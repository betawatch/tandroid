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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xl3 implements kt8, ILocationServiceProvider, fo5, sq4, ca7, ru9, ibc, f48, x79 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public xl3(xf4 xf4Var, x9c x9cVar, wd7 wd7Var) {
        ge7 ge7Var;
        int i;
        int i2;
        this.a = (byte) 21;
        this.c = xf4Var;
        this.d = new ArrayList();
        wd7 wd7Var2 = wd7Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ge7Var = ge7.n;
            if (wd7Var2 == null) {
                break;
            }
            int i5 = wd7Var2.c;
            int i6 = i3 + wd7Var2.d;
            wd7 wd7Var3 = wd7Var2.e;
            int i7 = i4;
            ge7 ge7Var2 = wd7Var2.a;
            boolean z = (ge7Var2 == ge7.h && wd7Var3 == null && i5 != 0) || !(wd7Var3 == null || i5 == wd7Var3.c);
            i = z ? 1 : i7;
            if (wd7Var3 == null || wd7Var3.a != ge7Var2 || z) {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var2, wd7Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var, wd7Var2.b, wd7Var2.c, 0));
            }
            i4 = i;
            wd7Var2 = wd7Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = xf4Var.a;
        w34 w34Var = (w34) xf4Var.d;
        if (z2) {
            xd7 xd7Var = (xd7) ((ArrayList) this.d).get(0);
            if (xd7Var != null && xd7Var.a != ge7Var && i8 != 0) {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((xd7) ((ArrayList) this.d).get(0)).a == ge7Var ? 1 : 0, new xd7(this, ge7.s, 0, 0, 0));
        }
        int i9 = x9cVar.a;
        int i10 = 26;
        int F = ug8.F(i9 <= 9 ? 1 : i9 <= 26 ? 2 : 3);
        if (F == 0) {
            i10 = 9;
        } else if (F != 1) {
            i = 27;
            i10 = 40;
        } else {
            i = 10;
        }
        int y = y(x9cVar);
        while (i9 < i10 && !p24.d(y, x9c.c(i9), w34Var)) {
            i9++;
        }
        while (i9 > i && p24.d(y, x9c.c(i9 - 1), w34Var)) {
            i9--;
        }
        this.b = x9c.c(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public static StringBuilder D(String str) {
        StringBuilder sb;
        boolean z;
        byte[] H;
        char c;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z2 = false;
            boolean z3 = false;
            xl3 xl3Var = null;
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
                            xl3Var = new xl3((byte) 19, z2);
                            xl3Var.d = new ArrayList();
                            xl3Var.b = new ArrayList();
                            z3 = z3;
                        } else {
                            z3 = z3;
                            z3 = z3;
                            if (readLine.startsWith("END:VCARD") && xl3Var != null) {
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
                        if (strArr.length < 2 || xl3Var == null) {
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
                            xl3Var.c = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = gl.H(gl.g1((String) xl3Var.c))) != null && H.length != 0) {
                                xl3Var.c = new String(H, str4);
                            }
                            xl3Var.c = ((String) xl3Var.c).replace(';', ' ');
                        } else {
                            ?? r17 = z2 ? 1 : 0;
                            if (strArr[r17].startsWith("TEL")) {
                                z = r17;
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) xl3Var.b).add(strArr[1]);
                                    z = r17;
                                }
                            } else {
                                boolean startsWith = strArr[r17].startsWith("EMAIL");
                                z = r17;
                                if (startsWith) {
                                    String str5 = strArr[1];
                                    z = r17;
                                    if (str5.length() > 0) {
                                        ((ArrayList) xl3Var.d).add(str5);
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
                fa4.g(e, true);
            }
            if (!z3) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = i2; i3 < ((ArrayList) xl3Var.b).size(); i3++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                String str6 = (String) ((ArrayList) xl3Var.b).get(i3);
                if (str6.contains("#") || str6.contains("*")) {
                    sb2.append(str6);
                } else {
                    sb2.append(p38.f().e(str6));
                }
            }
            for (int i4 = i2; i4 < ((ArrayList) xl3Var.d).size(); i4++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(p38.f().e((String) ((ArrayList) xl3Var.d).get(i4)));
            }
            if (!TextUtils.isEmpty((String) xl3Var.c)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append((String) xl3Var.c);
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
            return tb4.y(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public final boolean A() {
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

    public final void B(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public final String C() {
        if (!A()) {
            w26.g();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public final void E(va9 va9Var, Serializable serializable) {
        EnumMap enumMap = (EnumMap) this.d;
        if (enumMap == null) {
            enumMap = new EnumMap(va9.class);
            this.d = enumMap;
        }
        enumMap.put((EnumMap) va9Var, (va9) serializable);
    }

    public final void F(ra0 ra0Var, int i, boolean z) {
        char c;
        ja0 ja0Var = (ja0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ra0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        cj8 cj8Var = ra0Var.c;
        adler32.update(allocate.putInt(dj8.a(cj8Var)).array());
        byte[] bArr = ra0Var.b;
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
                        xne.a(ra0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((lo9) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(dj8.a(cj8Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(ja0Var.a(cj8Var, longValue, i));
            Set set = ((ka0) ja0Var.b.get(cj8Var)).c;
            Long l = valueOf;
            if (set.contains(mq9.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(mq9.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(mq9.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", dj8.a(cj8Var));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf2 = Integer.valueOf(value);
            Long valueOf3 = Long.valueOf(ja0Var.a(cj8Var, longValue, i));
            Integer valueOf4 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = ra0Var;
            objArr[1] = valueOf2;
            objArr[2] = valueOf3;
            objArr[3] = l;
            objArr[4] = valueOf4;
            String c2 = xne.c("JobInfoScheduler");
            if (Log.isLoggable(c2, 3)) {
                Log.d(c2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // ca7
    public final void a() {
        ((pp1) this.b).c(false);
        ((d) this.c).presentFragment(new mu1((Bundle) this.d));
    }

    @Override // ru9
    public final void b(xu7 xu7Var) {
        long d;
        ((uob) this.c).getClass();
        String str = g8c.a;
        uob uobVar = (uob) this.c;
        synchronized (uobVar) {
            long j = uobVar.c;
            d = j != -9223372036854775807L ? j + uobVar.b : uobVar.d();
        }
        long e = ((uob) this.c).e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        fm4 fm4Var = (fm4) this.b;
        if (e != fm4Var.y) {
            em4 a = fm4Var.a();
            a.x = e;
            fm4 fm4Var2 = new fm4(a);
            this.b = fm4Var2;
            ((wxb) this.d).g(fm4Var2);
        }
        int a2 = xu7Var.a();
        ((wxb) this.d).e(a2, xu7Var);
        ((wxb) this.d).a(d, 1, a2, 0, null);
    }

    @Override // ru9
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
        this.c = uobVar;
        l2cVar.a();
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 5);
        this.d = S;
        S.g((fm4) this.b);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void checkLocationSettings(oh5 oh5Var, vs2 vs2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((oy4) oh5Var).a);
        u84 u84Var = (u84) this.c;
        jb6 jb6Var = new jb6(arrayList, false, false);
        u84Var.getClass();
        agb b = bgb.b();
        b.a = new v39(jb6Var, (byte) 27);
        b.d = (char) 2426;
        u84Var.e(0, b.a()).addOnCompleteListener(new ky4(vs2Var, (byte) 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final boolean checkServices() {
        return b.b.hasServices();
    }

    @Override // x79
    public final void d() {
        p8c p8cVar;
        boolean[] zArr = (boolean[]) this.b;
        byte b = 1;
        if (!zArr[0] && (p8cVar = (p8c) this.c) != null) {
            zArr[0] = true;
            p8cVar.a(Boolean.TRUE);
        }
        gl.d3(new i((u21) this.d, b), 200L);
    }

    @Override // f48
    public final void e(ArrayList arrayList) {
        String str = !arrayList.isEmpty() ? ((y3a) arrayList.get(0)).c : null;
        if (str == null) {
            return;
        }
        Utilities.e.c(new bm8((Object) str, this.b, this.c, this.d, (byte) 5));
    }

    @Override // fo5
    public final Uri f() {
        return (Uri) this.b;
    }

    @Override // lt8
    public final Object get() {
        Context context = (Context) ((mo5) this.b).a;
        sw2 sw2Var = (sw2) ((mo5) this.c).a;
        x5a x5aVar = (x5a) ((kt8) this.d).get();
        context.getClass();
        sw2Var.getClass();
        x5aVar.getClass();
        return hh4.a(x5aVar, new ln8((Object) new z1((Object) x5aVar, (byte) 4), (byte) 5), h9e.a(sw2Var), new gh4(context, (byte) 1));
    }

    @Override // fo5
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void getLastLocation(vs2 vs2Var) {
        u84 u84Var = (u84) this.b;
        u84Var.getClass();
        agb b = bgb.b();
        b.a = c6e.d;
        b.d = (char) 2414;
        u84Var.e(0, b.a()).addOnCompleteListener(new ky4(vs2Var, (byte) 0));
    }

    @Override // fo5
    public final Uri i() {
        return (Uri) this.d;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final void init(Context context) {
        yn ynVar = ib6.a;
        yn ynVar2 = u84.r;
        ay4 ay4Var = ay4.c;
        un unVar = vn.g;
        this.b = new u84(context, ynVar2, unVar, ay4Var);
        this.c = new u84(context, ynVar2, unVar, ay4Var);
    }

    @Override // sq4
    public final void k(Throwable th) {
        lw6 lw6Var = (lw6) this.d;
        ps psVar = lw6Var.h;
        mw6 mw6Var = (mw6) this.b;
        lw6Var.i.remove(mw6Var);
    }

    @Override // fo5
    public final Object l() {
        return null;
    }

    @Override // ca7
    public final void m(boolean z) {
        ((pp1) this.b).c(false);
        ((d) this.c).presentFragment(new mu1((Bundle) this.d));
    }

    public final void o() {
        mv6 mv6Var = (mv6) this.b;
        if (mv6Var != null) {
            int i = ((ux4) this.d).n.d;
            zu6 zu6Var = (zu6) mv6Var.b;
            zu6Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            zu6Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final oh5 onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(kk7.m1, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        oy4 oy4Var = new oy4();
        oy4Var.a = locationRequest;
        return oy4Var;
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final ph5 onCreateLocationServicesAPI(Context context, lh5 lh5Var, final mh5 mh5Var) {
        List list;
        Context context2 = a.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ps psVar = new ps(0);
        ps psVar2 = new ps(0);
        Object obj = cy4.d;
        op5 op5Var = n2d.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        yn ynVar = ib6.a;
        fre.i(ynVar, "Api must not be null");
        ph5 ph5Var = null;
        psVar2.put(ynVar, null);
        switch (ynVar.a.a) {
            case 9:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new my4(lh5Var));
        arrayList2.add(new fy4() { // from class: jy4
            @Override // fy4
            public final void onConnectionFailed(ds2 ds2Var) {
                eb6 eb6Var = (eb6) mh5.this;
                if (eb6Var.M) {
                    return;
                }
                eb6Var.L = Boolean.FALSE;
                if (eb6Var.E) {
                    eb6Var.E = false;
                    eb6Var.p();
                }
            }
        });
        boolean z = true;
        fre.a("must call addApi() to add at least one API", !psVar2.isEmpty());
        gha ghaVar = gha.a;
        yn ynVar2 = n2d.b;
        if (psVar2.containsKey(ynVar2)) {
            ghaVar = (gha) psVar2.get(ynVar2);
        }
        ntb ntbVar = new ntb(hashSet, psVar, packageName, name, ghaVar);
        Map map = (Map) ntbVar.c;
        ps psVar3 = new ps(0);
        ps psVar4 = new ps(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ns) psVar2.keySet()).iterator();
        yn ynVar3 = null;
        while (true) {
            ms msVar = (ms) it;
            if (!msVar.hasNext()) {
                ntb ntbVar2 = ntbVar;
                ps psVar5 = psVar3;
                ps psVar6 = psVar4;
                ArrayList arrayList4 = arrayList3;
                ph5 ph5Var2 = ph5Var;
                Looper looper = mainLooper;
                if (ynVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = ynVar3.c;
                    if (!equals) {
                        sc8.j(tb4.y("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                        return ph5Var2;
                    }
                }
                m1d m1dVar = new m1d(context2, new ReentrantLock(), looper, ntbVar2, psVar5, arrayList, arrayList2, psVar6, m1d.f(psVar6.values(), true), arrayList4);
                Set set = gy4.a;
                synchronized (set) {
                    set.add(m1dVar);
                }
                ny4 ny4Var = new ny4();
                ny4Var.a = m1dVar;
                return ny4Var;
            }
            ph5 ph5Var3 = ph5Var;
            yn ynVar4 = (yn) msVar.next();
            Object obj2 = psVar2.get(ynVar4);
            boolean z2 = map.get(ynVar4) != null ? z : false;
            psVar3.put(ynVar4, Boolean.valueOf(z2));
            ps psVar7 = psVar4;
            Looper looper2 = mainLooper;
            h3d h3dVar = new h3d(ynVar4, z2);
            arrayList3.add(h3dVar);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            ntb ntbVar3 = ntbVar;
            ps psVar8 = psVar2;
            ps psVar9 = psVar3;
            xx4 a = ynVar4.a.a(context2, looper2, ntbVar3, obj2, h3dVar, h3dVar);
            psVar7.put(ynVar4.b, a);
            xx4 xx4Var = a;
            xx4Var.getClass();
            if (!(xx4Var instanceof z3d)) {
                ph5Var = ph5Var3;
                mainLooper = looper2;
                ntbVar = ntbVar3;
                psVar4 = psVar7;
                map = map2;
                psVar3 = psVar9;
                psVar2 = psVar8;
                arrayList3 = arrayList5;
                z = true;
            } else {
                if (ynVar3 != null) {
                    String str2 = ynVar4.c;
                    String str3 = ynVar3.c;
                    sc8.j(ls6.o(str2, " cannot be used with ", str3, new StringBuilder(str2.length() + 21 + str3.length())));
                    return ph5Var3;
                }
                mainLooper = looper2;
                ntbVar = ntbVar3;
                psVar4 = psVar7;
                ynVar3 = ynVar4;
                map = map2;
                psVar3 = psVar9;
                psVar2 = psVar8;
                arrayList3 = arrayList5;
                z = true;
                ph5Var = ph5Var3;
            }
        }
    }

    @Override // ibc
    public final void onError(lbc lbcVar, Exception exc) {
        d6b d6bVar = ((zi8) this.d).O;
        if (d6bVar != null) {
            d6bVar.run();
        }
    }

    @Override // ibc
    public final void onRenderedFirstFrame() {
        f4b f4bVar = (f4b) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        zi8 zi8Var = (zi8) this.d;
        n00 n00Var = zi8Var.I;
        if (n00Var != null && n00Var.g) {
            int i = zi8Var.f;
            int i2 = zi8Var.h;
            n00Var.d = true;
            n00Var.e = i;
            n00Var.f = i2;
            ur4 ur4Var = (ur4) n00Var.c;
            if (ur4Var != null) {
                ur4Var.a(Integer.valueOf(i), Integer.valueOf(n00Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable == null) {
            kac kacVar = zi8Var.n;
            if (kacVar != null) {
                if (n00Var == null || !n00Var.g) {
                    kacVar.animate().alpha(1.0f).setDuration(180L).withEndAction(new h18(this, f4bVar, (byte) 22)).start();
                    return;
                }
                return;
            }
            return;
        }
        zi8Var.post(runnable);
        runnableArr[0] = null;
        Bitmap bitmap = zi8Var.a;
        if (bitmap != null) {
            bitmap.recycle();
            if (f4bVar.M0 == zi8Var.a) {
                f4bVar.M0 = null;
            }
            zi8Var.a = null;
            zi8Var.invalidate();
        }
    }

    @Override // ibc
    public final void onStateChanged(boolean z, int i) {
        zi8 zi8Var = (zi8) this.d;
        lbc lbcVar = zi8Var.e;
        if (lbcVar == null) {
            return;
        }
        boolean c0 = lbcVar.c0();
        yi8 yi8Var = zi8Var.L;
        if (c0) {
            gl.c3(yi8Var);
        } else {
            gl.r(yi8Var);
        }
    }

    @Override // sq4
    public final void onSuccess(Object obj) {
        qu6 qu6Var = (qu6) obj;
        List list = (List) ((lw6) this.d).i.remove((mw6) this.b);
        if (((lw6) this.d).j.i() || qu6Var == null) {
            return;
        }
        mv6 mv6Var = ((lw6) this.d).g;
        su6 su6Var = (su6) this.c;
        mv6Var.g(su6Var.a, su6Var, qu6Var.a, qu6Var.b);
        tv6 tv6Var = ((lw6) this.d).j;
        su6 su6Var2 = (su6) this.c;
        if (!tv6Var.x || !tv6.j(su6Var2)) {
            tv6Var.e.getClass();
        }
        lw6 lw6Var = (lw6) this.d;
        c1 c1Var = lw6Var.m;
        su6 su6Var3 = (su6) this.c;
        long j = lw6Var.t;
        c1Var.removeMessages(1001, su6Var3);
        c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, su6Var3), j);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((kw6) it.next()).a((su6) this.c);
                } catch (RemoteException e) {
                    lad.g("MediaSessionLegacyStub", "Exception in " + ((su6) this.c), e);
                }
            }
        }
    }

    @Override // ibc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ibc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((zi8) this.d).h();
    }

    @Override // ibc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        zi8 zi8Var = (zi8) this.d;
        f4b f4bVar = (f4b) this.b;
        if (f4bVar != null) {
            e4b V = zi8Var.e.V(f4bVar.d1);
            f4bVar.d1 = V;
            kac kacVar = zi8Var.n;
            if (kacVar != null) {
                kacVar.setHDRInfo(V);
            }
        }
        int i4 = (int) (i * f);
        zi8Var.f = i4;
        int i5 = (int) (i2 * f);
        zi8Var.h = i5;
        if (f4bVar != null && (f4bVar.k0 != i4 || f4bVar.l0 != i5)) {
            f4bVar.k0 = i4;
            f4bVar.l0 = i5;
            f4bVar.z();
        }
        zi8Var.a();
        kac kacVar2 = zi8Var.n;
        if (kacVar2 != null) {
            int i6 = zi8Var.f;
            int i7 = zi8Var.h;
            kacVar2.d = i6;
            kacVar2.e = i7;
            td4 td4Var = kacVar2.b;
            if (td4Var != null) {
                td4Var.postRunnable(new qd4(td4Var, i6, i7, (byte) 0));
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

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void removeLocationUpdates(nh5 nh5Var) {
        ly4 ly4Var = (ly4) ((HashMap) this.d).remove(nh5Var);
        if (ly4Var != null) {
            u84 u84Var = (u84) this.b;
            u84Var.getClass();
            String simpleName = ly4.class.getSimpleName();
            fre.g(simpleName, "Listener type must not be empty");
            u84Var.c(new u56(ly4Var, simpleName), 2418).continueWith(wn3.c, ie7.e);
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public final synchronized void requestLocationUpdates(oh5 oh5Var, nh5 nh5Var) {
        ly4 ly4Var = (ly4) ((HashMap) this.d).remove(nh5Var);
        if (ly4Var != null) {
            u84 u84Var = (u84) this.b;
            u84Var.getClass();
            String simpleName = ly4.class.getSimpleName();
            fre.g(simpleName, "Listener type must not be empty");
            u84Var.c(new u56(ly4Var, simpleName), 2418).continueWith(wn3.c, ie7.e);
        }
        ly4 ly4Var2 = new ly4(nh5Var);
        ((HashMap) this.d).put(nh5Var, ly4Var2);
        ((u84) this.b).j(((oy4) oh5Var).a, ly4Var2, Looper.getMainLooper());
    }

    public final void s(Canvas canvas, RectF rectF, int i, float f) {
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

    public final ng5 t() {
        HttpsURLConnection httpsURLConnection;
        mv6.t();
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
                return new ng5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String toString() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((vl3) this.b).a + ":" + ((String) this.c);
            case 10:
                StringBuilder sb = new StringBuilder("id3v2tag[pos=");
                zy8 zy8Var = (zy8) this.b;
                sb.append(zy8Var.b);
                sb.append(", ");
                sb.append(zy8Var.e());
                sb.append(" left]");
                return sb.toString();
            case 13:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='" + ((String) this.c) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((nh2) this.d) + ')';
            case 21:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                xd7 xd7Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xd7 xd7Var2 = (xd7) obj;
                    if (xd7Var != null) {
                        sb2.append(",");
                    }
                    sb2.append(xd7Var2.toString());
                    xd7Var = xd7Var2;
                }
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                wk4 wk4Var = (wk4) this.b;
                String str = "";
                while (true) {
                    wk4Var = (wk4) wk4Var.c;
                    if (wk4Var == null) {
                        sb3.append('}');
                        return sb3.toString();
                    }
                    Object obj2 = wk4Var.b;
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

    public final String u() {
        String str = (String) this.c;
        int indexOf = str.indexOf(44);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public final eh5 v(fh5 fh5Var) {
        InputStream inputStream;
        int i = fh5Var.c;
        InputStream inputStream2 = (zy8) this.b;
        if (fh5Var.d) {
            z24 z24Var = (z24) this.d;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = ((a51) z24Var.b).read(bArr, i2, i - i2);
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
        if (fh5Var.f) {
            throw new ch5("Frame encryption is not supported");
        }
        if (fh5Var.e) {
            i = fh5Var.g;
            inputStream = new InflaterInputStream(inputStream2);
        } else {
            inputStream = inputStream2;
        }
        return new eh5(inputStream, fh5Var.b, i, (hh5) this.c, fh5Var);
    }

    public final ByteBuffer w() {
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

    public final Paint x(float f, int i) {
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

    public final int y(x9c x9cVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xd7 xd7Var = (xd7) obj;
            int i3 = xd7Var.d;
            ge7 ge7Var = xd7Var.a;
            int a = ge7Var.a(x9cVar);
            int i4 = a + 4;
            int ordinal = ge7Var.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i4 = ((i3 / 2) * 11) + i4 + (i3 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i4 += xd7Var.a() << 3;
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
    public final boolean z() {
        dk5 dk5Var;
        if (((z24) this.d).y("gcm.n.noui")) {
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
        String R = ((z24) this.d).R("gcm.n.image");
        if (!TextUtils.isEmpty(R)) {
            try {
                dk5Var = new dk5(new URL(R));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + R);
            }
            if (dk5Var != null) {
                ExecutorService executorService = (ExecutorService) this.b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                dk5Var.b = executorService.submit(new hb5(dk5Var, taskCompletionSource, (byte) 5));
                dk5Var.c = taskCompletionSource.getTask();
            }
            tg2 a = mm2.a((FirebaseMessagingService) this.c, (z24) this.d);
            xk7 xk7Var = (xk7) a.b;
            if (dk5Var != null) {
                try {
                    Task task = dk5Var.c;
                    fre.h(task);
                    Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    xk7Var.g(bitmap);
                    rk7 rk7Var = new rk7();
                    rk7Var.e = bitmap == null ? null : IconCompat.c(bitmap);
                    rk7Var.f = null;
                    rk7Var.g = true;
                    xk7Var.i(rk7Var);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    dk5Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    dk5Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a.c, 0, ((xk7) a.b).b());
            return true;
        }
        dk5Var = null;
        if (dk5Var != null) {
        }
        tg2 a2 = mm2.a((FirebaseMessagingService) this.c, (z24) this.d);
        xk7 xk7Var2 = (xk7) a2.b;
        if (dk5Var != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) a2.c, 0, ((xk7) a2.b).b());
        return true;
    }

    @Override // x79
    public final void g() {
    }

    @Override // fo5
    public final void h() {
    }

    @Override // x79
    public final void j() {
    }

    @Override // fo5
    public final void n() {
    }

    @Override // f48
    public final void r() {
    }

    @Override // ibc
    public final void onSeekFinished(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekStarted(tj tjVar) {
    }

    @Override // ibc
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    public /* synthetic */ xl3(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xl3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    public /* synthetic */ xl3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public xl3(byte b) {
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
                this.d = nh2.a;
                break;
            default:
                this.b = new pc0();
                this.c = null;
                this.d = null;
                break;
        }
    }

    public xl3(InputStream inputStream, long j, int i, hh5 hh5Var) {
        this.a = (byte) 10;
        zy8 zy8Var = new zy8(inputStream, j, i);
        this.b = zy8Var;
        this.d = new z24((Object) zy8Var, (byte) 9);
        this.c = hh5Var;
    }

    public xl3(String str, HashMap hashMap) {
        this.a = (byte) 9;
        this.c = str;
        this.b = hashMap;
        this.d = new HashMap();
    }

    public xl3(String str, wa9[] wa9VarArr) {
        this.a = (byte) 27;
        System.currentTimeMillis();
        this.c = str;
        this.b = wa9VarArr;
        this.d = null;
    }

    public xl3(FirebaseMessagingService firebaseMessagingService, z24 z24Var, ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = z24Var;
    }

    public xl3(Runnable runnable) {
        this.a = (byte) 18;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public xl3(String str, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                em4 em4Var = new em4();
                em4Var.r = ud7.n("video/mp2t");
                em4Var.s = ud7.n(str);
                this.b = new fm4(em4Var);
                break;
            default:
                wk4 wk4Var = new wk4((byte) 12);
                this.b = wk4Var;
                this.d = wk4Var;
                this.c = str;
                break;
        }
    }

    public xl3(Signature signature) {
        this.a = (byte) 2;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public xl3(Cipher cipher) {
        this.a = (byte) 2;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public xl3(Mac mac) {
        this.a = (byte) 2;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public /* synthetic */ xl3(byte b, boolean z) {
        this.a = b;
    }

    public xl3(lw6 lw6Var, mw6 mw6Var, iw6 iw6Var, su6 su6Var) {
        this.a = (byte) 17;
        this.d = lw6Var;
        this.b = mw6Var;
        this.c = su6Var;
    }
}
