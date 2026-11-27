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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sa implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sa(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        tic ticVar;
        id idVar;
        int[] iArr;
        byte b = 3;
        switch (this.a) {
            case 0:
                hl.c3(new ds6(this.c, obj, this.b, (byte) 4));
                break;
            case 1:
                nh1 nh1Var = (nh1) this.c;
                boolean z = this.b;
                View view = (View) obj;
                mh1 mh1Var = (mh1) view;
                nh1Var.b.getClass();
                r4 = RecyclerView.S(view) == nh1Var.e;
                mh1Var.s = r4;
                if (!z) {
                    mh1Var.w.f(r4, true);
                }
                mh1Var.invalidate();
                break;
            case 2:
                zu1 zu1Var = (zu1) this.c;
                boolean z2 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof wb2) {
                    wb2 wb2Var = (wb2) view2;
                    if (wb2Var.W6 && wb2Var.Y6) {
                        r4 = true;
                    }
                    if (r4 != z2 && zu1Var.e8()) {
                        wb2Var.W6 = z2;
                        wb2Var.Y6 = zu1Var.e8();
                        wb2Var.F6 = true;
                        wb2Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof dl1) {
                    ((dl1) view2).f0 = z2;
                    break;
                }
                break;
            case 3:
                View view3 = (View) this.c;
                boolean z3 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((wkb) view3).setChecked(!z3);
                    break;
                }
                break;
            case 4:
                o68 o68Var = (o68) this.c;
                boolean z4 = this.b;
                t58 t58Var = o68Var.M0;
                x53 x53Var = o68Var.l0;
                new d31(t58Var, x53Var).o(z4 ? c31.h : c31.e, x53Var).j();
                break;
            case 5:
                cr8 cr8Var = (cr8) this.c;
                boolean z5 = this.b;
                ProfileActivity profileActivity = cr8Var.b;
                if (profileActivity.getParentActivity() != null) {
                    d31.b0(profileActivity).o(z5 ? c31.h : c31.e, null).j();
                    break;
                }
                break;
            case 6:
                woa woaVar = (woa) this.c;
                Integer num = (Integer) obj;
                if (this.b) {
                    d31.b0(woaVar).Q(R.raw.ic_delete, 36, ob6.G(num.intValue(), "SpeechToTextTranscriptionsDeleted", new Object[0])).j();
                    break;
                }
                break;
            case 7:
                jxa jxaVar = (jxa) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    r7a.B(jxaVar.a).g(new ArrayList(hashSet));
                    break;
                }
                break;
            case 8:
                uic uicVar = (uic) this.c;
                boolean z6 = this.b;
                View view4 = (View) obj;
                uicVar.w.getClass();
                int S = RecyclerView.S(view4);
                if (view4 instanceof sic) {
                    sic sicVar = (sic) view4;
                    if (z6 && (ticVar = uicVar.E) != null && ticVar.A(S)) {
                        r4 = true;
                    }
                    sicVar.setReordering(r4);
                    break;
                }
                break;
            case 9:
                pcc pccVar = (pcc) this.c;
                boolean z7 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    pccVar.a(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = hl.W(a.b);
                    }
                    if (activity == null || activity.isFinishing()) {
                        pccVar.a(null);
                        break;
                    } else {
                        if (z7) {
                            idVar = new id(3, new x53(), activity);
                            idVar.q(200L);
                        } else {
                            idVar = null;
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        e52 e52Var = new e52(z7, (Object) idVar, (Object) pccVar, (byte) 5);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (wwc.b == null || !TextUtils.equals(wwc.a, str)) {
                            int[] iArr2 = new int[1];
                            uc7 s1 = uc7.s1(yac.t0);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                            String str2 = s1.k4.C2.f;
                            Object c2 = s1.c2(str2);
                            TLRPC.User[] userArr = {c2 instanceof TLRPC.User ? (TLRPC.User) c2 : null};
                            twc twcVar = new twc(s1, userArr, latitude, longitude, iArr2, connectionsManager, e52Var, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new in0((Object) iArr2, (Object) s1, (Object) userArr, (Object) twcVar, (Object) e52Var, (byte) 19));
                            } else {
                                iArr = iArr2;
                                twcVar.run();
                            }
                            r3 = new vlc(iArr, connectionsManager, (byte) 28);
                        } else {
                            e52Var.a(wwc.b);
                        }
                        if (z7 && r3 != null) {
                            idVar.setOnCancelListener(new cs0(r3, (byte) 13));
                            break;
                        }
                    }
                }
                break;
            case 10:
                sa saVar = (sa) this.c;
                boolean z8 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    saVar.a(null);
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
                                            int i = aob.L5;
                                            alertDialog$Builder.l(R.raw.permission_request_location, 72, aob.w0(null, i, false), null);
                                            alertDialog$Builder.m(i, null);
                                            alertDialog$Builder.a.U = ob6.M0(2131749301, null);
                                            alertDialog$Builder.j(ob6.M0(2131751125, null), new qg(context, b));
                                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                    }
                                } else {
                                    try {
                                        final pcc[] pccVarArr = {saVar};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: uwc
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                pcc[] pccVarArr2 = pccVarArr;
                                                pcc pccVar2 = pccVarArr2[0];
                                                if (pccVar2 != null) {
                                                    pccVar2.a(location3);
                                                    pccVarArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
                                        saVar.a(null);
                                        return;
                                    }
                                }
                            }
                            saVar.a(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    saVar.a(location2);
                }
            default:
                ixc ixcVar = (ixc) this.c;
                ixcVar.getMessagesController().m((String) obj, this.b);
                ixcVar.a.g3.O(true);
                break;
        }
    }
}
