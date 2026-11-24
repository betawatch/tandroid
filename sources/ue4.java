// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ue4 extends eba {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ n39 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue4(ve4 ve4Var, Context context) {
        super(1, null, context);
        this.m0 = (byte) 0;
        this.n0 = ve4Var;
    }

    @Override // eba
    public final boolean d(k27 k27Var) {
        long playlistTopicId;
        long playlistTopicId2;
        byte b = this.m0;
        n39 n39Var = this.n0;
        switch (b) {
            case 0:
                af4 af4Var = ((ve4) n39Var).w;
                if (k27.Q4(k27Var.k) || k27Var.g4()) {
                    boolean R = MediaController.w().R(k27Var);
                    MediaController.w().q0(R ? af4Var.f : null, false);
                    return R;
                }
                if (!k27Var.I3()) {
                    return false;
                }
                String str = af4Var.R;
                long j = af4Var.F;
                long j2 = af4Var.I;
                km6 km6Var = new km6(str, j, j2, j2, af4Var.E);
                km6Var.g = af4Var.O;
                km6Var.h = af4Var.w;
                km6Var.f = af4Var.P;
                km6Var.i = af4Var.K;
                return MediaController.w().n0(af4Var.f, k27Var, 0L, true, km6Var, 0L);
            case 1:
                kea keaVar = (kea) n39Var;
                if (k27.Q4(k27Var.k) || k27Var.g4()) {
                    boolean R2 = MediaController.w().R(k27Var);
                    MediaController.w().q0(R2 ? keaVar.d : null, false);
                    if (k27Var.g4()) {
                        MediaController.w().j0(false);
                    }
                    return R2;
                }
                if (!k27Var.I3()) {
                    return false;
                }
                MediaController w = MediaController.w();
                ArrayList arrayList = keaVar.d;
                nfa nfaVar = keaVar.w;
                long j3 = nfaVar.f1;
                playlistTopicId = nfaVar.getPlaylistTopicId();
                return w.n0(arrayList, k27Var, j3, true, null, playlistTopicId);
            default:
                afa afaVar = (afa) n39Var;
                byte b2 = afaVar.d;
                nfa nfaVar2 = afaVar.f;
                if (k27.Q4(k27Var.k) || k27Var.g4()) {
                    boolean R3 = MediaController.w().R(k27Var);
                    MediaController.w().q0(R3 ? nfaVar2.w1[b2].a : null, false);
                    return R3;
                }
                if (!k27Var.I3()) {
                    return false;
                }
                MediaController w2 = MediaController.w();
                ArrayList arrayList2 = nfaVar2.w1[b2].a;
                long j4 = nfaVar2.f1;
                playlistTopicId2 = nfaVar2.getPlaylistTopicId();
                return w2.n0(arrayList2, k27Var, j4, true, null, playlistTopicId2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue4(n39 n39Var, Context context, wjb wjbVar, byte b) {
        super(0, wjbVar, context);
        this.m0 = b;
        this.n0 = n39Var;
    }
}
