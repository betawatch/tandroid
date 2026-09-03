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
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, g91, Utilities.CallbackVoidReturn, w61, k7, p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ n8(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        ba baVar = this.b;
        baVar.V = i10;
        baVar.W = defaultWindowInsets.b;
        baVar.X = defaultWindowInsets.c;
        baVar.Y = defaultWindowInsets.d;
        baVar.n.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.g91
    public void a(float f10) {
        ba baVar = this.b;
        f9 f9Var = baVar.y0;
        if (f9Var != null) {
            baVar.Q1 = f10;
            f9Var.setZoom(f10);
        }
        baVar.j0(true);
    }

    @Override // org.telegram.ui.Components.w61
    public void b(xz xzVar) {
        MediaController.SavedFilterState savedFilterState;
        ba baVar = this.b;
        if (xzVar == null) {
            baVar.getClass();
            return;
        }
        r6 r6Var = baVar.H1;
        if (r6Var == null || (savedFilterState = r6Var.a1) == null) {
            return;
        }
        xzVar.f(new yz(savedFilterState));
    }

    @Override // qh.p6
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.H1.L.getAbsolutePath(), options);
    }

    @Override // qh.k7
    public void e(final a8 a8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, l6 l6Var, final org.telegram.ui.web.s0 s0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = a8Var.b;
                ba baVar = this.b;
                if (baVar.H1 != null) {
                    baVar.U0.x(5, true);
                    baVar.H1.E0 = a8Var;
                    int i11 = baVar.c;
                    int i12 = e8.a;
                    SerializedData serializedData = new SerializedData(true);
                    e8.c(serializedData, a8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    e8.c(serializedData2, a8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    r6 r6Var = baVar.H1;
                    r6Var.G0 = z11;
                    r6Var.H0 = z10;
                    r6Var.F0.clear();
                    baVar.H1.F0.addAll(arrayList);
                    r6 r6Var2 = baVar.H1;
                    r6Var2.l = true;
                    r6Var2.v0 = inputPeer;
                    ArrayList arrayList2 = baVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            r6 r6Var3 = (r6) obj;
                            r6Var3.E0 = a8Var;
                            ArrayList arrayList3 = r6Var3.F0;
                            r6Var3.G0 = z11;
                            r6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            r6Var3.l = true;
                            r6Var3.v0 = inputPeer;
                        }
                    }
                    baVar.i(new k8(baVar, l6Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ba baVar2 = this.b;
                ie0.d(i14, i15, strArr, new Utilities.Callback() { // from class: qh.l8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final ba baVar3 = ba.this;
                        int i16 = baVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.s0 s0Var2 = s0Var;
                        if (!booleanValue) {
                            s0Var2.run();
                            return;
                        }
                        f9 f9Var = baVar3.y0;
                        final boolean z13 = f9Var == null || f9Var.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z10;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(a8Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: qh.m8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new mh.i6(ba.this, tLObject, tL_startLive, z14, clientUserId, z13, tL_error, s0Var2));
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
                ba baVar = this.b;
                baVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar.b.startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 3:
                ba baVar2 = this.b;
                baVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ba baVar3 = this.b;
                baVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            case 5:
                ba baVar4 = this.b;
                baVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    baVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                ba baVar5 = this.b;
                int i11 = baVar5.c;
                r6 r6Var = baVar5.H1;
                if (r6Var != null) {
                    r6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    baVar5.S1 = !baVar5.H1.c;
                    baVar5.i(null);
                    baVar5.l();
                    baVar5.m();
                    baVar5.y();
                    r6 r6Var2 = baVar5.H1;
                    r6Var2.i(true);
                    r6Var2.C0 = baVar5.Z0.getText();
                    baVar5.H1 = null;
                    baVar5.W(r6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (r6Var2.c) {
                        t0Var.d(r6Var2);
                    } else {
                        ArrayList arrayList = t0Var.b;
                        if (!r6Var2.u) {
                            t0Var.e(r6Var2);
                            r6Var2.b = Utilities.random.nextLong();
                            s0 s0Var = new s0(r6Var2);
                            arrayList.remove(r6Var2);
                            arrayList.add(0, r6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    baVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                ba baVar6 = this.b;
                r6 r6Var3 = baVar6.H1;
                if (r6Var3 != null && !r6Var3.g && ((!r6Var3.n || r6Var3.u) && r6Var3.c)) {
                    MessagesController.getInstance(baVar6.c).getStoriesController().w.c(baVar6.H1);
                    baVar6.H1 = null;
                }
                r6 r6Var4 = baVar6.H1;
                if (r6Var4 != null && (r6Var4.o || r6Var4.g || (r6Var4.n && !r6Var4.u))) {
                    baVar6.q(true);
                    break;
                } else {
                    baVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        ba baVar = this.b;
        String C = baVar.C();
        if (TextUtils.equals(C, baVar.F())) {
            C = null;
        }
        baVar.e0(baVar.c0 == 0 ? C : null);
        h91 h91Var = baVar.S0;
        if (h91Var != null) {
            baVar.Q1 = 0.0f;
            h91Var.b(0.0f, false);
        }
        baVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        p9 p9Var;
        ba baVar = this.b;
        pf0 pf0Var = baVar.y1;
        Bitmap uiBlurBitmap = pf0Var != null ? pf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (p9Var = baVar.U0) == null || p9Var.getTextureView() == null) ? uiBlurBitmap : baVar.U0.getTextureView().getUiBlurBitmap();
    }
}
