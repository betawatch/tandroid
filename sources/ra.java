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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ra implements qac {
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
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        ugc ugcVar;
        he heVar;
        int[] iArr;
        byte b = 3;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                gm.c3(new np6(this.c, obj, this.b, (byte) 4));
                break;
            case 1:
                mi1 mi1Var = (mi1) this.c;
                boolean z = this.b;
                View view = (View) obj;
                li1 li1Var = (li1) view;
                mi1Var.b.getClass();
                r4 = RecyclerView.R(view) == mi1Var.e;
                li1Var.s = r4;
                if (!z) {
                    li1Var.w.f(r4, true);
                }
                li1Var.invalidate();
                break;
            case 2:
                yv1 yv1Var = (yv1) this.c;
                boolean z2 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof rc2) {
                    rc2 rc2Var = (rc2) view2;
                    if (rc2Var.W6 && rc2Var.Y6) {
                        r4 = true;
                    }
                    if (r4 != z2 && yv1Var.e8()) {
                        rc2Var.W6 = z2;
                        rc2Var.Y6 = yv1Var.e8();
                        rc2Var.F6 = true;
                        rc2Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof cm1) {
                    ((cm1) view2).f0 = z2;
                    break;
                }
                break;
            case 3:
                View view3 = (View) this.c;
                boolean z3 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((bjb) view3).setChecked(!z3);
                    break;
                }
                break;
            case 4:
                a58 a58Var = (a58) this.c;
                boolean z4 = this.b;
                g48 g48Var = a58Var.S0;
                r63 r63Var = a58Var.r0;
                new c41(g48Var, r63Var).o(z4 ? b41.h : b41.e, r63Var).j();
                break;
            case 5:
                sp8 sp8Var = (sp8) this.c;
                boolean z5 = this.b;
                ProfileActivity profileActivity = sp8Var.b;
                if (profileActivity.getParentActivity() != null) {
                    c41.b0(profileActivity).o(z5 ? b41.h : b41.e, null).j();
                    break;
                }
                break;
            case 6:
                ana anaVar = (ana) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    c41.b0(anaVar).Q(R.raw.ic_delete, 36, jb6.G(num.intValue(), "SpeechToTextTranscriptionsDeleted", new Object[0])).j();
                    break;
                }
                break;
            case 7:
                jva jvaVar = (jva) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    a6a.B(jvaVar.a).g(new ArrayList(hashSet));
                    break;
                }
                break;
            case 8:
                vgc vgcVar = (vgc) this.c;
                boolean z6 = this.b;
                View view4 = (View) obj;
                vgcVar.w.getClass();
                int R = RecyclerView.R(view4);
                if (view4 instanceof tgc) {
                    tgc tgcVar = (tgc) view4;
                    if (z6 && (ugcVar = vgcVar.E) != null && ugcVar.D(R)) {
                        r4 = true;
                    }
                    tgcVar.setReordering(r4);
                    break;
                }
                break;
            case 9:
                qac qacVar = (qac) this.c;
                boolean z7 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    qacVar.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = gm.W(a.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        qacVar.a(null);
                        break;
                    } else {
                        if (z7) {
                            heVar = new he(3, new r63(), activity);
                            heVar.q(200L);
                        } else {
                            heVar = null;
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        z52 z52Var = new z52(z7, (Object) heVar, (Object) qacVar, (byte) 5);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (juc.b == null || !TextUtils.equals(juc.a, str)) {
                            int[] iArr2 = new int[1];
                            oc7 r1 = oc7.r1(z8c.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
                            String str2 = r1.l4.u2.f;
                            Object b22 = r1.b2(str2);
                            TLRPC.User[] userArr = {b22 instanceof TLRPC.User ? (TLRPC.User) b22 : null};
                            guc gucVar = new guc(r1, userArr, latitude, longitude, iArr2, connectionsManager, z52Var, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new fo0((Object) iArr2, (Object) r1, (Object) userArr, (Object) gucVar, (Object) z52Var, (byte) 19));
                            } else {
                                iArr = iArr2;
                                gucVar.run();
                            }
                            r3 = new ptc(iArr, connectionsManager, b2);
                        } else {
                            z52Var.a(juc.b);
                        }
                        if (z7 && r3 != null) {
                            heVar.setOnCancelListener(new ct0(r3, (byte) 13));
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
                                            int i = cmb.K5;
                                            alertDialog$Builder.l(R.raw.permission_request_location, 72, cmb.w0(null, i, false), null);
                                            alertDialog$Builder.m(i, null);
                                            alertDialog$Builder.a.U = jb6.M0(2131749304, null);
                                            alertDialog$Builder.j(jb6.M0(2131751097, null), new oe(context, b));
                                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final qac[] qacVarArr = {raVar};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: huc
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                qac[] qacVarArr2 = qacVarArr;
                                                qac qacVar2 = qacVarArr2[0];
                                                if (qacVar2 != null) {
                                                    qacVar2.a(location3);
                                                    qacVarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
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
                uuc uucVar = (uuc) this.c;
                uucVar.getMessagesController().m((String) obj, this.b);
                uucVar.a.g3.O(true);
                break;
        }
    }
}
