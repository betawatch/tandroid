// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sm9 implements un9 {
    public final /* synthetic */ um9 a;

    public sm9(um9 um9Var) {
        this.a = um9Var;
    }

    @Override // un9
    public final void onRejoinRequested() {
        gl.d3(new zk9(this, (byte) 4));
    }

    @Override // un9
    public final void onStreamChannels(ArrayList arrayList) {
        gl.d3(new tj9(this, arrayList, (byte) 9));
    }
}
