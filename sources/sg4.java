// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sg4 extends vea {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ c79 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg4(tg4 tg4Var, Context context) {
        super(1, null, context);
        this.m0 = (byte) 0;
        this.n0 = tg4Var;
    }

    @Override // vea
    public final boolean d(r47 r47Var) {
        long playlistTopicId;
        long playlistTopicId2;
        byte b = this.m0;
        c79 c79Var = this.n0;
        switch (b) {
            case 0:
                yg4 yg4Var = ((tg4) c79Var).w;
                if (r47.Q4(r47Var.k) || r47Var.g4()) {
                    boolean V = MediaController.z().V(r47Var);
                    MediaController.z().u0(V ? yg4Var.f : null, false);
                    return V;
                }
                if (!r47Var.I3()) {
                    return false;
                }
                String str = yg4Var.R;
                long j = yg4Var.F;
                long j2 = yg4Var.I;
                oo6 oo6Var = new oo6(str, j, j2, j2, yg4Var.E);
                oo6Var.g = yg4Var.O;
                oo6Var.h = yg4Var.w;
                oo6Var.f = yg4Var.P;
                oo6Var.i = yg4Var.K;
                return MediaController.z().q0(yg4Var.f, r47Var, 0L, true, oo6Var, 0L);
            case 1:
                bia biaVar = (bia) c79Var;
                if (r47.Q4(r47Var.k) || r47Var.g4()) {
                    boolean V2 = MediaController.z().V(r47Var);
                    MediaController.z().u0(V2 ? biaVar.d : null, false);
                    if (r47Var.g4()) {
                        MediaController.z().m0(false);
                    }
                    return V2;
                }
                if (!r47Var.I3()) {
                    return false;
                }
                MediaController z = MediaController.z();
                ArrayList arrayList = biaVar.d;
                eja ejaVar = biaVar.w;
                long j3 = ejaVar.f1;
                playlistTopicId = ejaVar.getPlaylistTopicId();
                return z.q0(arrayList, r47Var, j3, true, null, playlistTopicId);
            default:
                ria riaVar = (ria) c79Var;
                byte b2 = riaVar.d;
                eja ejaVar2 = riaVar.f;
                if (r47.Q4(r47Var.k) || r47Var.g4()) {
                    boolean V3 = MediaController.z().V(r47Var);
                    MediaController.z().u0(V3 ? ejaVar2.w1[b2].a : null, false);
                    return V3;
                }
                if (!r47Var.I3()) {
                    return false;
                }
                MediaController z2 = MediaController.z();
                ArrayList arrayList2 = ejaVar2.w1[b2].a;
                long j4 = ejaVar2.f1;
                playlistTopicId2 = ejaVar2.getPlaylistTopicId();
                return z2.q0(arrayList2, r47Var, j4, true, null, playlistTopicId2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg4(c79 c79Var, Context context, vnb vnbVar, byte b) {
        super(0, vnbVar, context);
        this.m0 = b;
        this.n0 = c79Var;
    }
}
