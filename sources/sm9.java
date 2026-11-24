// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sm9 implements un9 {
    public final /* synthetic */ um9 a;

    public sm9(um9 um9Var) {
        this.a = um9Var;
    }

    @Override // un9
    public final void onRejoinRequested() {
        gl.c3(new zk9(this, (byte) 4));
    }

    @Override // un9
    public final void onStreamChannels(ArrayList arrayList) {
        gl.c3(new tj9(this, arrayList, (byte) 9));
    }
}
