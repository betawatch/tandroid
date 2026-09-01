package qh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, h91, Utilities.CallbackVoidReturn, x61, l7, q6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ o8(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        ca caVar = this.b;
        caVar.V = i10;
        caVar.W = defaultWindowInsets.b;
        caVar.X = defaultWindowInsets.c;
        caVar.Y = defaultWindowInsets.d;
        caVar.n.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.h91
    public void a(float f10) {
        ca caVar = this.b;
        g9 g9Var = caVar.y0;
        if (g9Var != null) {
            caVar.Q1 = f10;
            g9Var.setZoom(f10);
        }
        caVar.j0(true);
    }

    @Override // org.telegram.ui.Components.x61
    public void b(xz xzVar) {
        MediaController.SavedFilterState savedFilterState;
        ca caVar = this.b;
        if (xzVar == null) {
            caVar.getClass();
            return;
        }
        s6 s6Var = caVar.H1;
        if (s6Var == null || (savedFilterState = s6Var.a1) == null) {
            return;
        }
        xzVar.f(new yz(savedFilterState));
    }

    @Override // qh.q6
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.H1.L.getAbsolutePath(), options);
    }

    @Override // qh.l7
    public void e(final b8 b8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, d6 d6Var, final org.telegram.ui.web.s0 s0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = b8Var.b;
                ca caVar = this.b;
                if (caVar.H1 != null) {
                    caVar.U0.x(5, true);
                    caVar.H1.E0 = b8Var;
                    int i11 = caVar.c;
                    int i12 = f8.a;
                    SerializedData serializedData = new SerializedData(true);
                    f8.c(serializedData, b8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    f8.c(serializedData2, b8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    s6 s6Var = caVar.H1;
                    s6Var.G0 = z11;
                    s6Var.H0 = z10;
                    s6Var.F0.clear();
                    caVar.H1.F0.addAll(arrayList);
                    s6 s6Var2 = caVar.H1;
                    s6Var2.l = true;
                    s6Var2.v0 = inputPeer;
                    ArrayList arrayList2 = caVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            s6 s6Var3 = (s6) obj;
                            s6Var3.E0 = b8Var;
                            ArrayList arrayList3 = s6Var3.F0;
                            s6Var3.G0 = z11;
                            s6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            s6Var3.l = true;
                            s6Var3.v0 = inputPeer;
                        }
                    }
                    caVar.i(new l8(caVar, d6Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ca caVar2 = this.b;
                ie0.d(i14, i15, strArr, new Utilities.Callback() { // from class: qh.m8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final ca caVar3 = ca.this;
                        int i16 = caVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.s0 s0Var2 = s0Var;
                        if (!booleanValue) {
                            s0Var2.run();
                            return;
                        }
                        g9 g9Var = caVar3.y0;
                        final boolean z13 = g9Var == null || g9Var.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z10;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(b8Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: qh.n8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new mh.i6(ca.this, tLObject, tL_startLive, z14, clientUserId, z13, tL_error, s0Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                ca caVar = this.b;
                caVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar.b.startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 3:
                ca caVar2 = this.b;
                caVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ca caVar3 = this.b;
                caVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            case 5:
                ca caVar4 = this.b;
                caVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    caVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                ca caVar5 = this.b;
                int i11 = caVar5.c;
                s6 s6Var = caVar5.H1;
                if (s6Var != null) {
                    s6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    caVar5.S1 = !caVar5.H1.c;
                    caVar5.i(null);
                    caVar5.l();
                    caVar5.m();
                    caVar5.y();
                    s6 s6Var2 = caVar5.H1;
                    s6Var2.i(true);
                    s6Var2.C0 = caVar5.Z0.getText();
                    caVar5.H1 = null;
                    caVar5.W(s6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (s6Var2.c) {
                        t0Var.d(s6Var2);
                    } else {
                        ArrayList arrayList = t0Var.b;
                        if (!s6Var2.u) {
                            t0Var.e(s6Var2);
                            s6Var2.b = Utilities.random.nextLong();
                            s0 s0Var = new s0(s6Var2);
                            arrayList.remove(s6Var2);
                            arrayList.add(0, s6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    caVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                ca caVar6 = this.b;
                s6 s6Var3 = caVar6.H1;
                if (s6Var3 != null && !s6Var3.g && ((!s6Var3.n || s6Var3.u) && s6Var3.c)) {
                    MessagesController.getInstance(caVar6.c).getStoriesController().w.c(caVar6.H1);
                    caVar6.H1 = null;
                }
                s6 s6Var4 = caVar6.H1;
                if (s6Var4 != null && (s6Var4.o || s6Var4.g || (s6Var4.n && !s6Var4.u))) {
                    caVar6.q(true);
                    break;
                } else {
                    caVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ca caVar = this.b;
        String C = caVar.C();
        if (TextUtils.equals(C, caVar.F())) {
            C = null;
        }
        caVar.e0(caVar.c0 == 0 ? C : null);
        i91 i91Var = caVar.S0;
        if (i91Var != null) {
            caVar.Q1 = 0.0f;
            i91Var.b(0.0f, false);
        }
        caVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        q9 q9Var;
        ca caVar = this.b;
        pf0 pf0Var = caVar.y1;
        Bitmap uiBlurBitmap = pf0Var != null ? pf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (q9Var = caVar.U0) == null || q9Var.getTextureView() == null) ? uiBlurBitmap : caVar.U0.getTextureView().getUiBlurBitmap();
    }
}
