// default package

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        uec uecVar;
        hd hdVar;
        int[] iArr;
        byte b = 3;
        switch (this.a) {
            case 0:
                gl.c3(new mn6(this.c, obj, this.b, (byte) 4));
                break;
            case 1:
                eh1 eh1Var = (eh1) this.c;
                boolean z = this.b;
                View view = (View) obj;
                dh1 dh1Var = (dh1) view;
                eh1Var.b.getClass();
                r4 = RecyclerView.R(view) == eh1Var.e;
                dh1Var.s = r4;
                if (!z) {
                    dh1Var.w.f(r4, true);
                }
                dh1Var.invalidate();
                break;
            case 2:
                mu1 mu1Var = (mu1) this.c;
                boolean z2 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof gb2) {
                    gb2 gb2Var = (gb2) view2;
                    if (gb2Var.W6 && gb2Var.Y6) {
                        r4 = true;
                    }
                    if (r4 != z2 && mu1Var.V7()) {
                        gb2Var.W6 = z2;
                        gb2Var.Y6 = mu1Var.V7();
                        gb2Var.F6 = true;
                        gb2Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof uk1) {
                    ((uk1) view2).f0 = z2;
                    break;
                }
                break;
            case 3:
                View view3 = (View) this.c;
                boolean z3 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((ahb) view3).setChecked(!z3);
                    break;
                }
                break;
            case 4:
                y28 y28Var = (y28) this.c;
                boolean z4 = this.b;
                d28 d28Var = y28Var.S0;
                f53 f53Var = y28Var.r0;
                new u21(d28Var, f53Var).o(z4 ? t21.h : t21.e, f53Var).j();
                break;
            case 5:
                rn8 rn8Var = (rn8) this.c;
                boolean z5 = this.b;
                ProfileActivity profileActivity = rn8Var.b;
                if (profileActivity.getParentActivity() != null) {
                    u21.b0(profileActivity).o(z5 ? t21.h : t21.e, null).j();
                    break;
                }
                break;
            case 6:
                zka zkaVar = (zka) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    u21.b0(zkaVar).Q(R.raw.ic_delete, 36, k96.G(num.intValue(), "SpeechToTextTranscriptionsDeleted", new Object[0])).j();
                    break;
                }
                break;
            case 7:
                gta gtaVar = (gta) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    z3a.B(gtaVar.a).g(new ArrayList(hashSet));
                    break;
                }
                break;
            case 8:
                vec vecVar = (vec) this.c;
                boolean z6 = this.b;
                View view4 = (View) obj;
                vecVar.w.getClass();
                int R = RecyclerView.R(view4);
                if (view4 instanceof tec) {
                    tec tecVar = (tec) view4;
                    if (z6 && (uecVar = vecVar.E) != null && uecVar.B(R)) {
                        r4 = true;
                    }
                    tecVar.setReordering(r4);
                    break;
                }
                break;
            case 9:
                p8c p8cVar = (p8c) this.c;
                boolean z7 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    p8cVar.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = gl.W(a.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        p8cVar.a(null);
                        break;
                    } else {
                        if (z7) {
                            hdVar = new hd(3, new f53(), activity);
                            hdVar.q(200L);
                        } else {
                            hdVar = null;
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        o42 o42Var = new o42(z7, (Object) hdVar, (Object) p8cVar, (byte) 5);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (gsc.b == null || !TextUtils.equals(gsc.a, str)) {
                            int[] iArr2 = new int[1];
                            na7 q1 = na7.q1(y6c.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                            String str2 = q1.k4.u2.f;
                            Object a2 = q1.a2(str2);
                            TLRPC.User[] userArr = {a2 instanceof TLRPC.User ? (TLRPC.User) a2 : null};
                            dsc dscVar = new dsc(q1, userArr, latitude, longitude, iArr2, connectionsManager, o42Var, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new fn0((Object) iArr2, (Object) q1, (Object) userArr, (Object) dscVar, (Object) o42Var, (byte) 19));
                            } else {
                                iArr = iArr2;
                                dscVar.run();
                            }
                            r3 = new mhc(iArr, connectionsManager, (byte) 29);
                        } else {
                            o42Var.a(gsc.b);
                        }
                        if (z7 && r3 != null) {
                            hdVar.setOnCancelListener(new ur0(r3, (byte) 13));
                            break;
                        }
                    }
                }
                break;
            case 10:
                ra raVar = (ra) this.c;
                boolean z8 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    raVar.a(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z8) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.H1;
                                    if (context == null) {
                                        context = a.b;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            int i = bkb.K5;
                                            alertDialog$Builder.l(R.raw.permission_request_location, 72, bkb.w0(null, i, false), null);
                                            alertDialog$Builder.m(i, null);
                                            alertDialog$Builder.a.U = k96.M0(2131749355, null);
                                            alertDialog$Builder.j(k96.M0(2131751148, null), new od(context, b));
                                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final p8c[] p8cVarArr = {raVar};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: esc
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                p8c[] p8cVarArr2 = p8cVarArr;
                                                p8c p8cVar2 = p8cVarArr2[0];
                                                if (p8cVar2 != null) {
                                                    p8cVar2.a(location3);
                                                    p8cVarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                        raVar.a(null);
                                        return;
                                    }
                                }
                            }
                            raVar.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    raVar.a(location2);
                }
            default:
                tsc tscVar = (tsc) this.c;
                tscVar.getMessagesController().m((String) obj, this.b);
                tscVar.a.g3.O(true);
                break;
        }
    }
}
