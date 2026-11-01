package th;

import android.content.Context;
import org.telegram.messenger.r20;
import rh.v8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n extends v8 {
    public final /* synthetic */ r20[] m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, b bVar, r20[] r20VarArr) {
        super(context, bVar);
        this.m0 = r20VarArr;
    }

    @Override // rh.v8
    public final void e(int i10) {
        this.m0[0].a(Integer.valueOf(i10));
    }
}
