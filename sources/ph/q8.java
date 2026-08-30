package ph;

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
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.c2, g91, Utilities.CallbackVoidReturn, v61, n7, s6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ q8(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        da daVar = this.b;
        daVar.V = i10;
        daVar.W = defaultWindowInsets.b;
        daVar.X = defaultWindowInsets.c;
        daVar.Y = defaultWindowInsets.d;
        daVar.n.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.g91
    public void a(float f10) {
        da daVar = this.b;
        i9 i9Var = daVar.y0;
        if (i9Var != null) {
            daVar.Q1 = f10;
            i9Var.setZoom(f10);
        }
        daVar.j0(true);
    }

    @Override // org.telegram.ui.Components.v61
    public void b(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        da daVar = this.b;
        if (vzVar == null) {
            daVar.getClass();
            return;
        }
        u6 u6Var = daVar.H1;
        if (u6Var == null || (savedFilterState = u6Var.a1) == null) {
            return;
        }
        vzVar.f(new wz(savedFilterState));
    }

    @Override // ph.s6
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.H1.L.getAbsolutePath(), options);
    }

    @Override // ph.n7
    public void e(final d8 d8Var, final boolean z4, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i10, f6 f6Var, final org.telegram.ui.web.o0 o0Var) {
        switch (this.a) {
            case 10:
                ArrayList arrayList = d8Var.b;
                da daVar = this.b;
                if (daVar.H1 != null) {
                    daVar.U0.x(5, true);
                    daVar.H1.E0 = d8Var;
                    int i11 = daVar.c;
                    int i12 = g8.a;
                    SerializedData serializedData = new SerializedData(true);
                    g8.c(serializedData, d8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    g8.c(serializedData2, d8Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    u6 u6Var = daVar.H1;
                    u6Var.G0 = z11;
                    u6Var.H0 = z10;
                    u6Var.F0.clear();
                    daVar.H1.F0.addAll(arrayList);
                    u6 u6Var2 = daVar.H1;
                    u6Var2.l = true;
                    u6Var2.v0 = inputPeer;
                    ArrayList arrayList2 = daVar.E1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            u6 u6Var3 = (u6) obj;
                            u6Var3.E0 = d8Var;
                            ArrayList arrayList3 = u6Var3.F0;
                            u6Var3.G0 = z11;
                            u6Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            u6Var3.l = true;
                            u6Var3.v0 = inputPeer;
                        }
                    }
                    daVar.i(new n8(daVar, f6Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final da daVar2 = this.b;
                ge0.d(i14, i15, strArr, new Utilities.Callback() { // from class: ph.o8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj2) {
                        final da daVar3 = da.this;
                        int i16 = daVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final org.telegram.ui.web.o0 o0Var2 = o0Var;
                        if (!booleanValue) {
                            o0Var2.run();
                            return;
                        }
                        i9 i9Var = daVar3.y0;
                        final boolean z13 = i9Var == null || i9Var.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z10;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(d8Var.b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z14 = z12;
                        tL_startLive.rtmp_stream = z14;
                        tL_startLive.messages_enabled = Boolean.valueOf(z4);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() { // from class: ph.p8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new lh.i6(da.this, tLObject, tL_startLive, z14, clientUserId, z13, tL_error, o0Var2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                da daVar = this.b;
                daVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar.b.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                da daVar2 = this.b;
                daVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar2.b.startActivity(intent2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                da daVar3 = this.b;
                daVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar3.b.startActivity(intent3);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            case 5:
                da daVar4 = this.b;
                daVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    daVar4.b.startActivity(intent4);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                da daVar5 = this.b;
                int i11 = daVar5.c;
                u6 u6Var = daVar5.H1;
                if (u6Var != null) {
                    u6Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    daVar5.S1 = !daVar5.H1.c;
                    daVar5.i(null);
                    daVar5.l();
                    daVar5.m();
                    daVar5.y();
                    u6 u6Var2 = daVar5.H1;
                    u6Var2.i(true);
                    u6Var2.C0 = daVar5.Z0.getText();
                    daVar5.H1 = null;
                    daVar5.W(u6Var2, true);
                    t0 t0Var = MessagesController.getInstance(i11).getStoriesController().w;
                    if (u6Var2.c) {
                        t0Var.d(u6Var2);
                    } else {
                        ArrayList arrayList = t0Var.b;
                        if (!u6Var2.u) {
                            t0Var.e(u6Var2);
                            u6Var2.b = Utilities.random.nextLong();
                            s0 s0Var = new s0(u6Var2);
                            arrayList.remove(u6Var2);
                            arrayList.add(0, u6Var2);
                            t0Var.a(s0Var);
                        }
                    }
                    daVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                da daVar6 = this.b;
                u6 u6Var3 = daVar6.H1;
                if (u6Var3 != null && !u6Var3.g && ((!u6Var3.n || u6Var3.u) && u6Var3.c)) {
                    MessagesController.getInstance(daVar6.c).getStoriesController().w.c(daVar6.H1);
                    daVar6.H1 = null;
                }
                u6 u6Var4 = daVar6.H1;
                if (u6Var4 != null && (u6Var4.o || u6Var4.g || (u6Var4.n && !u6Var4.u))) {
                    daVar6.q(true);
                    break;
                } else {
                    daVar6.K(0, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        da daVar = this.b;
        String C = daVar.C();
        if (TextUtils.equals(C, daVar.F())) {
            C = null;
        }
        daVar.e0(daVar.c0 == 0 ? C : null);
        h91 h91Var = daVar.S0;
        if (h91Var != null) {
            daVar.Q1 = 0.0f;
            h91Var.b(0.0f, false);
        }
        daVar.m0(true);
    }

    @Override // org.telegram.messenger.Utilities.CallbackVoidReturn
    public Object run() {
        s9 s9Var;
        da daVar = this.b;
        nf0 nf0Var = daVar.y1;
        Bitmap uiBlurBitmap = nf0Var != null ? nf0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (s9Var = daVar.U0) == null || s9Var.getTextureView() == null) ? uiBlurBitmap : daVar.U0.getTextureView().getUiBlurBitmap();
    }
}
