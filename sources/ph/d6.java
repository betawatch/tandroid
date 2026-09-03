package ph;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ d6(l6 l6Var, int i10) {
        this.a = i10;
        this.b = l6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                l6 l6Var = this.b;
                MessagesController.SavedMusicList savedMusicList = l6Var.b0;
                w51Var.B = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(i51.C(AndroidUtilities.dp(64.0f)));
                if (l6Var.W || l6Var.e0) {
                    dp += l6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), l6Var.Y, false, false, -1);
                }
                if (!l6Var.W) {
                    if (TextUtils.isEmpty(l6Var.p0) && !l6Var.e0) {
                        w51Var.U();
                        i51 c3 = i51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.q = true;
                        arrayList.add(c3);
                        w51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!l6Var.e0 && savedMusicList != null) {
                        dp += l6Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + l6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), l6Var.Z, l6Var.t0 || l6Var.s0, l6Var.r0, 3) + l6Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), l6Var.a0, l6Var.A0 || l6Var.z0, l6Var.y0, 4);
                }
                if (arrayList.size() <= ((l6Var.W || !TextUtils.isEmpty(l6Var.p0) || l6Var.e0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(l6Var.p0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = ui.a;
                        i51 J = i51.J(ui.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(l6Var.p0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, l6Var.p0));
                        int i11 = ui.a;
                        i51 J2 = i51.J(ui.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(i51.B(null));
                arrayList.add(i51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                l6.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
