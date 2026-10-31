package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.l9;
import org.telegram.messenger.p20;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.tc1;
import ph.q3;
import rh.d6;
import rh.e4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements u1, p20, l9, q3.g, androidx.car.app.utils.c, r9.e, qa.a, r9.d, Vector.TLDeserializer, x6, y6 {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration g(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info j(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        ra.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.p20
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        switch (this.a) {
        }
        return Boolean.FALSE;
    }

    @Override // r9.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.y6
    public void d(int i10, View view) {
        ((d6) view).setColor(i10);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.ActionBar.x6
    public int f(View view) {
        return ((d6) view).y;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 6:
                x1Var.dismiss();
                break;
            case 7:
                x1Var.dismiss();
                break;
            case 26:
                int i11 = e4.s3;
                break;
            default:
                e4.c2(new tc1(6, null));
                break;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        int i10 = q3.c2;
        return 0;
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ t(r.a aVar, int i10, w.b bVar) {
        this.a = 16;
    }

    @Override // qa.a
    public void i(qa.b bVar) {
    }
}
