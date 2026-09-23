package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class z31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((a41) this.b).dismiss();
                break;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 2:
                ((k41) this.b).dismiss();
                break;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.r;
                        if (e4Var.V) {
                            e4Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 4:
                j71 j71Var = (j71) this.b;
                if (j71Var.a0 instanceof TLRPC.User) {
                    ci.d dVar = j71Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        j71Var.T((TLRPC.User) j71Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 5:
                j81.a((j81) this.b);
                break;
            case 6:
                ((de1) this.b).c(true);
                break;
            case 7:
                ((de1) ((bw0) this.b).c).c(true);
                break;
            case 8:
                le1 le1Var = (le1) this.b;
                ArrayList arrayList = le1Var.f;
                HashSet hashSet = le1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    le1Var.finishFragment();
                    break;
                }
                break;
            default:
                ej1 ej1Var = (ej1) this.b;
                ej1Var.a.c(!r0.b(), true);
                ej1Var.c.setEnabled(ej1Var.a.b());
                ej1Var.c.animate().alpha(ej1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
