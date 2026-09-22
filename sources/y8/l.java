package y8;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class l extends l6.a implements x8.f {
    @Override // x8.f
    public final String a() {
        DataHolder dataHolder = this.a;
        int i10 = this.b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.c].getString(i10, dataHolder.c.getInt("asset_key"));
    }

    @Override // x8.f
    public final String getId() {
        DataHolder dataHolder = this.a;
        int i10 = this.b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.c].getString(i10, dataHolder.c.getInt("asset_id"));
    }
}
