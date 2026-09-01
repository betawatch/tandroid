package qh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ c6(k6 k6Var, int i10) {
        this.a = i10;
        this.b = k6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                k6 k6Var = this.b;
                MessagesController.SavedMusicList savedMusicList = k6Var.b0;
                x51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(j51.C(AndroidUtilities.dp(64.0f)));
                if (k6Var.W || k6Var.e0) {
                    dp += k6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), k6Var.Y, false, false, -1);
                }
                if (!k6Var.W) {
                    if (TextUtils.isEmpty(k6Var.p0) && !k6Var.e0) {
                        x51Var.U();
                        j51 c3 = j51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.q = true;
                        arrayList.add(c3);
                        x51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!k6Var.e0 && savedMusicList != null) {
                        dp += k6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + k6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), k6Var.Z, k6Var.t0 || k6Var.s0, k6Var.r0, 3) + k6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), k6Var.a0, k6Var.A0 || k6Var.z0, k6Var.y0, 4);
                }
                if (arrayList.size() <= ((k6Var.W || !TextUtils.isEmpty(k6Var.p0) || k6Var.e0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(k6Var.p0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = vi.a;
                        j51 J = j51.J(vi.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(k6Var.p0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, k6Var.p0));
                        int i11 = vi.a;
                        j51 J2 = j51.J(vi.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(j51.B(null));
                arrayList.add(j51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                k6.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
