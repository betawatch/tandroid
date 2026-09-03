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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ b6(i6 i6Var, int i10) {
        this.a = i10;
        this.b = i6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                i6 i6Var = this.b;
                MessagesController.SavedMusicList savedMusicList = i6Var.b0;
                w51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(h51.C(AndroidUtilities.dp(64.0f)));
                if (i6Var.W || i6Var.e0) {
                    dp += i6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), i6Var.Y, false, false, -1);
                }
                if (!i6Var.W) {
                    if (TextUtils.isEmpty(i6Var.p0) && !i6Var.e0) {
                        w51Var.U();
                        h51 c3 = h51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.q = true;
                        arrayList.add(c3);
                        w51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!i6Var.e0 && savedMusicList != null) {
                        dp += i6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + i6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), i6Var.Z, i6Var.t0 || i6Var.s0, i6Var.r0, 3) + i6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), i6Var.a0, i6Var.A0 || i6Var.z0, i6Var.y0, 4);
                }
                if (arrayList.size() <= ((i6Var.W || !TextUtils.isEmpty(i6Var.p0) || i6Var.e0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(i6Var.p0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = vi.a;
                        h51 J = h51.J(vi.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i6Var.p0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, i6Var.p0));
                        int i11 = vi.a;
                        h51 J2 = h51.J(vi.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(h51.B(null));
                arrayList.add(h51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                i6.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
