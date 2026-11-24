// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wg4 extends eda {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ q59 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg4(xg4 xg4Var, Context context) {
        super(1, null, context);
        this.m0 = (byte) 0;
        this.n0 = xg4Var;
    }

    @Override // eda
    public final boolean d(k47 k47Var) {
        long playlistTopicId;
        long playlistTopicId2;
        byte b = this.m0;
        q59 q59Var = this.n0;
        switch (b) {
            case 0:
                ch4 ch4Var = ((xg4) q59Var).w;
                if (k47.Q4(k47Var.k) || k47Var.g4()) {
                    boolean R = MediaController.w().R(k47Var);
                    MediaController.w().q0(R ? ch4Var.f : null, false);
                    return R;
                }
                if (!k47Var.I3()) {
                    return false;
                }
                String str = ch4Var.R;
                long j = ch4Var.F;
                long j2 = ch4Var.I;
                ko6 ko6Var = new ko6(str, j, j2, j2, ch4Var.E);
                ko6Var.g = ch4Var.O;
                ko6Var.h = ch4Var.w;
                ko6Var.f = ch4Var.P;
                ko6Var.i = ch4Var.K;
                return MediaController.w().n0(ch4Var.f, k47Var, 0L, true, ko6Var, 0L);
            case 1:
                kga kgaVar = (kga) q59Var;
                if (k47.Q4(k47Var.k) || k47Var.g4()) {
                    boolean R2 = MediaController.w().R(k47Var);
                    MediaController.w().q0(R2 ? kgaVar.d : null, false);
                    if (k47Var.g4()) {
                        MediaController.w().j0(false);
                    }
                    return R2;
                }
                if (!k47Var.I3()) {
                    return false;
                }
                MediaController w = MediaController.w();
                ArrayList arrayList = kgaVar.d;
                nha nhaVar = kgaVar.w;
                long j3 = nhaVar.f1;
                playlistTopicId = nhaVar.getPlaylistTopicId();
                return w.n0(arrayList, k47Var, j3, true, null, playlistTopicId);
            default:
                aha ahaVar = (aha) q59Var;
                byte b2 = ahaVar.d;
                nha nhaVar2 = ahaVar.f;
                if (k47.Q4(k47Var.k) || k47Var.g4()) {
                    boolean R3 = MediaController.w().R(k47Var);
                    MediaController.w().q0(R3 ? nhaVar2.w1[b2].a : null, false);
                    return R3;
                }
                if (!k47Var.I3()) {
                    return false;
                }
                MediaController w2 = MediaController.w();
                ArrayList arrayList2 = nhaVar2.w1[b2].a;
                long j4 = nhaVar2.f1;
                playlistTopicId2 = nhaVar2.getPlaylistTopicId();
                return w2.n0(arrayList2, k47Var, j4, true, null, playlistTopicId2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg4(q59 q59Var, Context context, ylb ylbVar, byte b) {
        super(0, ylbVar, context);
        this.m0 = b;
        this.n0 = q59Var;
    }
}
